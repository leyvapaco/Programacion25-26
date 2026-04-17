package ud7.tarea1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Uno {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String ruta = "C:\\Users\\leyva\\ficheros\\";
            String nombreArchivo;

            System.out.println("Introduce el nombre del archivo de texto (o presiona Enter para utilizar \"prueba.txt\"): ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                nombreArchivo = ruta + "prueba.txt";
            } else {
                nombreArchivo = ruta + entrada;
            }

			// Intentar abrir y leer el archivo
			try {
			    FileReader fr = new FileReader(nombreArchivo);
			    BufferedReader br = new BufferedReader(fr);

			    String linea;
			    while ((linea = br.readLine()) != null) {
			        System.out.println(linea);
			    }

			    br.close();
			} catch (IOException e) {
			    System.err.println("Error al leer el archivo: " + e.getMessage());
			}
		}
    }
}
