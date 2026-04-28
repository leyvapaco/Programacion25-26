package ud7.ejemplosJSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeerTrenesJSON {

    public static void main(String[] args) {
        String fichero = "C:\\Users\\leyva\\ficheros\\trenes.json";

        Gson gson = new Gson();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fichero),
                        StandardCharsets.UTF_8))) {

        	// Convierte el JSON en una List<Tren>; TypeToken evita que se pierda el tipo genérico
            List<Tren> lista = gson.fromJson(br,
                    new TypeToken<List<Tren>>(){}.getType());

            System.out.println("Trenes leídos del JSON:");
            for (Tren t : lista) {
                System.out.println(t);
            }

        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
