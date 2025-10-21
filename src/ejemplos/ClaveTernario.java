package ejemplos;

import java.util.Scanner;

public class ClaveTernario {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	boolean autenticado=false;
	String secreta="daw";
	String palabra;
	
	System.out.println("Introduce la contraseña");
	palabra=sc.next();
	
	autenticado=palabra.equals(secreta)?true:false;

	if (autenticado)
		System.out.println("Acertaste");
	else
		System.out.println("No acertaste");		
	
	}
}
