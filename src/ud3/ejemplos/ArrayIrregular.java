package ud3.ejemplos;

public class ArrayIrregular {
    public static void main(String[] args) {
        // Declaración de un array de 2 dimensiones
        int[][] matriz = new int[3][]; // 3 filas, pero columnas aún no definidas

        // Asignar longitudes diferentes a cada fila
        matriz[0] = new int[2];  // primera fila con 2 columnas
        matriz[1] = new int[4];  // segunda fila con 4 columnas
        matriz[2] = new int[3];  // tercera fila con 3 columnas

        // Ejemplo de asignación
        matriz[0][0] = 10;
        matriz[1][2] = 20;
        matriz[2][1] = 30;

        // Recorrido
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
