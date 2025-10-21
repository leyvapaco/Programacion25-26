package ud1.ejemplos;
import java.util.Scanner;

//Prueba de operadores ternarios
//Sólo puedes pasar si eres mayor de edad 

public class Ternarias1{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		byte edad; 
		boolean mayorDeEdad=false; 
		
		System.out.println("Introduce tu edad");
		edad=sc.nextByte();
		
		//Si la condición a comprobar es verdadera, asigna a mayorDeEdad el valor true, si no, false
		mayorDeEdad=(edad>18)?true:false;
				
		if (mayorDeEdad)
			System.out.println("Eres mayor de edad");
		else 
			System.out.println("Eres menor de edad");
		
 }
}
