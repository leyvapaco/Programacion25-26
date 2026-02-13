package ud4.tarea2;

public class Lista {

    private Integer[] datos;   // Tabla donde se guardan los elementos
    private int tam;        // Número de elementos insertados

    // Constructor por defecto (capacidad 10)
    public Lista() {
        datos = new Integer[10];
        tam = 0;
    }

    // Constructor con capacidad inicial
    public Lista(int capacidadInicial) {
        datos = new Integer[capacidadInicial];
        tam = 0;
    }

    // Obtener número de elementos
    public int tamanyo() {
        return tam;
    }

    // Asegurar espacio suficiente
    private void asegurarCapacidad() {
        if (tam == datos.length) {
            Integer[] nueva = new Integer[datos.length * 2];
            for (int i = 0; i < datos.length; i++) {
                nueva[i] = datos[i];
            }
            datos = nueva;
        }
    }

    // Insertar al final
    public void insertarFinal(Integer x) {
        asegurarCapacidad();
        datos[tam] = x;
        tam++;
    }

    // Insertar al principio
    public void insertarPrincipio(Integer x) {
        asegurarCapacidad();
        // Desplazar elementos a la derecha
        for (int i = tam; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = x;
        tam++;
    }

    // Insertar en un índice
    public void insertarEn(int indice, Integer x) {
        if (indice < 0 || indice > tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        asegurarCapacidad();
        // Desplazar elementos a la derecha
        for (int i = tam; i > indice; i--) {
            datos[i] = datos[i - 1];
        }
        datos[indice] = x;
        tam++;
    }

    // Añadir otra lista al final
    public void addLista(Lista otra) {
        for (int i = 0; i < otra.tamanyo(); i++) {
            insertarFinal(otra.obtener(i));
        }
    }

    // Eliminar por índice
    public Integer eliminar(int indice) {
        if (indice < 0 || indice >= tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Integer eliminado = datos[indice];
        // Desplazar elementos a la izquierda
        for (int i = indice; i < tam - 1; i++) {
            datos[i] = datos[i + 1];
        }
        datos[tam - 1] = null;
        tam--;
        return eliminado;
    }

    // Obtener elemento por índice
    public Integer obtener(int indice) {
        if (indice < 0 || indice >= tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return datos[indice];
    }

    // Buscar un número (devuelve índice o -1)
    public int buscar(Integer x) {
        for (int i = 0; i < tam; i++) {
            if (datos[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    // Representación en cadena
    @Override
    public String toString() {
        if (tam == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tam; i++) {
            sb.append(datos[i]);
            if (i < tam - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
