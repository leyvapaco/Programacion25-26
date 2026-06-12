package ra6.recuperacion.junio2.dorsales;

import java.util.*;

public class Principal2 {

    public static void main(String[] args) {

        Map<Integer, Set<Jugador>> dorsales = new HashMap<>();

        // Insertar jugadores 

        // Dorsal 10
        if (!dorsales.containsKey(10)) {
            dorsales.put(10, new TreeSet<>());
        }
        dorsales.get(10).add(new Jugador("Messi", "Argentina"));
        dorsales.get(10).add(new Jugador("Modric", "Croacia"));

        // Dorsal 7
        if (!dorsales.containsKey(7)) {
            dorsales.put(7, new TreeSet<>());
        }
        dorsales.get(7).add(new Jugador("Cristiano", "Portugal"));
        dorsales.get(7).add(new Jugador("Mbappe", "Francia"));

        // Dorsal 1
        if (!dorsales.containsKey(1)) {
            dorsales.put(1, new TreeSet<>());
        }
        dorsales.get(1).add(new Jugador("Neuer", "Alemania"));
        dorsales.get(1).add(new Jugador("Dida", "Brasil"));
        dorsales.get(1).add(new Jugador("Unai Simón", "España"));


        // Mostrar todo OPCIÓN 1
        System.out.println("=== Dorsales y jugadores OPCION 1 ===");
        for (Map.Entry<Integer, Set<Jugador>> e : dorsales.entrySet()) {
            System.out.println("Dorsal " + e.getKey() + ": " + e.getValue());
        }

        // Mostrar todo OPCIÓN 2
        System.out.println("\n=== Dorsales y jugadores OPCION 2 ===");
        for (Integer dorsal : dorsales.keySet()) {
            Set<Jugador> jugadores = dorsales.get(dorsal);

            System.out.print("Dorsal " + dorsal + ": ");
            for (Jugador j : jugadores) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Dorsal con más jugadores OPCIÓN 1
        int dorsalMax = -1;
        int max = -1;

        for (Map.Entry<Integer, Set<Jugador>> e : dorsales.entrySet()) {
            if (e.getValue().size() > max) {
                max = e.getValue().size();
                dorsalMax = e.getKey();
            }
        }

        System.out.println("\nDorsal con más jugadores (Opción 1): " + dorsalMax);


        // Dorsal con más jugadores OPCIÓN 2
        dorsalMax = -1;
        max = -1;

        for (Integer dorsal : dorsales.keySet()) {
            int cantidad = dorsales.get(dorsal).size();

            if (cantidad > max) {
                max = cantidad;
                dorsalMax = dorsal;
            }
        }

        System.out.println("\nDorsal con más jugadores (Opción 2): " + dorsalMax);

        // Jugadores del dorsal 10
        System.out.println("\nJugadores del dorsal 10: " + dorsales.get(10));
    }
}
