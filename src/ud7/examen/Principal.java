package ud7.examen;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Principal {
    public static void main(String[] args) {

        // Crear 3 objetos individuales
        Cancion c1 = new Cancion("Weltita", 1200);
        Cancion c2 = new Cancion("NUEVAyol", 850);
        Cancion c3 = new Cancion("La chica de ayer", 430);

        // ---------------------------------------
        // Escritura binaria: objetos individuales
        // ---------------------------------------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("canciones.dat"))) {
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.writeObject(c3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------------------------------------
        // Lectura binaria con EOF 
        // ---------------------------------------
        System.out.println("Desde binario:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("canciones.dat"))) {

            boolean fin = false;
            while (!fin) {
                try {
                    Cancion leida = (Cancion) ois.readObject();
                    System.out.println(leida);
                } catch (EOFException e) {
                    fin = true; // fin de fichero
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // ---------------------------------------
        // Escritura JSON: lista completa con UTF8
        // ---------------------------------------
        List<Cancion> lista = Arrays.asList(c1, c2, c3);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("canciones.json"),
                        StandardCharsets.UTF_8)))
        {

            gson.toJson(lista, bw);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------------------------------------
        // Lectura JSON: lista completa con UTF8
        // ---------------------------------------
        System.out.println("\nDesde JSON:");
        	
        try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("canciones.json"),
                            StandardCharsets.UTF_8)))
            {

            List<Cancion> listaJson =
                    gson.fromJson(br, new TypeToken<List<Cancion>>(){}.getType());

            for (Cancion c : listaJson) {
                System.out.println(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


