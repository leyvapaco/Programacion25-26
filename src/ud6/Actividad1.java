package ud6;


/*Crear una colección de 20 números enteros aleatorios menores que 100, 
y guardarlos en el orden en que se vayan generando;
mostrar por pantalla dicha lista una vez creada.
Ordenarla en sentido creciente y volverla a mostrar por pantalla.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Actividad1 {
    public static void main(String[] args) {  //Listas admiten duplicados, SET no
    	//si vamos a agregar o eliminar normalmente al final o acceder con frecuencia por índice
        List<Integer> lista = new ArrayList<Integer>();
      
        //si requiere muchas inserciones o eliminaciones a comienzo o hasta mitad de la lista
        List<Integer> listaEnlazada = new LinkedList<Integer>(); 
  
        Random random = new Random();

        for (int i = 0; i <= 20; i++) {
            Integer num = random.nextInt(100); // Genera un número aleatorio entre 1 y 100
            lista.add(num);
            listaEnlazada.add(num);
        }
             
        System.out.println("\nArrayList:");
        
        for (Integer elemento: lista)
        	System.out.print(elemento+", ");
        
        //Alternativa para imprimir toda la lista
        System.out.println("\n\nArrayList (forEach lambda):");       
        lista.forEach(elemento -> System.out.print(elemento+", "));// Imprimir la lista de números aleatorios
   
        System.out.println("\n\nLinkedList:");
        listaEnlazada.forEach(elemento -> System.out.print(elemento+", "));           
        
        Collections.sort(lista); // Ordenar la lista por el orden natural
        
        System.out.println("\n\nLista de números ordenados:");
        System.out.println(lista);// Imprimir la lista de números ordenados
    
        //Actividad 2. Orden inverso
        Collections.reverse(lista); // Invertir la lista
        //Otra forma:
        //Collections.sort(lista, Collections.reverseOrder());
        
        System.out.println("\n\nLista de números ordenados decreciente:");
        System.out.println(lista);
    
    }
}
