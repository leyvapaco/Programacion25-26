package ud4.animales2;

public abstract class Animal {
	private String nombre;
	private int edad;
	static int vidas=0;
	
	//Omitimos el constructor aunque es factible crearlo
	Animal(){
		vidas++;}

	
	public abstract void comunicate(); //Método abstracto, las clases hijas deben implementarlo
	
	public abstract void reproducete();
	
	public static void muere() { //Método estático, pertenece a la clase y no a las instancias
		vidas--;
		System.out.println("He muerto");
	}
	
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

	public static void getVidas() { //Método estático, pertenece a la clase y no a las instancias
		System.out.println("Vidas totales: "+vidas);
	}


}
