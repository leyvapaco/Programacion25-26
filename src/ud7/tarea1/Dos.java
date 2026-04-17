package ud7.tarea1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Dos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Pedir al usuario su nombre y edad
			System.out.println("Introduce tu nombre:");
			String nombre = scanner.nextLine();

			System.out.println("Introduce tu edad:");
			int edad = scanner.nextInt();

			// Guardar los datos en el archivo "datos.txt"
			try {
			    File archivo = new File("C:\\Users\\leyva\\ficheros\\ejercicio2.txt");
			    if (archivo.exists()) {
			        archivo.delete(); // Borrar el contenido del archivo si ya existe
			    } else {
			        archivo.createNewFile(); // Crear el archivo si no existe
			    }

			    FileWriter fw = new FileWriter(archivo);
			    BufferedWriter bw = new BufferedWriter(fw);

			    bw.write("Nombre: " + nombre);
			    bw.newLine();
			    bw.write("Edad: " + edad);

			    bw.close();
			    System.out.println("Los datos se han guardado correctamente en el archivo ejercicio2.txt.");
			} catch (IOException e) {
			    System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
			}
		}
    }
}