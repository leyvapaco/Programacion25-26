package ud1.tarea6;

import java.util.Scanner;

public class Ej6_3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num; 
		int resultado = 0;
		
		num=sc.nextInt();
		
		switch (num%2) {
			case 0: //par
				resultado=1;
				break;
			case 1: //impar
				resultado=0;
				break;		
		}
		
		System.out.println("El resultado vale: "+resultado);
	}
}