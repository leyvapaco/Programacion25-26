package ud6.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Dada una lista de listas de enteros, conviértela 
//  en una sola lista usando flatMap.

public class Ejercicio5 {
    public static void main(String[] args) {
        List<List<Integer>> matriz = List.of(
                List.of(1, 2),
                List.of(2, 4),
                List.of(5, 6)
        );

        Set<Integer> aplanada = matriz.stream()
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println("Lista aplanada: " + aplanada);
    }
}
