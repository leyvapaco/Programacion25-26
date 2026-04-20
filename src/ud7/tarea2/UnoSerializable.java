package ud7.tarea2;

import java.io.*;
import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UnoSerializable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal (double, ejemplo 4,1): ");
        double numero = scanner.nextDouble();

        String fichero = "C:\\Users\\leyva\\ficheros\\numeroSerializable.dat";

        Numero obj = new Numero(numero);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(obj);
            System.out.println("El número se ha guardado correctamente como objeto.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        scanner.close();
    }
}
