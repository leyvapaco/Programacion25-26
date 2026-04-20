package ud7.tarea2;

import java.io.*;

//OJO este debería almacenar una tabla de doubles, no los doubles de forma individual

import java.util.Scanner;

public class Cuatro {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\leyva\\ficheros\\";

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Introduce un número entero n: ");
			int n = scanner.nextInt();

			double[] numeros = new double[n];

			for (int i = 0; i < n; i++) {
			    System.out.print("Introduce el número double " + (i + 1) + ": ");
			    numeros[i] = scanner.nextDouble();
			}

			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta + "tabla.bin"))) {
			    for (double numero : numeros) {
			        dos.writeDouble(numero);
			    }
			    System.out.println("Tabla de números guardada correctamente en el archivo 'tabla.bin'.");
			} catch (IOException e) {
			    System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
			}
		} 
    }
}

