package ud7.tarea1;

import java.io.*;
import java.util.Scanner;

public class Seis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el nombre del archivo de texto
        String ruta = "C:\\Users\\leyva\\ficheros\\";
        String nombreArchivo = ruta +"firmas.txt";

        // Verificar si el archivo existe, si no existe, crearlo
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("El archivo 'firmas.txt' ha sido creado.");
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
                return;
            }
        }

        // Mostrar el contenido actual del libro de firmas
        System.out.println("Libro de Firmas:");
        mostrarLibroDeFirmas(nombreArchivo);

        // Solicitar nueva firma
        System.out.println("\nIntroduce un nuevo nombre para firmar (o presiona Enter para salir):");
        String nuevaFirma = scanner.nextLine().trim();

        // Insertar la nueva firma si no está repetida
        if (!nuevaFirma.isEmpty()) {
            if (!existeFirma(nombreArchivo, nuevaFirma)) {
                agregarFirma(nombreArchivo, nuevaFirma);
                System.out.println("Firma agregada correctamente.");
            } else {
                System.out.println("El nombre ya está firmado en el libro.");
            }
        }

        scanner.close();
    }

    // Método para mostrar el contenido actual del libro de firmas
    private static void mostrarLibroDeFirmas(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para verificar si una firma ya existe en el libro de firmas
    private static boolean existeFirma(String nombreArchivo, String nuevaFirma) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.equals(nuevaFirma)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;
    }

    // Método para agregar una nueva firma al libro de firmas
    private static void agregarFirma(String nombreArchivo, String nuevaFirma) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo, true))) {
            writer.println(nuevaFirma);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}