package ra7y6.refuerzo.altavoz;

public class AltavozTV extends Altavoz {
	
	public enum Conector {BLUETOOTH, IR, JACK};
	private Conector conector;
	
	public AltavozTV(String numSerie, double altura, double anchura, Conector iCon) {
		super(numSerie, altura, anchura);
		
		conector=iCon;
	}



}
