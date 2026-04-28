package ud7.tarea3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        String json = generarJSON();
        System.out.println("JSON generado:");
        System.out.println(json);

        procesarJSON(json);
    }


    // MÉTODO 1: Generar JSON desde la alineación

    public static String generarJSON() {

        ArrayList<Futbolista> alineacion = new ArrayList<>();

        alineacion.add(new Futbolista(1, "Casillas",
                Arrays.asList("Portero"), "Real Madrid"));

        alineacion.add(new Futbolista(15, "Ramos",
                Arrays.asList("Lateral derecho", "Medio centro"), "Real Madrid"));

        alineacion.add(new Futbolista(3, "Pique",
                Arrays.asList("Central"), "FC Barcelona"));

        alineacion.add(new Futbolista(5, "Puyol",
                Arrays.asList("Central"), "FC Barcelona"));

        alineacion.add(new Futbolista(11, "Capdevila",
                Arrays.asList("Lateral izquierdo"), "Villareal"));

        alineacion.add(new Futbolista(14, "Xabi Alonso",
                Arrays.asList("Defensa mediocampo", "Mediocampo"), "Real Madrid"));

        alineacion.add(new Futbolista(16, "Busquets",
                Arrays.asList("Defensa mediocampo"), "FC Barcelona"));

        alineacion.add(new Futbolista(8, "Xavi Hernandez",
                Arrays.asList("Mediocampo"), "FC Barcelona"));

        alineacion.add(new Futbolista(18, "Pedrito",
                Arrays.asList("Extremo izquierdo", "Falso extremo"), "FC Barcelona"));

        alineacion.add(new Futbolista(6, "Iniesta",
                Arrays.asList("Extremo derecho", "Mediocampo"), "FC Barcelona"));

        alineacion.add(new Futbolista(7, "Villa",
                Arrays.asList("Delantero centro"), "FC Barcelona"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(alineacion);
    }


    // MÉTODO 2: Procesar JSON y obtener demarcaciones de Iniesta

    public static void procesarJSON(String json) {

        Gson gson = new Gson();

        ArrayList<Futbolista> alineacion =
                gson.fromJson(json, new TypeToken<ArrayList<Futbolista>>(){}.getType());

        // Sabemos que Iniesta es el 10º jugador añadido → índice 9
        Futbolista iniesta = alineacion.get(9);

        ArrayList<String> demarcacionesIniesta =
                new ArrayList<>(iniesta.getDemarcaciones());

        System.out.println("\nDemarcaciones de Iniesta:");
        for (String d : demarcacionesIniesta) {
            System.out.println("- " + d);
        }
    }
}

