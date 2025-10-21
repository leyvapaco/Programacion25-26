package ejemplos;
import java.util.Scanner;

//Prueba de operadores ternarios
//Sólo pasas si eres mayor de edad 

public class Ternarias1{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		byte edad; 
		boolean mayorDeEdad=false; 
		
		System.out.println("Introduce tu edad");
		edad=sc.nextByte();
		
		mayorDeEdad=(edad>18)?true:false;
		
		if (mayorDeEdad)
			System.out.println("Eres mayor de edad");
		else 
			System.out.println("Eres menor de edad");
		
 }
}
