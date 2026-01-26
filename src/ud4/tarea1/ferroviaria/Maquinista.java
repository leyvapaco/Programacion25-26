package ud4.tarea1.ferroviaria;

public class Maquinista extends Personal{
	private String dni;
	private int sueldoMensual;
	private String rango;
	
	Maquinista(String nombre, String dni, int sueldo, String rango){
		super(nombre);
		this.dni = dni;
		this.sueldoMensual = sueldo;
		this.rango = rango;
	}

	@Override
	public void getInfoPersonal() {
		
		System.out.println("DNI: "+this.dni);
		System.out.println("Sueldo Mensual: "+this.sueldoMensual);
		System.out.println("Rango: "+this.rango);
		
	}
	
	
}