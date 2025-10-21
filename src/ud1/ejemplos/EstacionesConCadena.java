package ud1.ejemplos;

import java.util.Scanner;

public class EstacionesConCadena {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String mes;

	System.out.println("Introduce el número de mes: ");
	mes=sc.nextLine();
	
	switch (mes) {
		case "Enero", "Febrero", "Diciembre": 
			System.out.println("Invierno");
			break;
			
		case "Marzo","Abril","Mayo": 
			System.out.println("Primavera");
			break;
			
		case "Junio","Julio","Agosto": 
			System.out.println("Verano");
			break;
		
		case "Septiembre","Octubre","Noviembre": 
			System.out.println("Otoño");
			break;	
		default: 
			System.out.println("Nombre de mes incorrecto");
			
	}
	
	
}
}
