package ejemplos;

import java.util.Scanner;

public class Estaciones {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int mes;

	System.out.println("Introduce el número de mes: ");
	mes=sc.nextInt();
	
	switch (mes) {
		case 1,2,12: 
			System.out.println("Es Invierno");
			break;
			
		case 3,4,5: 
			System.out.println("Es Primavera");
			break;
			
		case 6,7,8: 
			System.out.println("Es Verano");
			break;
		
		case 9,10,11: 
			System.out.println("Otoño");
			break;	
			
		default: 
			System.out.println("El valor debe estar entre 1 y 12");
	}
	
	
}
}
