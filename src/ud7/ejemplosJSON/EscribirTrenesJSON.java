package ud7.ejemplosJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class EscribirTrenesJSON {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\trenes.json";

        List<Tren> lista = new ArrayList<>();
        lista.add(new Tren("Talgo 350", 10));
        lista.add(new Tren("AVE S-103", 8));
        lista.add(new Tren("Cercanías Civia", 5));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fichero),
                        StandardCharsets.UTF_8))) {

            gson.toJson(lista, bw);
            System.out.println("Fichero JSON escrito en modo buffer correctamente.");

        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}
