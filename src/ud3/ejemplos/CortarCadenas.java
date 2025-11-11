package ud3.ejemplos;

public class CortarCadenas {
	public static void main(String[] args) {
		String texto = "manzana,pera,plátano";
		String[] frutas = texto.split(",");

		for (int i=0;i<3;i++) {
		    System.out.println(frutas[i]);
		}
		
		/*
		for (String fruta : frutas) {
		    System.out.println(fruta);
		}*/

	}
}
