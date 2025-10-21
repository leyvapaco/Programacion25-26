package ud1.tarea6;

import java.util.Scanner;

public class Ej6_3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num; 
		int resultado = 0;
		
		num=sc.nextInt();
		
		// El operador módulo (%) permite calcular el resto de una división
		
		switch (num%2) {
			case 0: //par
				resultado=1; //Si el resto es uno, el múmero es impar
				break;
			case 1: //impar
				resultado=0; //Si el resto es cero, el múmero es par
				break;		
		}
		
		System.out.println("El resultado vale: "+resultado);
	}
}