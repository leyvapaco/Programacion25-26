package ud1.examen;

import java.util.Scanner;

public class Ej1 {
public static void main(String[] args) {
	int numero;
	final int MAX=100;
	int sumaTotal=0; //Suma de todos los números introducidos
	int cuantosLlevo=0; //Cantidad de números introducidos
	double media;	
	
	Scanner sc=new Scanner(System.in);
	
	do {
		System.out.println("Introduce un número entero par: ");
		numero=sc.nextInt();
	
		if (numero%2!=0)
				System.out.println("El número introducido no es par. Introducelo de nuevo");
		else {
			sumaTotal+=numero;
			cuantosLlevo++;}
	}while (sumaTotal<=MAX); //Repetimos hasta que la suma total supere 100
	
	media=(double)sumaTotal/cuantosLlevo;
	System.out.println("La media es: "+media);
}
}
