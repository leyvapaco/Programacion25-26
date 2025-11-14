
package ud3.tarea2;

import java.util.Scanner;

public class Ej6 {
	
	public static boolean contrasenyaCharArray(String secreta) {
		Scanner sc =new Scanner(System.in);
		char[] arraySecreta = secreta.toCharArray();
		boolean coinciden = true;
		
		System.out.println("\nPISTAS:");
		System.out.println("La longitud de la contraseña es :"+arraySecreta.length);
		System.out.println("El primer caracter de la contraseña es: "+arraySecreta[0]);
		System.out.println("El ultimo caracter de la contraseña es: "+arraySecreta[arraySecreta.length-1]);
		
		System.out.println("\n¿Cuál crees que es:");
		char[] arrayIntroducida = sc.next().toCharArray();
			
		for (int i=0;i<arrayIntroducida.length;i++){
			
			if(arrayIntroducida[i]!=arraySecreta[i])
				coinciden=false;
		}
		return coinciden;
		
		
	}

	public static boolean contrasenyaString(String secreta) {
		Scanner sc =new Scanner(System.in);
		boolean coinciden = true;
		
		System.out.println("\nPISTAS:");
		System.out.println("La longitud de la contraseña es :"+secreta.length());
		System.out.println("El primer caracter de la contraseña es: "+secreta.charAt(0));
		System.out.println("El ultimo caracter de la contraseña es: "+secreta.charAt(secreta.length()-1));
		
		System.out.println("\n¿Cuál crees que es:");
		String introducida= sc.next();
			
		if (!introducida.equals(secreta))
				coinciden=false;
	
		return coinciden;		
	}
	
	public static void main(String[] arg) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Establezca la contraseña:");
		String contrasenya = sc.next();
		
		// 	SOLUCION USANDO ARRAY DE CARACTERES 
		while (!contrasenyaString(contrasenya)) {		
			System.out.println("Fallaste");	
		}
		
	/* 	SOLUCION USANDO STRING
		while (!contrasenyaString(contrasenya)) {		
			System.out.println("Fallaste");	
		} */
		
		System.out.println("Acertaste");
	}

}