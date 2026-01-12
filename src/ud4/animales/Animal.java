package ud4.animales;

public abstract class Animal { //Clase abstracta, no se puede instanciar
	private String nombre;
	private int edad;
	static int vidas=0; //Atributo estático, perteneca a la clase y no a las instancias
	
	//Omitimos el constructor al ser una clase abstracta, aunque es factible crearlo
	
	public abstract void comunicarse(); //Método abstracto, las clases hijas deben implementarlo

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static void getVidas() {  //Método estático, pertenece a la clase y no a las instancias
		System.out.println("Vidas creadas: "+vidas);
	}


}
