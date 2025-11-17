package ud3.tarea3;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int TAM;
		
		System.out.print("¿Cuántos numeros:?"); 
		TAM=sc.nextInt();
		
		double [] numeros=new double[TAM];
		
		for (int i=0;i<numeros.length;i++) {
			System.out.print("Introduce numeros["+i+"]: ");
			numeros[i]=sc.nextDouble();
		}
		
		System.out.println("Orden de inserción");
		for (double elemento:numeros)
			System.out.println(elemento);
		
		//Escribo todos por consola el array pero al revés
		System.out.println("\nOrden inverso");
		for (int i=numeros.length-1;i>=0;i--)
			System.out.println(numeros[i]);		
	}
}
