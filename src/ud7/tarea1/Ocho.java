package ud7.tarea1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ocho {

    public static void main(String[] args) {
    	String ruta = "C:\\Users\\Usuario\\Desktop\\ProgramacionFicheros\\";
        String[] nombres1 = leerNombres(ruta+"persona1.txt");
        String[] nombres2 = leerNombres(ruta+"persona2.txt");

        String[] nombresOrdenados = ordenarArrays(nombres1, nombres2);

        escribirNombresOrdenados(ruta+"todos.txt", nombresOrdenados);
    }

    private static String[] leerNombres(String nombreArchivo) {
        String[] nombres = null;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int totalLineas = contarLineas(nombreArchivo);
            nombres = new String[totalLineas];
            int i = 0;
            while ((linea = br.readLine()) != null) {
                nombres[i] = linea;
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo '" + nombreArchivo + "': " + e.getMessage());
        }
        return nombres;
    }

    private static int contarLineas(String nombreArchivo) {
        int totalLineas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            while (br.readLine() != null) {
                totalLineas++;
            }
        } catch (IOException e) {
            System.err.println("Error al contar las líneas del archivo '" + nombreArchivo + "': " + e.getMessage());
        }
        return totalLineas;
    }

    private static String[] ordenarArrays(String[] nombres1, String[] nombres2) {
        String[] nombresOrdenados = new String[nombres1.length + nombres2.length];
        int i = 0, j = 0, k = 0;
        while (i < nombres1.length && j < nombres2.length) {
            if (nombres1[i].compareTo(nombres2[j]) <= 0) {
                nombresOrdenados[k] = nombres1[i];
                i++;
            } else {
                nombresOrdenados[k] = nombres2[j];
                j++;
            }
            k++;
        }
        while (i < nombres1.length) {
            nombresOrdenados[k] = nombres1[i];
            i++;
            k++;
        }
        while (j < nombres2.length) {
            nombresOrdenados[k] = nombres2[j];
            j++;
            k++;
        }
        return nombresOrdenados;
    }

    private static void escribirNombresOrdenados(String nombreArchivo, String[] nombresOrdenados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String nombre : nombresOrdenados) {
                bw.write(nombre);
                bw.newLine();
            }
            System.out.println("Los nombres se han escrito correctamente en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo '" + nombreArchivo + "': " + e.getMessage());
        }
    }
}

