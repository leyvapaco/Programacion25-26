package ud1.ejemplos;

public class CuadriculaEstrellas {
	public static void main(String[] args) {
		
		// Cada salto en i permite pintar una fila nueva
		// Para cada valor de i, pintamos 5 estrellas haciendo uso de j
				
		for (int i=0;i<5;i++) { 
			for (int j=0;j<5;j++) // Pinta 5 estrellas en horizontal
				System.out.print("*");
			System.out.println(); //Después de las 5 estrellas hace un salto de línea
		}
	}
}
