package ud7.tarea2;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DosSerializable {

    public static void main(String[] args) {

        String fichero = "C:\\Users\\leyva\\ficheros\\numeroSerializable.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

            Numero obj = (Numero) ois.readObject();   // leer el objeto
            System.out.println("Número leído del fichero: " + obj);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo binario: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Clase Numero no encontrada al deserializar.");
        }
    }
}
