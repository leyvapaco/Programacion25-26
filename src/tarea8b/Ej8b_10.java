package tarea8b;

import java.util.Scanner;

public class Ej8b_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar altura
        System.out.print("Introduce la altura de la letra U: ");
        int altura = sc.nextInt();
        
   

        // Pintar los palos verticales
        for (int i = 0; i < altura; i++) {
        	if (i<altura-1) {  // Cualquier fila que no sea la base
        		System.out.print("*");
                for (int j = 0; j < altura/2; j++)
            		System.out.print(" ");  
        		System.out.println("*");
        	}
        	if (i==(altura-2)) { // Pinta la base
        		System.out.print(" ");
                for (int j = 0; j < altura/2; j++)
            		System.out.print("*");  
        		System.out.println(" ");
        	}
        	
        }
        
        sc.close();
    }
}
