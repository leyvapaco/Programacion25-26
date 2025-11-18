package ud3.ejemplos;

public class Repaso1 {
	public static void main(String[] args) {
		
		System.out.println(funcion1("bonito","DIA"));
		System.out.println(funcion2("Bonito","Dia"));
		System.out.println(funcion3('5',"2"));
	}

	
	//	funcion1("bonito","Dia") devuelve "Bonito dia"
	//  Todo a minúsculas y la primera letra en mayúsculas
	
	static char[] funcion1(String cad1, String cad2) {
		String concatenadas;
		char[] resultado;
		
		concatenadas=cad1.toLowerCase()+" "+cad2.toLowerCase();

		resultado = concatenadas.toCharArray();
		resultado[0]=Character.toUpperCase(concatenadas.charAt(0));
		
		return resultado;
	}
	
	
	//	funcion2("Bonito","Dia") devuelve "DIA BONITO"
	//  Todo a mayúsculas
	
	static char[] funcion2(String cad1, String cad2) {
		String concatenadas;
		char[] resultado;
		
		concatenadas=cad2+" "+cad1;
		
		resultado = concatenadas.toCharArray();
		
		for(int i=0;i<concatenadas.length();i++)
			resultado[i]=Character.toUpperCase(resultado[i]);
		
		return resultado;
	}
	
	//Devuelve la suma de los dos argumentos que recibe
	static int funcion3(char car, String cad) {
		int resultado;
		
		resultado = Character.getNumericValue(car)+Integer.parseInt(cad);
		
		//¿Qué devolvería esto:?
		//resultado = (int) car+Integer.parseInt(cad);
		
		return resultado;
	}
	
}
