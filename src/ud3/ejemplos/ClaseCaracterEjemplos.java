package ud3.ejemplos;

//Consulta los métodos de Char
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html

public class ClaseCaracterEjemplos {
	public static void main(String[] args) {
	
		Character letra='P';
		Character digito='1';
		Character operacion='*';
		
		System.out.println("salida 1: "+Character.isDigit(letra));
		System.out.println("salida 2: "+Character.isDigit(digito));
		
		System.out.println("salida 3: "+Character.isLetter(letra));
		System.out.println("salida 4: "+Character.isLetter(digito));
		
		System.out.println("salida 5: "+Character.isUpperCase(letra));
		
		System.out.println("salida 6: "+Character.isLetterOrDigit(letra));
		System.out.println("salida 7: "+Character.isLetterOrDigit(operacion));
		System.out.println("salida 8: "+Character.getNumericValue('1'));
		
}
}
