package ud6.streams;

import java.util.List;
import java.util.stream.Collectors;

//Dada una lista de enteros, obtén otra lista que contenga solo los números pares usando Streams.

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 8);

        List<Integer> pares = numeros.stream()
                .filter(n -> (n % 2 == 0)&&(n>4))
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
    }
}
