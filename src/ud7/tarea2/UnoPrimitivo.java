package ud7.tarea2;

import java.io.*;
import java.util.Scanner;

public class UnoPrimitivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal (double, ejemplo 4,1): ");
        String fichero = "C:\\Users\\leyva\\ficheros\\numeroPrimitivo.dat";
        double numero = scanner.nextDouble();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))) {
            // Escribir el número double en el archivo binario
            dos.writeDouble(numero);
            System.out.println("El número se ha guardado correctamente");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        
    }
}
