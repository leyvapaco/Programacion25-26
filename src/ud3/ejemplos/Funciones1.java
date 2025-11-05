package ud3.ejemplos;

public class Funciones1 {
	public static void main(String[] args) {
		String nombre="Paco";
		/*
		saluda("ES","Paco");
		saluda("EN",nombre);	
		saluda("DE",nombre);*/
		
		double miArea=areaTriangulo(10,20);
		System.out.println("el area es:"+miArea);
		
		System.out.println("el area es:"+areaTriangulo(5,20));
		
		
		
	} //Aqui acaba el main
	
	static double areaTriangulo(int base, int altura) {
		double area=base*altura/2;
		return area;
		
	}
	
	static void saluda(String idioma, String nombre) {
		switch (idioma) {
		case "ES":
			System.out.println("Holaaa "+nombre+" ¿cómo estás?");
			break;
			
		case "EN":
			System.out.println("Hellow "+nombre+ " how are you?");
			break;
			
		case "DE":
			System.out.println("Hi "+nombre+ " wie geht is dir?");
			break;
		default:
			System.out.println("Idioma no definido");	
			
		}
	}

}
