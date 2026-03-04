package ud6;

import java.util.*;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> nombres = new TreeSet<>();
        String entrada = "";

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (!entrada.equalsIgnoreCase("fin")) {
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                nombres.add(entrada);
            }
        }

        System.out.println("\nNombres ordenados alfabéticamente:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
