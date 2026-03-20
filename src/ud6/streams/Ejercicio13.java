package ud6.streams;

import java.util.Map;

//Mostrar sólo los aprobados

import java.util.Map;

public class Ejercicio13 {
    public static void main(String[] args) {
        Map<String, Integer> notas = Map.of(
                "Jorge", 2,
                "Héctor", 7,
                "Alonso", 3,
                "Irene", 8,
                "Paco", 4,
                "Rocío", 5
        );

        System.out.println("Aprobados:");
        notas.entrySet().stream()
                .filter(e -> e.getValue() >= 5) // solo aprobados
                .sorted((a, b) -> b.getValue() - a.getValue()) // opcional: orden descendente
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
