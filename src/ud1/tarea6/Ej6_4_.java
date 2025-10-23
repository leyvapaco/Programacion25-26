package ud1.tarea6;

import java.util.Scanner;

public class Ej6_4_ {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		byte num1; 
		byte num2; 
		byte menor=0;
		
		System.out.println("Introduce el primer número:");
		num1=sc.nextByte();
		
		System.out.println("Introduce el primer número:");
		num2=sc.nextByte();
		
		char comparacion =(num1<num2)?'1':'2';

	     switch (comparacion) {
         case '1': // num1 < num2
             menor = num1;
             break;
         case '2': // num1 > num2
             menor = num2;
             break;
     }
		
		System.out.println("El menor es: "+menor);
	}
}
