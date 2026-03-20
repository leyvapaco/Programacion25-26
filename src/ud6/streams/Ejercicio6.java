package ud6.streams;

import java.util.List;
import java.util.stream.Collectors;

//Dada una lista con números repetidos, crea otra lista
//sin duplicados usando distinct().

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> sinDuplicados = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Sin duplicados: " + sinDuplicados);
    }
}
