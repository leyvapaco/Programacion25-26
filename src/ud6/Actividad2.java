package ud6;


/* Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Actividad2 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <= 20; i++) {
            Integer num = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            lista.add(num);
        }

        System.out.println("Lista de números aleatorios:");
        lista.forEach(num -> System.out.print(num+", "));// Imprimir la lista de números aleatorios
                   
        // Invertir la lista. Alternativas:
        //Collections.reverse(lista); 
        //Collections.sort(lista, Collections.reverseOrder());
        
        //Otra alternativa más, creando una clase comparador: 
        ComparadorInverso comparador = new ComparadorInverso();
        Collections.sort(lista,comparador); // Ordenar la lista inversa
               
        System.out.println("\nLista de números ordenados Desc:");
        lista.forEach(num -> System.out.print(num+", ")); // Imprimir la lista de números ordenados
    }
}
