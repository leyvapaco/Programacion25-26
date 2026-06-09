package ud1.recuperacion;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generar número secreto entre 1 y 25
        int numeroSecreto = (int)(Math.random() * 25) + 1;

        // Pedir número de intentos
        System.out.print("¿Cuántos intentos quieres realizar? ");
        int intentosMax = sc.nextInt();

        // Preguntar si quiere ayuda
        System.out.print("¿Quieres recibir ayuda? (S/N): ");
        char ayuda = sc.next().toUpperCase().charAt(0);

        boolean acertado = false; // variable booleana para controlar el acierto
        int intentosRealizados = 0;

        // Bucle de intentos
        while (intentosRealizados < intentosMax && !acertado) {
            System.out.print("Introduce tu número (entre 1 y 25): ");
            int numeroUsuario = sc.nextInt();
            intentosRealizados++;

            if (numeroUsuario == numeroSecreto) {
                acertado = true;
                System.out.println("¡Has acertado! El número secreto era " + numeroSecreto);
            } else {
                System.out.println("No has acertado.");
                if (ayuda == 'S') {
                    if (numeroUsuario < numeroSecreto) {
                        System.out.println("Pista: el número secreto es mayor.");
                    } else {
                        System.out.println("Pista: el número secreto es menor.");
                    }
                }
                System.out.println("Te quedan " + (intentosMax - intentosRealizados) + " intentos.");
            }
        }

        // Resultado final
        if (!acertado) {
            System.out.println("\nSe han agotado los intentos. El número secreto era: " + numeroSecreto);
        }
        System.out.println("Número total de intentos realizados: " + intentosRealizados);

        sc.close();
    }
}
