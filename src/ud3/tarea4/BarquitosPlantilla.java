package ud3.tarea4;

import java.util.Scanner;

public class BarquitosPlantilla {

//Crea un tablero cuadrado y asigna 
//a cada celda el carácter '\u007E' (virgulilla) 
static void creaTablero(char[][] tablero) {

}
	
//Sitúa 8 barcos en una posición aleatoria en un
//tablero previamente creado
static void ponOchoBarcos(char[][] tablero) {

}

//Pinta por consola el tablero previamente creado
static void pintaTableroConBarcos(char[][] tablero) {	

}

//Pinta por consola el tablero pero sin mostrar las celdas con barcos ('O')
static void pintaTableroSoloHundidos(char[][] tablero) {	

}


//Si hay un barco en el tablero, en las coordenadas (x,y)
//lo marca con una X (hundido) y devuelve true, en caso 
//contrario devuelve false
static boolean dispara(char[][] tablero, int x, int y) {	
	boolean hundido=false;
		

			
}

//Devuelve true si queda algún barco pendiente de hundir
//y false en caso contrario
static boolean quedanBarcos(char[][] tablero) {	
	boolean quedanBarcos=false;
		

			
}
	
public static void main(String[] args) {
	
	char[][] tablero = new char[8][8];
	Scanner sc=new Scanner(System.in);
	String coordenadas;
	int coordX, coordY=0;
			
	creaTablero(tablero);
	ponOchoBarcos(tablero);
	pintaTableroConBarcos(tablero);
	
	do { 
		do { 
			System.out.print("\n------------------");
			System.out.print("\nDime coordenadas (p.e A4): ");
			coordenadas=sc.next().toLowerCase();
				System.out.println("Coordenadas no válidas");
		} while (!coordenadas.matches("^[A-Ha-h][1-8]$"));
		
		coordX=coordenadas.charAt(0);
		coordY=coordenadas.charAt(1);
		
		coordX=coordX-'a';
		coordY=coordY-'0';

		System.out.println("coordX:"+coordX);
		System.out.println("coordY:"+coordY);
		
		if (dispara(tablero,coordY-1,coordX))
			System.out.println("\n¡¡¡HUNDIDO!!!\n");
		else
			System.out.println("\n!!AGUA!!\n");
		
		pintaTableroSoloHundidos(tablero);
			
	}while (quedanBarcos(tablero));
	
	System.out.println("\n¡¡¡LO CONSEGUISTE!!!");
	
	}
}
