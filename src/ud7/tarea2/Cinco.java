package ud7.tarea2;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Cinco {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\tabla.dat";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {

            System.out.println("Contenido del fichero:");

            // Cada double ocupa 8 bytes
            // dis.available() devuelve cuántos bytes quedan por leer sin bloquear en el DataInputStream
            while (dis.available() >= 8) {
                double valor = dis.readDouble();
                System.out.println(valor);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}

