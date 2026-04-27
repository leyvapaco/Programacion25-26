package ud7.ejemplosJSON;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LeerPersona {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\leyva\\ficheros\\persona.json"),
                        StandardCharsets.UTF_8))) {

            Persona p = gson.fromJson(br, Persona.class);

            System.out.println("Nombre: " + p.nombre);
            System.out.println("Edad: " + p.edad);

        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}

