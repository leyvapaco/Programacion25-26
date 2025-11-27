package ud3.ejemplos;

public class EjemploMatrizDinamico {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        int[][] tabla = new int[filas][columnas];

        // Rellenar con valores
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = contador++;
            }
        }

              
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	 System.out.print(tabla[i][j]);
                }
            System.out.println();
            }
            
            
        
    }
}
