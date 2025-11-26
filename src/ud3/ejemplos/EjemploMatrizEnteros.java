package ud3.ejemplos;

public class EjemploMatrizEnteros {
    public static void main(String[] args) {
        // Declaración y asignación directa
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Recorrido con bucles anidados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
