package ud3.ejemplos;

public class EjemploMatrizDinamico {
    public static void main(String[] args) {
        int filas = 2;
        int columnas = 4;

        int[][] tabla = new int[filas][columnas];

        // Rellenar con valores
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = contador++;
            }
        }

        // Mostrar tabla
        for (int[] fila : tabla) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
