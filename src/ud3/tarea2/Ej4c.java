package ud3.tarea2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej4c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena="";
		
		System.out.println("Introduce cadena: ");
		cadena=sc.nextLine();
		
		int numEspacios=0;
		
		StringTokenizer tokenizer = new StringTokenizer(cadena, " "); // Aquí, el espacio en blanco es el delimitador
		numEspacios = tokenizer.countTokens() - 1; // Restamos 1 para excluir el último token
		
		System.out.println("Tiene "+numEspacios+" espacios");
	
	}
}
