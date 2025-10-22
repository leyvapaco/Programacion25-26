package ud1.ejemplos;

import java.util.Scanner;

public class VocalOConsonante {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char letra=sc.next().toLowerCase().charAt(0);
		
		switch (letra) {
			case 'a','e','i','o','u':
				System.out.println("Es una vocal");
			break;
			default:
				System.out.println("Es una consonante");
				
		}
		//realmente deberíamos poner un case con todas las
		//consonantes si fuesemos un poco menos perros
	}
}
