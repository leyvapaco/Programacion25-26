package ud4.utilidades;


public class MathAvanzado {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static double media(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double suma = 0;
        for (double v : valores) {
            suma += v;
        }
        return suma / valores.length;
    }

    public static double max(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double max = valores[0];
        for (double v : valores) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static double min(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double min = valores[0];
        for (double v : valores) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}
