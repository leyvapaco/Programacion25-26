package ud3.ejemplos;

public class OrdenacionQuickSort {

    // Método principal de Quicksort
    public static void quicksort(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(array, inicio, fin);
            // Ordenar recursivamente las dos mitades
            quicksort(array, inicio, indicePivote - 1);
            quicksort(array, indicePivote + 1, fin);
        }
    }

    // Método de partición: coloca el pivote en su lugar correcto
    private static int particion(int[] array, int inicio, int fin) {
        int pivote = array[fin]; // Elegimos el último elemento como pivote
        int i = inicio - 1;      // Índice del menor elemento

        for (int j = inicio; j < fin; j++) {
            if (array[j] <= pivote) {
                i++;
                // Intercambiamos array[i] y array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Colocamos el pivote en su posición final
        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1;
    }

    // Método main para probar el algoritmo
    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        quicksort(numeros, 0, numeros.length - 1);

        System.out.println("\nArray ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

