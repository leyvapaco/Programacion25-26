package ud1.ejemplos;

import java.util.Scanner;

public class Hucha {
	public static void main(String[] args) {
		final int CAPACIDAD = 80;
		int saldo = 0;
		int aportacion;
		int veces=0;
		boolean llena=false;
		Scanner sc=new Scanner(System.in);
		
		while (!llena) {
			System.out.println("Introduce dinerito");
			aportacion=sc.nextInt();
			
			if ((saldo+aportacion)>CAPACIDAD)
				System.out.println("No cabe tanto dinerito");
			else{
					saldo+=aportacion;
					System.out.print("Saldo: "+saldo+"\n\n");
					veces++;
				}			
			if (saldo==CAPACIDAD)
				llena=true;
			
		}
		System.out.println("Hucha llenaaaaa !!!  aportaciones: "+veces);
	
	}
}
