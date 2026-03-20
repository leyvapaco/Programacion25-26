package ud6.streams;

import java.util.Map;
import java.util.stream.Collectors;

//Dado un Map<String, Integer> con productos y precios, 
//obtén otro Map solo con los productos que cuesten más de 10.

public class Ejercicio9 {
    public static void main(String[] args) {
        Map<String, Integer> productos = Map.of(
                "Pan", 3,
                "Queso", 12,
                "Carne", 20,
                "Agua", 1
        );

        Map<String, Integer> filtrado = productos.entrySet().stream()
                .filter(e -> e.getValue() > 10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println("Productos > 10€: " + filtrado);
    }
}
