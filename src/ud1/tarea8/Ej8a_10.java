package ud1.tarea8;

import java.util.Scanner;

/*
 * Desarrollar un programa que solicite los valores mínimo y máximo 
 * de un rango. A continuación, solicitará por teclado un valor que 
 * debe estar dentro del rango. Si no es asi, volverá a solicitar un 
 * número, y así repetidas veces hasta que el valor esté dentro del rango.
 */


public class Ej8a_10 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int tabla;
		int resultado;
		
		do {
			System.out.println("Introduce tabla ");
			tabla=sc.nextInt();
		} while (tabla<0 || tabla>10);
		
		for (int i=1;i<=10;i++) {
			resultado=(i*tabla);
			System.out.println(tabla+"x"+i+"="+resultado);
		}

	}

}
