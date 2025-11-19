package ud3.ejemplos;

public class OrdenacionSeleccion {

    // Método que implementa el algoritmo de selección
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Recorremos todo el array
        for (int i = 0; i < n - 1; i++) {
            // Suponemos que el mínimo está en la posición i
            int minIndex = i;

            // Buscamos el mínimo en la parte desordenada
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Actualizamos el índice del mínimo
                }
            }

            // Intercambiamos el mínimo encontrado con el primer elemento de la parte desordenada
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Método auxiliar para imprimir el array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Programa principal
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
