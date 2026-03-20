package ud6.streams;

import java.util.List;

//Dada una lista de palabras, generar una nueva lista que contenga 
// la longitud de cada palabra usando map y lambdas.

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("sol", "montaña", "cielo", "árbol");

        List<Integer> longitudes = palabras.stream()
                .map(p -> p.length())
                .toList();

        System.out.println("Longitudes: " + longitudes);
    }
}
