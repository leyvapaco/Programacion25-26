package ud7.tarea2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NueveTrenLista {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\leyva\\ficheros\\";
        String archivo = ruta + "trenesLista.dat";

        // Creamos una lista de trenes
        List<Tren> listaTrenes = new ArrayList<>();
        listaTrenes.add(new Tren("Ave", 500));
        listaTrenes.add(new Tren("Cercanias", 150));
        listaTrenes.add(new Tren("Metro", 100));

        // Escribimos la lista completa en el archivo binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {

            // Guardamos la lista entera como un único objeto
            oos.writeObject(listaTrenes);

            System.out.println("Lista de trenes guardada correctamente en el archivo: " + archivo);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        // Leemos la lista del archivo binario
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {

            System.out.println("Lista de trenes recuperada del archivo:");

            List<Tren> listaRecuperada = (List<Tren>) ois.readObject();

            for (Tren t : listaRecuperada) {
                System.out.println(t);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo binario: " + e.getMessage());
        }
    }
}
