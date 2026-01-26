package ud4.tarea1.ferroviaria;

public class Vagon extends Maquinaria {
	private int cargaMax;
	private int capacidadActual;
	private String mercancia;
	private int id=1;
	private static int cuantosVagones=0;
	
	Vagon(int cargaMax, int capacidadActual, String mercancia){
		this.cargaMax = cargaMax;
		this.capacidadActual = capacidadActual;
		this.mercancia = mercancia;
		this.id+=cuantosVagones++;
	}
	
	@Override
	public void getInfoMaquinaria() {
		System.out.println("Carga Maxima de la máquina: "+this.cargaMax+" kilos.");
		System.out.println("Capacidad actual de la máquina: "+this.capacidadActual);
		System.out.println("Tipo de mercancia: "+this.mercancia);
		
	}

	@Override
	public String toString() {
		return "Vagon [id=" + this.id + " " +this.mercancia + "]";
	}
	
	
}