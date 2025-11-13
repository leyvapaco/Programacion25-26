package ud3.ejemplos;

//Consulta los métodos de String
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

public class ClaseStringEjemplos {
    public static void main(String[] args) {
        String entrada = "  manzana, pera , plátano ,  kiwi  ";
        System.out.println("0: "+entrada);
        
        // 1. Eliminar espacios al inicio y al final
        String limpia = entrada.trim();
        System.out.println("1: "+limpia);

        // 2. Reemplazar espacios después de comas por nada
        String sinEspacios = limpia.replace(", ", ",");
        System.out.println("2: "+sinEspacios);
        
        // 3. Dividir la cadena en frutas
        String[] frutas = sinEspacios.split(",");
        System.out.println("3: "+frutas);
        
        System.out.println("\n\n");
        
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

