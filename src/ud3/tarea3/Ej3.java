package ud3.tarea3;

import java.util.Arrays;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir al usuario cuántos números va a introducir
        System.out.print("Introduce la cantidad de números (n): ");
        int n = sc.nextInt();

        // 2. Crear el array
        int[] numeros = new int[n];

        // Variables para cálculos
        int sumaPositivos = 0, cuentaPositivos = 0;
        int sumaNegativos = 0, cuentaNegativos = 0;
        int cuentaCeros = 0;

        // 3. Leer los n números y almacenarlos en el array
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            // Clasificar cada número
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cuentaPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }

        // 4. Calcular medias
        double mediaPositivos = (cuentaPositivos > 0) ? (double) sumaPositivos / cuentaPositivos : 0;
        double mediaNegativos = (cuentaNegativos > 0) ? (double) sumaNegativos / cuentaNegativos : 0;

        // 5. Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Media de positivos: " + mediaPositivos);
        System.out.println("Media de negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cuentaCeros);

        sc.close();
    }
}
