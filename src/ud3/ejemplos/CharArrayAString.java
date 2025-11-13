package ud3.ejemplos;

public class CharArrayAString {

	public static void main(String[] args) {
		
		char[] letras = {'H', 'o', 'l', 'a'};
		letras[3]='i';
		String palabra = new String(letras);

		System.out.println(palabra); // Imprime: Holi

	}
}
