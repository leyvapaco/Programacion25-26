package ud6;

import java.util.*;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase (solo palabras separadas por espacios):");
        String frase = sc.nextLine();

        // Convertimos la frase en lista de palabras
        List<String> palabras = Arrays.asList(frase.split(" "));

        Set<String> vistas = new HashSet<>();
        Set<String> repetidas = new HashSet<>();

        for (String p : palabras) {
            if (!vistas.add(p)) {
                repetidas.add(p);
            }
        }

        Set<String> noRepetidas = new HashSet<>(vistas);
        noRepetidas.removeAll(repetidas);

        System.out.println("\nPalabras repetidas:");
        for (String r : repetidas) {
            System.out.println(r);
        }

        System.out.println("\nPalabras NO repetidas:");
        for (String nr : noRepetidas) {
            System.out.println(nr);
        }
    }
}
