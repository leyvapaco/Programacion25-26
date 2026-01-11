package ud3.tarea4;
import java.util.Scanner;
import java.util.Random;

public class QEQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Objetos posibles
        String[] objetos = {"perro", "gato", "pez", "pajaro"};

        // Características asociadas (verbos)
        String[][] caracteristicas = {
            {"ladra", "corre","bosteza"}, // perro
            {"maulla", "rasca"},      // gato
            {"nada", "respira"},      // pez
            {"vuela", "canta"}        // pájaro
        };

        
        
        
        // Elegir objeto al azar
        int elegido = rand.nextInt(objetos.length);
        String objetoSecreto = objetos[elegido];

        System.out.println("=== Adivina adivinanza ===");
        System.out.println("He pensado en un animal. Haz preguntas usando verbos (ej. 'ladra', 'vuela').");
        System.out.println("Cuando creas saberlo, escribe su nombre para intentar adivinarlo.");
        System.out.println();

        boolean acertado = false;

        while (!acertado) {
            System.out.print("Dime tu pregunta o intento de acierto: ");
            String entrada = sc.nextLine().toLowerCase();

            // Comprobar si el usuario intenta adivinar directamente
            if (entrada.equals(objetoSecreto)) {
                System.out.println("¡Correcto! Era un " + objetoSecreto + ".");
                acertado = true;
            } else {
                // Comprobar si la palabra está en las características del objeto secreto
                boolean encontrado = false;
                for (String verbo : caracteristicas[elegido]) {
                    if (entrada.equals(verbo)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    System.out.println("Sí.");
                } else {
                    System.out.println("No.");
                }
            }
        }

        sc.close();
    }
}

