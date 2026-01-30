package ud4.tarea2;

public class PruebaPila {

    public static void main(String[] args) {

        PilaTabla pila = new PilaTabla(2);

        try {
            System.out.println("Intentando ver la cima de una pila vacía...");
            System.out.println("Cima: " + pila.cima());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nDesapilando en una pila vacía...");
            pila.desapilar();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nApilando elementos...");
        pila.apilar(10);
        pila.apilar(20);

        try {
            System.out.println("\nCima actual: " + pila.cima());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nApilando 30 (debe ampliar la tabla)...");
        pila.apilar(30);

        try {
            System.out.println("Desapilando: " + pila.desapilar());
            System.out.println("Desapilando: " + pila.desapilar());
            System.out.println("Desapilando: " + pila.desapilar());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando desapilar otra vez...");
            pila.desapilar();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

