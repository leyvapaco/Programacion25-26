package ud3.tarea3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 1. El jugador especifica el número de dígitos
        System.out.print("Introduce el número de dígitos de la clave secreta: ");
        int n = sc.nextInt();

        // 2. Generar combinación secreta aleatoria (valores entre 1 y 5)
        int[] claveSecreta = new int[n];
        for (int i = 0; i < n; i++) {
            claveSecreta[i] = rand.nextInt(5) + 1; // números entre 1 y 5
        }
        
        System.out.println("Clave secreta: "+Arrays.toString(claveSecreta));

        // 3. Bucle de intentos
        boolean acertado = false;
        do {
 
            char[] intento;
            // Pedir combinación de prueba
            do {
            	System.out.println("\nIntroduce tu combinación completa de " + n + " dígitos (valores entre 1 y 5):");
            	intento = sc.next().toCharArray();
            }while(!(intento.length==claveSecreta.length));
            
            acertado = false;
            int digitosAcertados=0;
      
            System.out.print("Pistas: \n");
            for (int i = 0; i < n; i++) {
                if (Character.getNumericValue(intento[i]) < claveSecreta[i]) {
                    System.out.println("Pos "+i+" debe ser mayor"); 
                } else if (Character.getNumericValue(intento[i])> claveSecreta[i]) {
                    System.out.println("Pos "+i+" debe ser menor"); 
                } else {
                    System.out.println("Pos "+i+" coincide");
                    digitosAcertados++;
                }
            }
            
            if (digitosAcertados==claveSecreta.length)
            	acertado = true;
            
            System.out.println();

            // Comprobar si ha acertado
            if (acertado) {
                System.out.println("\n¡Has abierto la cámara secreta!");
            } else {
                System.out.println("Inténtalo de nuevo...");
            }
        }while (!acertado);

        sc.close();
    }
}
