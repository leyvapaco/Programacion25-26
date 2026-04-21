package ud7.tarea2;

import java.io.*;
import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\leyva\\ficheros\\";

        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta + "numeros.bin"))) {
            int numero;

            System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");
            while ((numero = scanner.nextInt()) >= 0) {
                dos.writeInt(numero);
            }

            System.out.println("Números leídos del archivo:");
            try (DataInputStream dis = new DataInputStream(new FileInputStream(ruta + "numeros.bin"))) {
                int num;
                while (dis.available() > 0) {
                    num = dis.readInt();
                    System.out.println(num);
                }
            } catch (IOException e) {
                System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

