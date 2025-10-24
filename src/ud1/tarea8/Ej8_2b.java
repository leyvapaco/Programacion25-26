package ud1.tarea8;

import java.util.Scanner;

public class Ej8_2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorAlumnos = 0;
        int edad;
        int mayoresEdad = 0;
        int sumaEdades = 0;

        System.out.println("Introduce las edades de los alumnos (edad negativa para terminar):");
        System.out.print("Edad del alumno : ");
        edad=scanner.nextInt();

        //Ojo con los while (true) con break de la IA: No usar;
        
        while (edad>0) {
  
            if (edad>0) {
            
            	if (edad >= 18) 
            		mayoresEdad++;
           
                sumaEdades += edad;
                contadorAlumnos++;
            }
            
            System.out.print("Edad del alumno : ");
            edad=scanner.nextInt();

        };

        if (contadorAlumnos > 0) {
            float media = (float) sumaEdades / contadorAlumnos;

            System.out.println("\n--- Estadísticas ---");
            System.out.println("Total de alumnos: " + contadorAlumnos);
            System.out.println("Suma de edades: " + sumaEdades);
            System.out.printf("Media de edad: %.2f\n", media);
            System.out.println("Alumnos mayores de edad: " + mayoresEdad);
        } else {
            System.out.println("No se introdujeron edades válidas.");
        }

        scanner.close();
    }
}

