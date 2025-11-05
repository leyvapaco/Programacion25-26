package ud3.ejemplos;

public class FactorialRecursivo {

    // Método recursivo para calcular el factorial
    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (n == 1) {   //Caso base
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 4; // Puedes cambiar este valor
        long resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}