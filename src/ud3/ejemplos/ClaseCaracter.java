package ud3.ejemplos;

public class ClaseCaracter {
	public static void main(String[] args) {
	
		Character letra='p';
		Character digito='1';
		
		System.out.println("salida 1: "+Character.isDigit(letra));
		System.out.println("salida 2: "+Character.isDigit(digito));
		
		System.out.println("salida 3: "+Character.isLetter(letra));
		System.out.println("salida 4: "+Character.isLetter(digito));
		
		System.out.println("salida 5: "+Character.isUpperCase(letra));
		
		System.out.println("salida 6: "+Character.isLetterOrDigit(letra));
		System.out.println("salida 7: "+Character.getNumericValue(digito));
		
}
}
