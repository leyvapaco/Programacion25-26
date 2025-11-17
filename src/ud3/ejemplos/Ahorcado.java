package ud3.ejemplos;

import java.util.Scanner;

public class Ahorcado {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final String SECRETA="Azofaifa"; 	//Palabra secreta. Observa que es de tipo String y como tal le aplican los métodos de String
	final int MAX_INTENTOS=10;
	boolean acertado=false;
	int intentos=0;						// Total de intentos realizados
	char letra; 						// letra que introduce el usuario en cada intento
	int cuantasSinAcertar;				// Permite controlar cuantas letras me quedan por acertar
	
	// Variable para almacenar las letras que vamos descubriendo
	// La inicializamos con el tamaño de la palabra secreta (a los arrays siempre hay que darles un tamaño inicial)
	char [] palabra=new char[SECRETA.length()];
	
	// La rellenamos con un punto por cada letra a acertar 
	for (int i=0;i<SECRETA.length();i++)
		palabra[i]='.';
		
	// Pedimos letra al usuario mientras no acierte o queden intentos
	do {
		System.out.println("\nDime letra: ");
		letra=sc.next().charAt(0);
		
		cuantasSinAcertar=0;
		
		// Recorremos todas las letras de la palabra secreta
		for (int i=0;i<SECRETA.length();i++) {
			// Si acierta la letra, la mostramos en el char array
			if (SECRETA.toLowerCase().charAt(i)==letra)
				palabra[i]=letra;
		    // Contamos las letras que quedan sin acertar
			if (palabra[i]=='.')
				 cuantasSinAcertar++;
		}
		
		if (cuantasSinAcertar==0) //Ya hemos acertado todas las letras
			acertado=true;
		else {
				intentos++;
				// Informamos de los intentos restantes
				System.out.println("Te quedan "+(MAX_INTENTOS-intentos)+" intentos");
		}
		
		System.out.println(palabra);

	}while(intentos<MAX_INTENTOS && !acertado);
	
	if (acertado)
		System.out.println("Acertaste!!");
}
}
