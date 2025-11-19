package ud3.ejemplos;

public class OrdenacionBurbuja {

    // Método estático que implementa el algoritmo burbuja
    public static void ordenar(int[] array) {
        int n = array.length;
        boolean intercambio;

        // Repetimos hasta que no haya intercambios
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Intercambiamos los elementos
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    intercambio = true;
                }
            }
            // Después de cada pasada, el mayor ya está al final
            n--;
        } while (intercambio);
    }

    // Método principal para probar el algoritmo
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        ordenar(numeros);

        System.out.println("\nArray ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

