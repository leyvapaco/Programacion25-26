package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar altura
        System.out.print("Introduce la altura de la letra L: ");
        int altura = sc.nextInt();

        // Calcular longitud del palo horizontal
        int base = (altura / 2) + 1;

        // Pintar el palo vertical
        for (int i = 1; i <= altura; i++) {
           if (i<altura)
        	   System.out.println("*");
           else  
        	   for (int j = 1; j <= base; j++) {
               System.out.print("*");
           }
        	   
        }

        sc.close();
    }
}
