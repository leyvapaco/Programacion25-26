package ud1.ejemplos;

import java.util.Scanner;

public class VocalOConsonante {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		byte num1; 
		byte num2; 
		byte menor;
		
		System.out.println("Introduce el primer número:");
		num1=sc.nextByte();
		
		System.out.println("Introduce el primer número:");
		num2=sc.nextByte();
		
		menor =(num1<num2)?num1:num2;

		
		System.out.println("El menor es: "+menor);
	}
}
