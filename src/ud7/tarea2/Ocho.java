package ud7.tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Ocho {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\aleatorios.dat";

        // Crear la tabla de números aleatorios menores que 100 y ordenarla
        Random random = new Random();
        int[] numeros = new int[10]; // Tamaño de la tabla
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }
        Arrays.sort(numeros);

        // Guardar los números en un archivo binario
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))) {
            for (int num : numeros) {
                dos.writeInt(num);
            }
            System.out.println("Números guardados correctamente en el fichero");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        // Recuperar los números del archivo y mostrarlos por consola
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {

        	System.out.println("Contenido del fichero:");
        	
            boolean fin = false;
            while (!fin) {
                try {
                    int valor = dis.readInt();
                    System.out.println(valor);
                } catch (EOFException e) {
                    fin = true;  // fin de fichero 
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
        }
    }
}
