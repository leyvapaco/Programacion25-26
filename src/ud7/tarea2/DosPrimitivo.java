package ud7.tarea2;

import java.io.*;

public class DosPrimitivo {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\numeroPrimitivo.dat";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
            // Leer el número double desde el archivo binario
            double numero = dis.readDouble();
            System.out.println("Número leído desde el archivo: " + numero);
        } catch (IOException e) {
            System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
        }
    }
}

