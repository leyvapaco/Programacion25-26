package ud7.tarea2;

import java.io.*;
import java.util.Arrays;

public class Cinco {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\leyva\\ficheros\\";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta + "tabla.bin"))) {
            // Leemos el número de elementos en la tabla
            int n = dis.available() / 8; // Cada número double ocupa 8 bytes

            // Creamos un array para almacenar los números
            double[] numeros = new double[n];

            // Leemos los números del archivo
            for (int i = 0; i < n; i++) {
                numeros[i] = dis.readDouble();
            }

            // Mostramos los números por consola
            System.out.println("Contenido de la tabla:");
            System.out.println(Arrays.toString(numeros));
        } catch (IOException e) {
            System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
        }
    }
}

