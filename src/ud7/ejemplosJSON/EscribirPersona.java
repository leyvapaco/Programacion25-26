package ud7.ejemplosJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class EscribirPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Lola", 25);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("C:\\Users\\leyva\\ficheros\\persona.json"),
                        StandardCharsets.UTF_8))) {

            gson.toJson(persona, bw);
            System.out.println("JSON escrito correctamente.");

        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}
