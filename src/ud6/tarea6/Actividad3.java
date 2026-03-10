package ud6.tarea6;

import java.util.*;

public class Actividad3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Diccionario inicial de capitales
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        boolean seguirPreguntando = true;

        while (seguirPreguntando) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            String pais = sc.nextLine();

            if (pais.equals("salir")) {
                seguirPreguntando = false;
            } else if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = sc.nextLine();

                capitales.put(pais, nuevaCapital);

                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
    }
}
