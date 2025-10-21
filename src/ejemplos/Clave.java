package ejemplos;
import java.util.Scanner;

public class Clave {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	boolean acertado=false;
	String secreta="daw";
	String palabra;
	int intentos=3;
	
	do {
	
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
