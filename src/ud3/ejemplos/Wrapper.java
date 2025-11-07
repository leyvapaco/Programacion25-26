package ud3.ejemplos;

public class Wrapper {
	public static void main(String[] args) {
	
		int natural;
		double decimal;
		boolean continuar;
		String texto="12.3";
		
		Integer naturalW = 10;
		Double decimalW = 3.14;
		Boolean continuarW = true;
	
	
		naturalW=10; //Conversión de tipo primitivo a objeto wrapper (boxing)
		System.out.println("salida 1: "+naturalW);
		
		natural=naturalW;		//Conversión de objeto wrapper a tipo primitivo (unboxing)
		System.out.println("salida 2: "+natural);
		
	    //nota vale 10. Vamos a compararla con otras notas
		natural=naturalW.compareTo(10); //La comparación devuelve 0 si son iguales, 1 ó -1 según sea mayor o menor
		System.out.println("salida 3: "+natural);
		
		natural=naturalW.compareTo(12); // nota es menor que 12
		System.out.println("salida 4: "+natural);
		
		natural=naturalW.compareTo(8); // nota es mayor que 8
		System.out.println("salida 5: "+natural);
		
		// Quedarnos con el valor entero de un número decimal
		natural=decimalW.intValue();
		System.out.println("salida 6: "+natural);
		
		// Quedarnos con el valor decimal de un entero
		decimal=naturalW.doubleValue();
		System.out.println("salida 7: "+decimal);
		
		//Conversión de número a cadena
		texto=naturalW.toString();
		System.out.println("salida 8: "+texto);
		
	}
}
