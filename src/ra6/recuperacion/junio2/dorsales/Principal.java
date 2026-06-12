package ra6.recuperacion.junio2.dorsales;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Map<Integer, Set<Jugador>> dorsales = new HashMap<>();
             
        // Insertar jugadores
        inserta(dorsales, 10, new Jugador("Messi", "Argentina"));
        inserta(dorsales, 10, new Jugador("Modric", "Croacia"));
        inserta(dorsales, 7, new Jugador("Cristiano", "Portugal"));
        inserta(dorsales, 7, new Jugador("Mbappe", "Francia"));
        inserta(dorsales, 1, new Jugador("Neuer", "Alemania"));
        inserta(dorsales, 1, new Jugador("Dida", "Brasil"));
        inserta(dorsales, 1, new Jugador("Unai Simón", "España"));

        // Mostrar todo OPCION 1
        System.out.println("=== Dorsales y jugadores OPCION 1===");
        for (Map.Entry<Integer, Set<Jugador>> e : dorsales.entrySet()) {
            System.out.println("Dorsal " + e.getKey() + ": " + e.getValue());
        }
        
        // Mostrar todo OPCION 2
        System.out.println("\n=== Dorsales y jugadores OPCION 2 ===");
        for (Integer dorsal : dorsales.keySet()) {
            Set<Jugador> jugadores = dorsales.get(dorsal);

            System.out.print("Dorsal "+dorsal+ " : ");
            for (Jugador j : jugadores) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

                
        // Dorsal con más jugadores OPCION 1
        // Para cada clave, cuento cuántos valores tiene
        // Por ejemplo, la clave 10 tiene 2 valores.
        
        int dorsalMax = -1;
        int max = -1;
                
        for (Map.Entry<Integer, Set<Jugador>> e : dorsales.entrySet()) {
            if (e.getValue().size() > max) {
                max = e.getValue().size();
                dorsalMax = e.getKey();
            }
        }
        System.out.println("\nDorsal con más jugadores (Opción 1): " + dorsalMax);
        
        
        // Dorsal con más jugadores OPCION 2
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
        System.out.println("\nJugadores del dorsal 10 (orden alfabético): " + dorsales.get(10));
    }

    private static void inserta(Map<Integer, Set<Jugador>> mapa, int dorsal, Jugador j) {
        Set<Jugador> set = mapa.get(dorsal);
        if (set == null) {
            set = new TreeSet<>();
            mapa.put(dorsal, set);
        }
        set.add(j);
    }
}

