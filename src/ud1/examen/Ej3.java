package ud1.examen;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		char opcion;
		char caracter=' ';	//Carácter a emplear por defecto al pintar
		final int ANCHO=6; 	//Ancho de la letra a pintar
		final int ALTO=8;	//Alto de la letra a pintar
				
		System.out.println("Selecciona el carácter a emplear: ");
		System.out.println("1: asterisco ");
		System.out.println("2: almohadilla ");
		
		Scanner sc=new Scanner(System.in);
		
		opcion=sc.nextLine().charAt(0);
		
		switch(opcion) {
			case '1':
				caracter='*';
				break;
			case '2':
				caracter='#';
				break;
			default:
				System.out.println("Carácter introducido no válido. Programa finalizado");
				return;
		}
		
		for(int i=1;i<=ALTO;i++) { //Para movernos por las filas
			if (i==1 || i==ALTO) {
				for(int j=1;j<ANCHO;j++)	//Para movernos por las columnas
					System.out.print(caracter);			
			}
			System.out.println(caracter);	
		}				
	}
	
}
