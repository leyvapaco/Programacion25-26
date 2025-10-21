package ud1.ejemplos;
import java.util.Scanner;

//Usando bucle DO-WHILE

public class Clave {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	boolean acertado=false;
	String secreta="daw";
	String palabra;
	int intentos=3; //máximo número de intentos para acertar
	
	do { //Se repite mientras no acierte o no haya agotado los intentos
	
		System.out.println("Introduce la contraseña");
		palabra=sc.next();
	
		acertado=palabra.equals(secreta)?true:false;
		
		if (acertado)
			System.out.println("Login correcto");
		else {
			intentos--;
			System.out.println("Intentos restantes: "+intentos);
		}
	}while (!acertado && intentos>0);
		
  }
}
