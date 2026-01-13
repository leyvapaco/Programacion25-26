package ud3.ejemplos;

public class ArrayIrregularCoches {
    public static void main(String[] args) {
        // Array de marcas de coches
        String[] marcas = {"Toyota", "Ford", "BMW", "Renault"};

        // Array irregular de modelos por marca
        String[][] modelos = {
            {"Corolla", "Camry", "Yaris"},          // Toyota
            {"Fiesta", "Focus"},                    // Ford
            {"Serie 3", "Serie 5", "X5", "Z4"},     // BMW
            {"Clio", "Megane"}                      // Renault
        };

        // Mostrar marcas y sus modelos
        for (int i = 0; i < marcas.length; i++) {
            System.out.print(marcas[i] + ": ");
            for (int j = 0; j < modelos[i].length; j++) {
                System.out.print(modelos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
