package ud7.tarea1;
import java.io.*;
import java.util.Scanner;

public class Tres {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo de origen: ");
        String archivoOrigen = scanner.nextLine(); //P.e feria.txt

        String ruta = "C:\\Users\\leyva\\ficheros\\";
        
        String archivoDestino = ruta + "copia_de_"+archivoOrigen;
        archivoOrigen = ruta + archivoOrigen; //Añadimos la ruta

        try (FileInputStream fis = new FileInputStream(archivoOrigen);
             FileOutputStream fos = new FileOutputStream(archivoDestino)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

         // La función read() coloca los bytes leídos en el búffer hasta fin de fichero (-1)
            while ((bytesRead = fis.read(buffer)) != -1) { 
            	// escribe en el archivo de destino (fos) los bytes leídos del archivo de origen
            	//y se escribe el número exacto de bytes que se leyeron (bytesRead). 
            	fos.write(buffer, 0, bytesRead);
            }

            System.out.println("El archivo se ha duplicado correctamente en la ruta especificada.");
        } catch (IOException e) {
            System.err.println("Error al duplicar el archivo: " + e.getMessage());
        } finally {
            scanner.close(); // Cerrar el scanner al finalizar
        }
    }
}