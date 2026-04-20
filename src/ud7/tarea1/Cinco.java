package ud7.tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cinco {
    public static void main(String[] args) {
        // Definir el nombre del archivo de texto
    	 String ruta = "C:\\Users\\leyva\\ficheros\\";
        String nombreArchivo = ruta + "numeros.txt";

        // Variables para el número mayor y el número menor
        int elMayor = Integer.MIN_VALUE;
        int elMenor = Integer.MAX_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Convertir la línea a entero
                int numeroLeido = Integer.parseInt(linea);

                // Actualizar el número mayor y el número menor
                if (numeroLeido > elMayor) {
                    elMayor = numeroLeido;
                }
                if (numeroLeido < elMenor) {
                    elMenor = numeroLeido;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.err.println("El archivo contiene un valor no numérico: " + e.getMessage());
            return;
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + elMayor);
        System.out.println("El número menor es: " + elMenor);
    }
}

