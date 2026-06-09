package ud7tarea4b;

public class Persona {
	
	private String nombre;
	private String dni;
	private int edad;
	private int estatura;
	
	Persona (String nombre, String dni, int edad, int estatura){
		this.nombre=nombre;
		this.dni=dni.toUpperCase();
		this.edad=edad;
		this.estatura=estatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

}
