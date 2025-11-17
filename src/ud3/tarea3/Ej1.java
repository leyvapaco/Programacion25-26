package ud3.tarea3;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double [] numeros=new double[5];
		
		for (int i=0;i<5;i++) {
			System.out.print("Introduce numeros["+i+"]: ");
			numeros[i]=sc.nextDouble();
		}
		
		//Escribo todos por consola
		System.out.println("\nArray introducido:");
		for (int i=0;i<numeros.length;i++)
			System.out.println(numeros[i]);		
	}
}
