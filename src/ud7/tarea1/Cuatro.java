package ud7.tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cuatro {
    public static void main(String[] args) {
        // Definir el nombre del archivo de texto
    	 String ruta = "C:\\Users\\leyva\\ficheros\\";
        String nombreArchivo = ruta +"carta.txt";

        // Variables para contar caracteres, líneas y palabras
        int contadorCaracteres = 0;
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Contar caracteres
                contadorCaracteres += linea.length();
                
                // Contar palabras
                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;

                // Contar líneas
                contadorLineas++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Mostrar resultados
        System.out.println("Número de caracteres: " + contadorCaracteres);
        System.out.println("Número de líneas: " + contadorLineas);
        System.out.println("Número de palabras: " + contadorPalabras);
    }
}

