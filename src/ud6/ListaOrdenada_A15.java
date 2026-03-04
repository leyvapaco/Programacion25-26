package ud6;

import java.util.LinkedList;

public class ListaOrdenada_A15<E extends Comparable<E>> extends LinkedList<E> {

    public void insertarOrdenado(E elemento) {
        if (this.isEmpty()) {
            this.add(elemento);
            return;
        }

        int i = 0;
        while (i < this.size() && this.get(i).compareTo(elemento) < 0) {
            i++;
        }

        this.add(i, elemento);
    }

    // Clase de prueba dentro del mismo fichero
    public static void main(String[] args) {
    	ListaOrdenada_A15<Integer> lista = new ListaOrdenada_A15<>();

        lista.insertarOrdenado(5);
        lista.insertarOrdenado(2);
        lista.insertarOrdenado(8);
        lista.insertarOrdenado(3);

        System.out.println(lista); // [2, 3, 5, 8]
    }
}


