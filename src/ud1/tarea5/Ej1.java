package ud1.tarea5;

import java.util.Scanner;

/*
Escribe un programa que pida por teclado un día de la semana
 y que diga qué asignatura toca a primera hora ese día.*/

public class Ej1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el día de la semana");
		String dia;
		
		dia=sc.nextLine();
		
		if (dia.equals("Lunes"))
				System.out.println("Programación");
		
		
	}

}
