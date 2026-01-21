package ud4.tarea1;

public class Banco {
	private final String nombre; //No incluimos setter
	private int capital;
	private String direccionCentral;
	
	Banco(String nombre, String direccionCentral){
		this.nombre=nombre;
		this.setDireccionCentral(direccionCentral);
		this.setCapital(5200000);
	}
	

	public String getDireccionCentral() {
		return direccionCentral;
	}

	public void setDireccionCentral(String direccionCentral) {
		this.direccionCentral = direccionCentral;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getNombre() {
		return nombre;
	}
	//No incluimos un setNombre() puesto que este no puede cambiarse
	
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", capital=" + capital + ", direccionCentral=" + direccionCentral + "]";
	}
	
	
}
