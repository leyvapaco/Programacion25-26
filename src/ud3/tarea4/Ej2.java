package ud3.tarea4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array de entrada con 8 palabras
        String[] palabras = new String[8];

        // Array con los colores conocidos por el programa
        String[] coloresConocidos = {
            "verde", "rojo", "azul", "amarillo", 
            "naranja", "rosa", "negro", "blanco", "morado"
        };

        // Arrays auxiliares para separar colores y no-colores
        String[] colores = new String[8];     // máximo 8 si todas fueran colores
        String[] noColores = new String[8];   // máximo 8 si ninguna fuera color

        int indiceColores = 0;
        int indiceNoColores = 0;

        // 1. Pedir las 8 palabras al usuario
        System.out.println("Introduce 8 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.nextLine().toLowerCase(); // pasamos a minúsculas para comparar
        }
        

        // 2. Clasificar cada palabra
        for (String palabra : palabras) {
            if (esColor(palabra, coloresConocidos)) {
                colores[indiceColores] = palabra;
                indiceColores++;
            } else {
                noColores[indiceNoColores++] = palabra;
            }
        }

        // 3. Crear array final con colores primero y luego no-colores
        String[] resultado = new String[8];
        int pos = 0;

        // Añadir colores
        for (int i = 0; i < indiceColores; i++) {
            resultado[pos] = colores[i];
            pos++;
        }

        // Añadir no-colores
        for (int i = 0; i < indiceNoColores; i++) {
            resultado[pos] = noColores[i];
            pos++;
        }

        // 4. Mostrar resultado
        System.out.println("\nPalabras ordenadas (colores primero):");
        for (String palabra : resultado) {
            System.out.print(palabra + " ");
        }
    }

    // Método auxiliar para comprobar si una palabra es un color conocido
    public static boolean esColor(String palabra, String[] coloresConocidos) {
        boolean esColor=false;
        
    	for (String color : coloresConocidos) {
            if (palabra.equals(color)) {
            	esColor=true;
            }
        }
        return esColor;
    }
}
