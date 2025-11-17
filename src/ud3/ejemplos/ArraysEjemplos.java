package ud3.ejemplos;

import java.util.Arrays;

public class ArraysEjemplos {
	
	public static void main(String[] args) {
		
	// Declaración del array (sin valores aún)
	String[] nombres;

	// Inicialización con tamaño fijo
	nombres = new String[3];

	// Asignación de valores
	nombres[0] = "Berta";
	nombres[1] = "Ana";
	nombres[2] = "Carlos";
	
	System.out.println(nombres[1]);
	Arrays.sort(nombres);
	System.out.println(nombres[1]);	
	
	// Array con valores definidos directamente
	String[] colores = {"Rojo", "Verde", "Azul"};
	Arrays.sort(colores);
	
	
	for (int i = 0; i < colores.length; i++) {
	    System.out.println("Color " + i + ": " + colores[i]);
	}
	
	System.out.println("-----");
	for (String color:colores) {
		System.out.println("Color "+color);
	}
	System.out.println("-----");
	
	int[] edades= {12,23,34};
	
	for (int i = 0; i < edades.length; i++) {
	    System.out.println("Edad " + i + ": " + edades[i]);
	}
	
	Double[] notas= {3.7,6.2,9.25};
	Double[] aprobados= new Double[notas.length];;
	
	System.out.println("-----");
	int j=0;
	for (int i = 0; i < notas.length; i++) {
		if (notas[i]>=5.0) {
	        aprobados[j]=notas[i];
			j++;}
		
	}
	
	
	}
}
