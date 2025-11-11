package ud3.tarea2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cad1,cad2;
		
		System.out.println("Introduce cadena 1");
		cad1=sc.next();
		
		System.out.println("Introduce cadena 2");
		cad2=sc.next();
		
		if (cad1.length()>cad2.length())
			System.out.println(cad2+" es la más corta");
		else if (cad1.length()<cad2.length())
			System.out.println(cad1+" es la más corta");
		else
			System.out.println("Tienen el mismo tamaño");
	}

	
}
