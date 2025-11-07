package ud1.examen;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		final int SECRETO=25;
		final int MAX_INTENTOS=8;	
		boolean quieroAyuda=false;
		boolean acertado=false;
		char opc; //Para indicar si quiero ayuda o no
		int numero; //Número introducido por consola
		int intentos=0; //Intentos realizados
		
		System.out.println("Programa para acertar un número secreto en "+MAX_INTENTOS+" intentos");
		System.out.println("¿Quiere activar la ayuda? S/N");
		
		Scanner sc=new Scanner(System.in);
		opc=sc.nextLine().toLowerCase().charAt(0);
		
		if (opc=='s')
			quieroAyuda=true;
		
		do { //Se repite mientras no acierte y no haya superado 8 intentos
			System.out.print("\nDime un número: ");
			numero=sc.nextInt();
			intentos++;
			
			if (numero==SECRETO)
				acertado=true;
			
			if (quieroAyuda && !acertado) { //Proporciono ayuda al usuario
				if (numero>SECRETO)
					System.out.println("El número secreto es menor");	
				else if (numero<SECRETO)
					System.out.println("El número secreto es mayor");	
				System.out.println("Intentos restantes: "+(MAX_INTENTOS-intentos));
			}		
	
		}while (!acertado && intentos<MAX_INTENTOS);
		
		if (acertado)
			System.out.println("Enhorabuena!!!");
		else
			System.out.println("Número de intentos superado. Lo siento!!!");			
	}
}
