package ud3.ejemplos;

public class ContarDigitosRecursivo {
    public static int contar(int numero) {
        if (numero == 0) {
            return 0;
        }
        return 1 + contar(numero / 10);
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("Cantidad de dígitos: " + contar(numero));
    }
}
