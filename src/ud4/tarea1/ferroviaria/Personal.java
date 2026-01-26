package ud4.tarea1.ferroviaria;

public abstract class Personal extends EmpresaFerroviaria {
	protected String nombre; //Como es común a todos los hijos, lo ponemos aquí
	
	public Personal(String nombre) {
	        this.nombre = nombre;
	    }
	
	public abstract void getInfoPersonal();
}