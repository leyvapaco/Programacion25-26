package ud1.tarea8;

import java.util.Scanner;

/*
 * Desarrollar un programa que solicite los valores mínimo y máximo 
 * de un rango. A continuación, solicitará por teclado un valor que 
 * debe estar dentro del rango. Si no es asi, volverá a solicitar un 
 * número, y así repetidas veces hasta que el valor esté dentro del rango.
 */


public class Ej8_5 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el límite inferior: ");
		int min=sc.nextInt();
	
		System.out.println("Introduce el límite superior: ");
		int max=sc.nextInt();
		
		int num;
		
		System.out.printf("Introduce un número dentro del rango %d - %d %n",min,max);
		num=sc.nextInt();
		
		while (num<min || num>max) {
			System.out.println("Introduce un número dentro del rango "+min+"-"+max);  
			num=sc.nextInt();
		} 
		
		System.out.println("Número válido ");
		
	}

}
