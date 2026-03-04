package ud6;
import java.util.*;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> nombres = new LinkedHashSet<>(); //Para conservar orden de inserción
        String entrada = "";

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (!entrada.equalsIgnoreCase("fin")) {
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                nombres.add(entrada);
            }
        }

        System.out.println("\nNombres introducidos:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
}

