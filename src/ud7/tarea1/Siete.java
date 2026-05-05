package ud7.tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Siete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo:");
        String ruta = "C:\\Users\\Usuario\\Desktop\\ProgramacionFicheros\\";
        String nombreArchivo = ruta + scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int contadorLineas = 0;
            int lineasPorPagina = 24; // Número de líneas a mostrar por página

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorLineas++;

                // Si hemos mostrado el número de líneas por página, esperar la entrada del usuario para continuar
                if (contadorLineas % lineasPorPagina == 0) {
                    System.out.println("\nPresiona Enter para mostrar más líneas...");
                    System.in.read(); // Esperar a que el usuario presione Enter
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
