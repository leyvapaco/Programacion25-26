package refuerzo;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("\nHola " + nombre + ", ");

        //Usamos el tabulador para alinear cada ELSE debajo de su correspondiene IF
        
        if (edad < 13) 
            System.out.println("eres un niño/a.");
        else 	if (edad < 18) 
        		System.out.println("eres un adolescente.");
        	   	else 	if (edad < 65) 
        		   System.out.println("eres un adulto.");
          	   			else 
            System.out.println("eres una persona mayor.");

        sc.close();
    }
}
