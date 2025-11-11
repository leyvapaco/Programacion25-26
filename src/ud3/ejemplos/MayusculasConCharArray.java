package ud3.ejemplos;

public class MayusculasConCharArray {
    public static void main(String[] args) {
        // Array de caracteres en minúsculas
        char[] letras = {'h', 'o', 'l', 'a'};

        // Convertir cada letra a mayúscula
        for (int i = 0; i < letras.length; i++) {
            if (Character.isLetter(letras[i])) {
                letras[i] = (char)(letras[i] - 32); // Ajuste ASCII
            }
        }

        // Mostrar el resultado
        System.out.println("En mayúsculas: " + new String(letras));
    }
}
