package ud1.tarea6;

import java.util.Scanner;

public class Ej6_4 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char primeraLetra; 

		System.out.println("Introduce la letra");
		primeraLetra=sc.next().toLowerCase().charAt(0);
		
	    switch (primeraLetra) {
        case 'a','e','i','o','u': 
        	 System.out.println("La primera letra es vocal");
             break;
         default:
        	 System.out.println("Es consonante");
     }

	}
}
