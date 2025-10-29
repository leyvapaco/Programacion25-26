package martes;

import java.util.Scanner;

public class CuentaAtrás1 {
	public static void main(String[] args) {

		int numero=0;
		char letra;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce letra");
			letra=sc.nextLine().toLowerCase().charAt(0);
		}while (letra!='p');
		
		System.out.println("Fin");
	}

}
