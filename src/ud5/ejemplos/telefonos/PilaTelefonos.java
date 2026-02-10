package ud5.ejemplos.telefonos;

public class PilaTelefonos {

    private TelefonoMovil[] pila;
    private int tope;

    public PilaTelefonos(int capacidad) {
        pila = new TelefonoMovil[capacidad];
        tope = -1;
    }

    // Apilar
    public void push(TelefonoMovil t) {
        if (tope < pila.length - 1) {
            tope++;
            pila[tope] = t;
        }
    }

    // Desapilar
    public TelefonoMovil pop() {
        if (tope >= 0) {
            TelefonoMovil t = pila[tope];
            tope--;
            return t;
        }
        return null;
    }

    // Ver el último sin quitarlo
    public TelefonoMovil peek() {
        if (tope >= 0) {
            return pila[tope];
        }
        return null;
    }

    // Saber si está vacía
    public boolean estaVacia() {
        return tope == -1;
    }
}
