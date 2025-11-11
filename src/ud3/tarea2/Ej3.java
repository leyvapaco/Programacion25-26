package ud3.tarea2;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena="";
		
		System.out.println("Introduce cadena: ");
		cadena=sc.nextLine();
		
		if (cadena.charAt(cadena.length()/2)==' ') {
			System.out.println("Es un espacio");		
		} else
			System.out.println("No es un espacio");	
	
	}
}
