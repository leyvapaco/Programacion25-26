package ud3.ejemplos;

public class ProcesarTextoEjemplos {
    public static void main(String[] args) {
        String entrada = "  manzana, pera , plátano ,  kiwi  ";

        // 1. Eliminar espacios al inicio y al final
        String limpia = entrada.trim();

        // 2. Reemplazar espacios después de comas por nada
        String sinEspacios = limpia.replace(", ", ",");

        // 3. Dividir la cadena en frutas
        String[] frutas = sinEspacios.split(",");

        // 4. Mostrar cada fruta con su longitud
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta + " (longitud: " + fruta.length() + ")");
        }
        
        System.out.println("\n\n");
        
        // 5. Mostrar cada fruta con su longitud (otra forma de hacerlo)
        for (int i=0; i<frutas.length;i++) {
            System.out.println("Fruta: " + frutas[i] + " (longitud: " + frutas[i].length() + ")");
        }
    }
}

