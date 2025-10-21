package ud1.ejemplos;
import java.util.Scanner;

//Prueba de operadores ternarios
//Sólo pasas si eres mayor de edad y de Sevilla

public class Ternarias2{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		byte edad; 
		boolean mayorDeEdad=false; 
		String ciudad; 
		boolean sevillano=false; 
		
		System.out.println("Introduce tu edad");
		edad=sc.nextByte();
		
		mayorDeEdad=(edad>18)?true:false;
		
		System.out.println("Introduce la ciudad en que naciste");
		ciudad=sc.next();
		
		sevillano=(ciudad.equals("Sevilla"))?true:false;
		
	/*  Lo siguiente también funcionaría, dado que la función equals ya de por sí devuelve true o false
	 * 	sevillano=(ciudad.equals("Sevilla"));
	 */
		
		//Solo pasan los sevillanos mayores de edad
		
		if (mayorDeEdad && sevillano)
			System.out.println("Puede pasar");
		else 
			System.out.println("No puede pasar");
		
 }
}
