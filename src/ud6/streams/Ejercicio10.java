package ud6.streams;

import java.util.Map;
import java.util.stream.Collectors;

//Dado un Map<String, Integer>, crea otro Map<Integer, String> invirtiendo claves y valores.

public class Ejercicio10 {
    public static void main(String[] args) {
        Map<String, Integer> original = Map.of(
                "Uno", 1,
                "Dos", 2,
                "Tres", 3
        );

        Map<Integer, String> invertido = original.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey
                ));

        System.out.println("Mapa invertido: " + invertido);
    }
}
