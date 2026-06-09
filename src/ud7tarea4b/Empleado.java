package ud7tarea4b;

public class Empleado extends Persona{

	private int sueldo;
	
	Empleado(String nombre, String dni, int edad, int estatura, int sueldo){
	 super(nombre, dni, edad, estatura);
	 this.sueldo= sueldo;
	 
		
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [ " + super.toString() +" sueldo=" + sueldo + " ]";
	}
	
	
	
	
}
