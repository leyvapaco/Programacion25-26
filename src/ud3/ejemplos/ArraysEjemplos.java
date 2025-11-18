package ud3.ejemplos;

import java.util.Arrays;

public class ArraysEjemplos {
	
	public static void main(String[] args) {
		
		nombres();
		//colores();
		//edades();
		//caracteres();
		
		/*
		int [] naturales= {1,2,3,4};
		modificaArray(naturales);
		System.out.println(Arrays.toString(naturales));
		*/
}
	
	static void nombres() {
		// Declaración del array (sin valores aún)
		String[] nombres= new String[3];

		// Asignación de valores
		nombres[0] = "Berta";
		nombres[1] = "Ana";
		nombres[2] = "Carlos";


		System.out.println("Primer elemento:"+nombres[0]);
		Arrays.sort(nombres); //Ahora Ana pasa a la primera posición
		
		System.out.println("Primer elemento:"+nombres[0]);	//

	}
	
	static void colores() {
		// Array con valores definidos directamente
		String[] colores = {"Rojo", "Verde", "Azul"};
		System.out.println("Referencia al array en memoria: "+colores);
		System.out.println("Sin ordenar: "+Arrays.toString(colores));
		Arrays.sort(colores);
		System.out.println("Ordenado: "+Arrays.toString(colores));
		
		for (int i = 0; i < colores.length; i++) {
		    System.out.println("Color [" + i + "]: " + colores[i]);
		}
		
		//Copiar un array en otro más grande
		String[] colores2 =Arrays.copyOf(colores, 6);
		colores2[3]="Naranja"; //Ahora puedo añadir un nuevo elemento
		System.out.println("\n¿Son iguales los arrays:? "+Arrays.equals(colores,colores2));
		
		System.out.println("\n -----");
		
	    //Otra forma de recorres los elementos del array
		for (String color:colores2) {
			System.out.println("Color "+color);
		}
	}
	
	static void edades() {
		//Array de enteros
		
		int[] edades= {12,23,34};
		
		for (int i = 0; i < edades.length; i++) {
		    System.out.println("Edad " + i + ": " + edades[i]);
		}
	}
	
	static void notas() {
		//Array de Doubles (wrapper)
		Double[] notas= {3.7,6.2,9.25};
		Double[] aprobados= new Double[notas.length];
		
		System.out.println("\n5 -----");
		
		int j=0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>=5.0) {
		        aprobados[j]=notas[i];
				j++;} 
			
		}
		System.out.println(Arrays.toString(aprobados));
		
		for (Double elemento:aprobados) {
			System.out.println("Aprobado: "+elemento);
		}

		//Observar qué sucede si es double en lugar de Double
		
		System.out.println("\n6 -----");}
	
	static void caracteres() {
		//Array de caracteres
		char [] letras= new char[5];
		
		Arrays.fill(letras,'a'); //Rellena el array con el carácter indicado
		System.out.println(Arrays.toString(letras)); 
		
		for (char elemento:letras) {
			System.out.println(elemento);
		}
	}
	
	static void modificaArray(int [] numeros) {
		numeros[0]*=-1;
	}
	
}
