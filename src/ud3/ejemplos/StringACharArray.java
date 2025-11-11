package ud3.ejemplos;

public class StringACharArray {
	public static void main(String[] args) {
	String saludo = "Hola";
	char[] caracteres = saludo.toCharArray();

	for (int i=0;i<=3;i++) {
	    System.out.print(caracteres[i]);
	}

	System.out.println();
	
	for (char c : caracteres) {
	    System.out.print(c);
	}

}
}
