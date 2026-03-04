package ud6;

import java.util.*;

public class Actividad5 {
    public static void main(String[] args) {

        Random rand = new Random();

        Set<Integer> usados = new HashSet<>();   // Para asegurar que no se repiten
        List<Integer> lista = new ArrayList<>(); // Para mantener el orden decreciente

        while (lista.size() < 20) {
            int num = rand.nextInt(100); // número entre 0 y 99 

            //Sólo ejecuto esto si el numero no ha salido ya antes (evito así duplicados)
            if (!usados.contains(num)) {
                usados.add(num);

                // Insertar en la lista manteniendo orden decreciente
                int pos = 0;
                while (pos < lista.size() && lista.get(pos) > num) {
                    pos++;
                }
                lista.add(pos, num);
            }
        }

        System.out.println("Colección en orden decreciente:");
        for (int n : lista) {
            System.out.print(n+" ");
        }
        
    }
}
