package ra7y6.refuerzo.altavoz;

public abstract class AltavozCoche extends Altavoz implements Grave {
	

	public AltavozCoche(String numSerie, double altura, double anchura) {
		super(numSerie, altura, anchura);
	}
	
	public void activarGraves() {
		System.out.println("Activando graves de "+this.getClass().getSimpleName());
	}

}
