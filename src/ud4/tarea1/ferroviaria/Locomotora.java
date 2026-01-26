package ud4.tarea1.ferroviaria;

public class Locomotora extends Maquinaria {
	private String matricula;
	private int potencia;
	private String anoFabricacion;
	private Mecanico mecanico;
	
	Locomotora(String matricula, int potencia, String anoFabricacion,Mecanico mecanico){
		this.matricula = matricula;
		this.potencia = potencia;
		this.anoFabricacion = anoFabricacion;
		this.mecanico=mecanico;
	}
	
		
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}


	@Override
	public void getInfoMaquinaria() {
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Potencia: "+this.potencia);
		System.out.println("Año de fabricación: "+this.anoFabricacion);
		System.out.println("Mecánico: "+this.mecanico.nombre);
	}
	
}