package ud4.tarea2;

public class PilaTabla {

    private Integer[] datos;   // Tabla donde guardamos los elementos
    private int cima;          // Número de elementos (y posición de inserción)

    // Constructor: capacidad inicial
    public PilaTabla(int capacidadInicial) {
        datos = new Integer[capacidadInicial];
        cima = 0; //Pila vacía
    }

    // ¿Está vacía?
    public boolean estaVacia() {
        return cima == 0;
    }

    // Apilar un elemento
    public void apilar(Integer x) {
        // Si está llena, ampliamos la tabla
        if (cima == datos.length) {
            ampliar();
        }
        datos[cima] = x;
        cima++;
    }

    // Desapilar: devuelve el último elemento
    public Integer desapilar() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        cima--;
        Integer elemento = datos[cima];
        datos[cima] = null; 
        return elemento;
    }

    // Consultar la cima sin quitarla
    public Integer cima() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return datos[cima - 1];
    }

    // Ampliar la tabla al doble
    private void ampliar() {
        Integer[] nueva = new Integer[datos.length * 2];
        for (int i = 0; i < datos.length; i++) {
            nueva[i] = datos[i];
        }
        datos = nueva;
    }
}
