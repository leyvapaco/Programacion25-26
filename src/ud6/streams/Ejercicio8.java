package ud6.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Dada una lista de palabras, crea un Map<String, Integer> 
//donde la clave sea la palabra y el valor su longitud.

public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Java", "Stream", "Colecciones", "Mapa");

        Map<String, Integer> mapa = palabras.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> p.length()
                ));

        System.out.println("Mapa palabra → longitud: " + mapa);
    }
}
