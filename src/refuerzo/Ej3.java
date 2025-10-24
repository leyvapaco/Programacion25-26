package refuerzo;

import java.util.Scanner;

//Suma de números positivos.

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduce números positivos. Para terminar, ingresa un número negativo.");

        //Hacemos la primera lectura
        System.out.print("Número: ");
        numero = scanner.nextInt();
        
        while (numero>0) {

            suma += numero; // Acumula la suma si el número es positivo
            
            //Leemos el siguiente número
            System.out.print("Número: ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total de los números positivos es: " + suma);
        scanner.close();
    }
}
