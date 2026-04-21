package ud7.tarea2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Seis {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\tabla.dat";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {

            System.out.println("Contenido del fichero:");

            boolean fin = false;
            while (!fin) {
                try {
                    double valor = dis.readDouble();
                    System.out.println(valor);
                } catch (EOFException e) {  // EOF: fin de fichero
                    fin = true;  
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}


