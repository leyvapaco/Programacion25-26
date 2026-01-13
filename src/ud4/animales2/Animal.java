package ud4.animales2;

public abstract class Animal { //Clase abstracta, no instancia objetos
	private String nombre;
	private int edad;
	static int vidas=0; //Atributo estático, pertenece a la clase en general
	
	//Podemos tener o no constructor en una clase abstracta
	Animal(){
		vidas++;
	}

	
	public abstract void comunicate(); //Método abstracto, las clases hijas deben implementarlo
	
	public abstract void reproducete(); //Método abstracto, las clases hijas deben implementarlo
	
	public static void muere() { //Método estático, pertenece a la clase y no a las instancias: Animal.muere();
		vidas--;
		System.out.println("He muerto");
	}
	
	public String getNombre() { //getter
		return nombre;
	}

	public void setNombre(String nombre) { //setter
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static void getVidas() { //Método estático, pertenece a la clase y no a las instancias
		System.out.println("Vidas totales: "+vidas);
	}

}
