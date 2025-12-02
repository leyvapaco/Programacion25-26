package ud3.tarea4;

public class MenuPlantilla {

    // Rellena el menú con datos ficticios
    static void rellenaMenu(String[][] menu) {
        String[][] platos = {
            // Menú 0 → Desayuno
            {"Tostada,2,V", "Tortilla,5,C", "Fruta,3,V"},
            // Menú 1 → Almuerzo
            {"Gazpacho,6,V", "Pollo asado,12,C", "Natillas,4,V"},
            // Menú 2 → Cena
            {"Crema de verduras,7,V", "Pizza,12,C", "Brownie,5,V"}
        };

        //COMPLETAR
    }

    // Muestra el menú completo
    static void muestraMenu(String[][] menu) {

    	//COMPLETAR
    }

    // Calcula el precio medio de platos de un tipo en un menú concreto
    static int calculaPrecioMedio(String[][] menu, int tipoMenu, char tipoPlato) {
        int suma = 0, contador = 0;

    	//COMPLETAR
        
        return contador == 0 ? 0 : suma / contador;
    }

    public static void main(String[] args) {
        // Menús=3 (Desayuno, Almuerzo, Cena), Categorías=3 (Entrante, Principal, Postre)
        String[][] menu = new String[3][3];

        rellenaMenu(menu);
        muestraMenu(menu);

        int media = calculaPrecioMedio(menu, 1, 'C'); // Almuerzo, platos de carne
        System.out.println("\nPrecio medio en Almuerzo (carne): " + media);
    }
}
