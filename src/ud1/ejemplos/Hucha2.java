package ud1.ejemplos;

import java.util.Scanner;

public class Hucha2 {
	public static void main(String[] args) {
		final int capacidad = 80;
		int saldo = 0;
		int aportacion;
		int veces=0;
		boolean llena=false;
		char operacion;
		Scanner sc=new Scanner(System.in);
				
			
		while (!llena) {
			System.out.println("Introduce operación I/R");
			operacion=sc.nextLine().charAt(0);
				
			System.out.println("Indica cantidad");
			aportacion=sc.nextInt();
			sc.nextLine();
			
			switch (operacion) {
					case 'I': 
						if ((saldo+aportacion)>capacidad)
							System.out.println("No cabe tanto dinerito");
						else
							saldo=saldo+aportacion;
						if (saldo==capacidad)
							llena=true;
						break;
					case 'R': 
						saldo=saldo-aportacion;	
						break;
					}
					System.out.print("\nSaldo: "+saldo+"\n\n");
					veces++;
				}			

			System.out.println("Hucha llenaaaaa !!!  aportaciones: "+veces);
		}
		
	
}

