package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la X (número impar ≥ 3): ");
        int altura = sc.nextInt();

        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: la altura debe ser un número impar mayor o igual a 3.");
        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura; j++) {
                    if (j == i || j == (altura-i+1)) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

