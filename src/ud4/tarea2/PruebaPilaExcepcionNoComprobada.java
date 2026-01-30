package ud4.tarea2;

public class PruebaPilaExcepcionNoComprobada {

    public static void main(String[] args) {

        PilaTabla pila = new PilaTabla(2);

        System.out.println("Intentando ver la cima de una pila vacía...");
        System.out.println("Cima: " + pila.cima());

        System.out.println("\nDesapilando en una pila vacía...");
        pila.desapilar();

        System.out.println("\nApilando elementos...");
        pila.apilar(10);
        pila.apilar(20);

        System.out.println("\nCima actual: " + pila.cima());

        System.out.println("\nApilando 30 (debe ampliar la tabla)...");
        pila.apilar(30);

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Desapilando: " + pila.desapilar());

        System.out.println("\nIntentando desapilar otra vez...");
        pila.desapilar();

    }
}

