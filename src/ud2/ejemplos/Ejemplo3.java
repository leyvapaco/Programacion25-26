package ud2.ejemplos;

public class Ejemplo3 {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		try {
			c=a/b;
//		}catch (Exception e) {    La captura de Exception siempre debe ser la última
//			System.out.println("Primer catch");

		}catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");

		}
		
		
		System.out.println("¿Llega aquí?");
		
	}

}

