package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

    // Método para fusionar dos arrays ya ordenados
    public static int[] fusionar(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] resultado = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Recorremos ambos arrays y copiamos en orden
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }

        // Copiamos los elementos restantes de arr1 (si los hay)
        while (i < n1) {
            resultado[k++] = arr1[i++];
        }

        // Copiamos los elementos restantes de arr2 (si los hay)
        while (j < n2) {
            resultado[k++] = arr2[j++];
        }

        return resultado;
    }

    // Método auxiliar para imprimir arrays
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla1 = new int[6];
        int[] tabla2 = new int[6];

        // Leer primera serie de 6 enteros
        System.out.println("Introduce 6 enteros para la primera tabla:");
        for (int i = 0; i < 6; i++) {
            tabla1[i] = sc.nextInt();
        }

        // Leer segunda serie de 6 enteros
        System.out.println("Introduce 6 enteros para la segunda tabla:");
        for (int i = 0; i < 6; i++) {
            tabla2[i] = sc.nextInt();
        }

        // Ordenar ambas tablas
        Arrays.sort(tabla1);
        Arrays.sort(tabla2);

        // Mostrar tablas ordenadas
        System.out.println("Primera tabla ordenada:");
        imprimirArray(tabla1);

        System.out.println("Segunda tabla ordenada:");
        imprimirArray(tabla2);

        // Fusionar en una tercera tabla
        int[] tablaFusionada = fusionar(tabla1, tabla2);

        // Mostrar tabla fusionada
        System.out.println("Tabla fusionada ordenada:");
        imprimirArray(tablaFusionada);

        sc.close();
    }
}

