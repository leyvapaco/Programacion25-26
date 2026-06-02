package ra7y6.refuerzo.altavoz;

public class AltavozTrasero extends AltavozCoche{
	
	private int potencia;
	private boolean elementosDecorativos;

	public AltavozTrasero(String numSerie, double altura, double anchura,  int potencia, boolean deco) {
		super(numSerie, altura, anchura);
		potencia=potencia;
		elementosDecorativos=deco;
	}


}
