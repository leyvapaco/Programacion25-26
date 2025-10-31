package ud2.ejemplos;

public class Ejemplo4 {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		try {
			c=a/b;
		}catch (ArithmeticException e) {
			System.out.println("Primer catch");

		}catch (Exception e) {
			System.out.println("No se puede dividir por cero");

		}
		
		
		System.out.println("¿Llega aquí?");
		
	}

}

