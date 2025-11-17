package ud3.tarea1;

public class Ej6 {
	static boolean esVocal(char letra) {
	     char c = Character.toLowerCase(letra);

	        switch (c) {
	            case 'a','e':
	            case 'i':
	            case 'o':
	            case 'u':
	                return true;
	            default:
	                return false;
	        }
	}
	
	public static void main(String[] args) {
		System.out.println(esVocal('A'));
	}

}
