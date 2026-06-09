package ud3.examen;

import java.util.Scanner;

public class Ej2Sol {

    // Función que permite rellenar la encuesta hasta que se introduzca "fin"
    static void rellenaEncuesta(String[][] encuesta) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean finalizar=false;

        while ((i < encuesta.length) && (!finalizar)) {
            System.out.print("Introduce código postal (o 'fin' para terminar): ");
            String cp = sc.nextLine();
            if (cp.equalsIgnoreCase("fin")) {
                finalizar=true;
            }
            
            if (!finalizar) {
            	System.out.print("Introduce edad: ");
            	String edad = sc.nextLine();

            	System.out.print("Introduce sexo (M/F): ");
            	String sexo = sc.nextLine().toUpperCase();

            	// Guardar datos en el array
            	encuesta[i][0] = cp;
            	encuesta[i][1] = edad;
            	encuesta[i][2] = sexo;

            	i++;
            }
        }
    }

    // Función que muestra los resultados
    static void muestraResultados(String[][] encuesta) {
        System.out.println("\n--- Resultados de la encuesta ---");
        for (int i = 0; i < encuesta.length; i++) {
            if (encuesta[i][0] != null) { // Solo mostrar filas rellenadas
                System.out.println("Código Postal: " + encuesta[i][0] +
                                   ", Edad: " + encuesta[i][1] +
                                   ", Sexo: " + encuesta[i][2]);
            }
        }
    }

    // Función que calcula la media de edad para un sexo y código postal
    static int calculaMediaEdad(String[][] encuesta, char sexo, int codigoPostal) {
        int sumaEdades = 0; 
        int contadorPersonas = 0;

        for (int i = 0; i < encuesta.length; i++) {
            if (encuesta[i][0] != null) {
                int cp = Integer.parseInt(encuesta[i][0]);
                int edad = Integer.parseInt(encuesta[i][1]);
                char s = encuesta[i][2].charAt(0);

                if (cp == codigoPostal && s == sexo) {
                    sumaEdades += edad;
                    contadorPersonas++;
                }
            }
        }

        return (contadorPersonas == 0)?0:(sumaEdades / contadorPersonas);
    }

    // Método main para probar
    public static void main(String[] args) {
        String[][] encuesta = new String[500][3]; // [habitantes][datos: CP, edad, sexo]

        // Rellenar encuesta
        rellenaEncuesta(encuesta);

        // Mostrar resultados
        muestraResultados(encuesta);

        // Calcular media de edad para un ejemplo
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce código postal para calcular media: ");
        int cp = sc.nextInt();
        System.out.print("Introduce sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        int media = calculaMediaEdad(encuesta, sexo, cp);
        if (media == 0) {
            System.out.println("No hay ciudadanos con esos criterios.");
        } else {
            System.out.println("La media de edad asociada al CP "+cp+" y sexo "+sexo+" es: " + media);
            
        }
    }
}
