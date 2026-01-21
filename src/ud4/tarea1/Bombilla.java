package ud4.tarea1;

public class Bombilla {
	private boolean estado;
	private static boolean estadoGeneral = true;
	
	Bombilla(boolean estado){
		this.estado=estado;
	}

	public void getEstado() {
		if(this.estado == false || estadoGeneral == false) {
			System.out.println("Apagada");
		} else {
			System.out.println("Encendida");
		}
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public static void apagaGeneral() {
		estadoGeneral = false;
	}
	
	public static void enciendeGeneral() {
		estadoGeneral = true;
	}
}

