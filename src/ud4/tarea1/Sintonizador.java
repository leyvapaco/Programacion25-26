package ud4.tarea1;
public class Sintonizador {
	private final int minMHz = 80;
	private final int maxMHz = 108;
	private float frecuencia;
	
	Sintonizador(){
		this.frecuencia=80;
	}


	public float up() {
		
		if(this.frecuencia < maxMHz) {
			this.frecuencia = (float) (frecuencia + 0.5); 
		} else {
			this.frecuencia = 80;
		}
		
		return frecuencia;
	}
	
	public float down() {
		
		if(this.frecuencia > minMHz) {
			this.frecuencia = (float) (frecuencia - 0.5); 
		} else {
			this.frecuencia = 108;
		}
		
		return frecuencia;
	}

	public float display() {
		return frecuencia;
	}
}
