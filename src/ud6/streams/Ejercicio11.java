package ud6.streams;

import java.util.Map;

//Dado un Map<String, Integer> con productos y ventas, muestra los 3 productos más vendidos.

public class Ejercicio11 {
    public static void main(String[] args) {
        Map<String, Integer> ventas = Map.of(
                "Libro", 120,
                "Cuaderno", 80,
                "Bolígrafo", 200,
                "Mochila", 150,
                "Regla", 60
        );

        ventas.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
