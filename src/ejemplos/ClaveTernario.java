package ejemplos;

import java.util.Scanner;

public class ClaveTernario {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	boolean acertaste=false;
	String secreta="daw";
	String palabra;
	
	System.out.println("Introduce la contraseña");
	palabra=sc.next();
	
	acertaste=palabra.equals(secreta)?true:false;
	
	/*  También valdría esto dado que .equals ya de por sí devuelve verdadero o falso
	 * 	acertaste=palabra.equals(secreta);
	 */

	if (acertaste)
		System.out.println("Acertaste");
	else
		System.out.println("No acertaste");		
	
	}
}
