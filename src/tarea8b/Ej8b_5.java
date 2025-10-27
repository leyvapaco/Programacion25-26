package tarea8b;

import java.util.Scanner;

/*
Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. 
El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/
import java.util.Scanner;

public class Ej8b_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar altura
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        // Limpiar el /n del buffer antes de leer el carácter
        sc.nextLine();

        // Solicitar carácter
        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = sc.nextLine().charAt(0);

        // Pintar la pirámide
        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(".");
            }
            // Caracteres
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

        sc.close();
    }
}

