package ejemplos;
import java.util.Scanner;

//Prueba de operadores ternarios
//Sólo pasas si eres mayor de edad 

public class Vocal{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String frase;
		String palabra;
		char letra;
	
		System.out.print("Introduce una frase cualquiera ");
		frase=sc.nextLine();
		System.out.println("Leido: "+frase);
		System.out.println();
		
		System.out.print("Introduce una frase de 3 palabras ");
		palabra=sc.next();		
		System.out.println("Palabra: "+palabra);
		
		palabra=sc.next();		
		System.out.println("Palabra: "+palabra);
		
		letra=sc.next().charAt(0);
		System.out.println("Inicial: "+letra);
		
		sc.close();

 }
}
