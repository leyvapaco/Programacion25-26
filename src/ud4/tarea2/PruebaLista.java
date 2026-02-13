package ud4.tarea2;

public class PruebaLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        System.out.println("Lista: " + lista);

        lista.insertarPrincipio(5);
        System.out.println("Insertar al principio: " + lista);

        lista.insertarEn(2, 15);
        System.out.println("Insertar en índice 2: " + lista);

        System.out.println("Elemento en índice 3: " + lista.obtener(3));

        System.out.println("Buscar 20: índice " + lista.buscar(20));

        System.out.println("Eliminar índice 1: " + lista.eliminar(1));
        System.out.println("Lista tras eliminar: " + lista);

        Lista otra = new Lista();
        otra.insertarFinal(100);
        otra.insertarFinal(200);

        lista.addLista(otra);
        System.out.println("Tras añadir otra lista: " + lista);
    }
}
