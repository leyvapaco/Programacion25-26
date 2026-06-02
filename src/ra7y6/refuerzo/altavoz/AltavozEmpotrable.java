package ra7y6.refuerzo.altavoz;

public class AltavozEmpotrable extends AltavozCoche{

	public enum Ubicacion {PUERTA, SALPICADERO}
	private Ubicacion lugarInstalacion;
	
	public AltavozEmpotrable(String numSerie, double altura, double anchura, Ubicacion lugar) {
		super(numSerie, altura, anchura);
		this.lugarInstalacion=lugar;
	}


}
