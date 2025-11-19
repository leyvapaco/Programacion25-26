package ud3.ejemplos;

public class OrdenacionInsercion {

    // Método que implementa el algoritmo de inserción
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];       // Elemento que vamos a insertar
            int j = i - 1;

            // Desplazar elementos mayores que 'key' una posición a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insertar 'key' en la posición correcta
            arr[j + 1] = key;
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
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array original:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
