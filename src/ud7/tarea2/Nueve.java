package ud7.tarea2;

import java.io.*;

public class Nueve{
	
public static void main(String[] args) {
    String ruta = "C:\\Users\\leyva\\ficheros\\";
    String archivo = ruta + "trenes.dat";

    // Creamos algunos objetos de tipo Tren
    Tren tren1 = new Tren("Ave", 500);
    Tren tren2 = new Tren("Cercanias", 150);
    Tren tren3 = new Tren("Metro", 100);

    // Escribimos los objetos en el archivo binario
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
        oos.writeObject(tren1);
        oos.writeObject(tren2);
        oos.writeObject(tren3);
        System.out.println("Objetos Tren guardados correctamente en el archivo: " + archivo);
    } catch (IOException e) {
        System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
    }

    // Leemos los objetos del archivo binario y los mostramos por pantalla
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
        System.out.println("Objetos Tren recuperados del archivo:");
        try {
            while (true) {
                Tren trenRecuperado = (Tren) ois.readObject();
                System.out.println(trenRecuperado);
            }
        } catch (EOFException e) {
            // Se alcanzó el final del archivo
        }
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
    }
}
}
