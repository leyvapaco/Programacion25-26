package ud4.tarea1.ferroviaria;

public class JefeEstacion extends Personal {
	String dni;
	
	public JefeEstacion(String nombre, String dni){
		super(nombre);
		this.dni = dni;
	}

	@Override
	public void getInfoPersonal() {
		System.out.println("Nombre Completo: "+this.nombre);
		System.out.println("DNI: "+this.dni);
		
	}
}