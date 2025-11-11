package ud3.tarea2;

import java.util.Scanner;

public class Ej5 {

	public static String eliminarVocales(String texto) {
	        // Expresión regular que incluye vocales normales y acentuadas (mayúsculas y minúsculas)
	        return texto.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
	    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        // Eliminar vocales
        String nombreSinVocales = eliminarVocales(nombreCompleto);

        // Mostrar resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }

 }
