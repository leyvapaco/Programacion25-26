package ud1.ejemplos;

import java.util.Scanner;

public class VocalOConsonante {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char letra=sc.next().toLowerCase().charAt(0);
		
		System.out.println("Introduce una letra");
		
		if (Character.isLetter(letra)){ //validamos que efectivamente sea una letra
		
			switch (letra) {
				case 'a','e','i','o','u':
					System.out.println("Es una vocal");
				break;
				default: 
					System.out.println("Es una consonante");
				
			}
		}
		else 
			System.out.println("Debes introducir una letra");
	}
}
