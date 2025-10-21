package ejemplos;
import java.util.Scanner;

//Prueba de operadores ternarios
//Sólo pasas si eres mayor de edad 

public class EjemplosUsoScanner{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String frase;
		String palabra;
		char letra;
	
		// nextLine lee una frase entera
		System.out.print("Introduce una frase cualquiera ");
		frase=sc.nextLine();
		System.out.println("Leido: "+frase);
		System.out.println();
		
		// next lee sólo una palabra
		System.out.print("Introduce una frase de 3 palabras ");
		palabra=sc.next();		
		System.out.println("Palabra: "+palabra);
		
		palabra=sc.next();		
		System.out.println("Palabra: "+palabra);
		
		// Así podríamos leer la primera letra
		letra=sc.next().charAt(0);
		System.out.println("Inicial: "+letra);
		
		sc.close();

 }
}
