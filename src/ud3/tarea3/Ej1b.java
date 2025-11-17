package ud3.tarea3;

import java.util.Scanner;

public class Ej1b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String [] nombres=new String[5];
		
		for (int i=0;i<5;i++) {
			System.out.print("Introduce nombres["+i+"]: ");
			nombres[i]=sc.next();
		}
		
		//Escribo todos por consola
		System.out.println("\nArray introducido:");
		for (int i=0;i<nombres.length;i++)
			if (nombres[i].contains("s"))
				System.out.println(nombres[i]);		
	}
}
