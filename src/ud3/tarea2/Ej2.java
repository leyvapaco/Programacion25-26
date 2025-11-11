package ud3.tarea2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palabra;
		String cadena="";
		
		System.out.println("Introduce palabra (\"fin\") para terminar");
		palabra=sc.next();
		
		while (!palabra.toLowerCase().equals("fin")) {
			cadena=cadena.concat(palabra+" ");
			System.out.println("Introduce palabra (\"fin\") para terminar");
			palabra=sc.next();
		}
		//quitar el espacio en blanco del final
		cadena=cadena.substring(0, cadena.length() - 1); 
		 //o bien quitar espacios en blanco de inicio y final
	//	cadena=cadena.trim();
		
		System.out.println("La longitud de la cadena es: "+cadena.length());
		System.out.println("La cadena es:"+cadena);
		
	}
}
