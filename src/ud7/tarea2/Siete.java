package ud7.tarea2;

import java.io.*;
import java.util.Scanner;

public class Siete {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\frase.dat";
        Scanner scanner = new Scanner(System.in);

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))) {
			    // Solicitar al usuario que escriba una frase
			    System.out.print("Escribe una frase: ");
			    String frase = scanner.nextLine();

			    // UTF8 es un sistema de codificación de caracteres 
			    // Es el estándar dominante para texto en ficheros, redes, bases de datos y prácticamente toda la web.
			    // Alternativa. Usar ObjectOutputStream: oos.writeObject(texto);
			    dos.writeUTF(frase);


			    System.out.println("Frase guardada correctamente en el archivo.");

		} catch (IOException e) {
			    System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
		}
			
		    // Recuperar la frase del archivo
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
		        // Leer la frase del archivo
		        String fraseRecuperada = dis.readUTF();
		        System.out.println("Frase recuperada del archivo: " + fraseRecuperada);
		} catch (IOException e) {
		        System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
		}
	
    }
}

