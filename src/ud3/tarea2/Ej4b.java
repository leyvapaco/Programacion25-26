package ud3.tarea2;

import java.util.Scanner;

public class Ej4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] cadena;
		
		System.out.println("Introduce cadena: ");
		cadena=sc.nextLine().toCharArray();
		
		int numEspacios=0;
		
		for (int i=0;i<cadena.length;i++) {
			if (cadena[i]==' ') {
				numEspacios++;
			}		
		}
		
		System.out.println("Tiene "+numEspacios+" espacios");
	
	}
}
