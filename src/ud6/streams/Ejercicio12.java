package ud6.streams;

import java.util.Map;

//Dado un Map de alumnos y notas, ordénalo por nota de mayor a menor.

public class Ejercicio12 {
    public static void main(String[] args) {
        Map<String, Integer> notas = Map.of(
                "Ana", 7,
                "Héctor", 9,
                "Alonso", 6,
                "Irene", 8
        );

        notas.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
