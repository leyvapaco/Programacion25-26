package ud3.ejemplos;

/* Para entender las expresiones regulares: 
https://4geeks.com/es/lesson/expresiones-regulares-java
*/	

public class Regulares {
public static void main(String[] args) {
	
	
	String original = "Mi número es 123456Q";
	String oculto = original.replaceAll("\\d", "*");
	System.out.println(oculto); // Mi número es ******

	String dni = "58345678Z";
	boolean valido = dni.matches("^\\d{8}[A-Z]$");
	System.out.println("¿DNI válido? " + valido);
	
	String numero = "123444456";
	boolean soloNumeros = numero.matches("^\\d+$");
	System.out.println("¿Solo números? " + soloNumeros);
	
	String texto = "HolaMundo";
	boolean soloLetras = texto.matches("^[a-zA-Z]+$");
	System.out.println("¿Solo letras? " + soloLetras);
	
	String fecha = "13/11/2025";
	valido = fecha.matches("^\\d{2}/\\d{2}/\\d{4}$");
	System.out.println("¿Fecha válida? " + valido);
	
	String telefono = "612345678";
	valido = telefono.matches("^\\d{9}$");
	System.out.println("¿Teléfono válido? " + valido);
	
	String nombre = "Paco";
	valido = nombre.matches("^[A-Z][a-z]+$");
	System.out.println("¿Nombre válido? " + valido);
	
	texto = "Hola123@#Mundo!";
	String limpio = texto.replaceAll("[^a-zA-Z]", "");
	System.out.println(limpio); // HolaMundo
	
	String matricula = "1234-ABC";
	valido = matricula.matches("^\\d{4}-[A-Z]{3}$");
	System.out.println("¿Matrícula válida? " + valido);
	
	String palabra = "Azofaifa";
	boolean tieneVocal = palabra.matches(".*[aeiouAEIOU].*");
	System.out.println("¿Contiene vocal? " + tieneVocal);
		

	/* Más ejemplos:
	 
	 	https://discoduroderoer.es/ejercicios-propuestos-y-resueltos-expresiones-regulares-en-java/
	*/

}
}
