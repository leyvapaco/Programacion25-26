package ud6.veterinaria.v3;

public abstract class Domestico extends Animal{
	
    protected String nombre;
    protected int edad;
    protected String raza;
    protected String chip;
    
    
	public Domestico(Sexo sexo, int peso, Propietario propietario, String nombre, int edad, String raza, String chip) {
		super(sexo, peso, propietario);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.chip = chip;
	}

	// Método abstracto a implementar por las clases hijas Perro y Gato
	public abstract void cortaUnias();

	public String getRaza() {
		return raza;
	}
	
	
	
}
