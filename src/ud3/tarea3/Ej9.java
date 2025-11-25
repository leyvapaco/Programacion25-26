package ud3.tarea3;

public class Ej9 {

    // Función que devuelve el número de aciertos
    static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        // Recorremos la apuesta
        for (int i = 0; i < apuesta.length; i++) {
            // Comparamos con cada número de la combinación ganadora
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                    break; // Evitamos contar el mismo número varias veces
                }
            }
        }

        return aciertos;
    }

    // Programa principal para probar la función
    public static void main(String[] args) {
        // Ejemplo de apuesta y combinación ganadora
        int[] apuesta = {3, 15, 22, 28, 35, 42};
        int[] ganadora = {7, 15, 22, 30, 35, 40};

        // Llamamos a la función
        int resultado = contarAciertos(apuesta, ganadora);

        // Mostramos el resultado
        System.out.println("Número de aciertos: " + resultado);
    }
}
