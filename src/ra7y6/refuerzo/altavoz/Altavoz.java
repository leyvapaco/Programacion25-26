package ra7y6.refuerzo.altavoz;

import java.io.Serializable;

public abstract class Altavoz implements Comparable<Altavoz>, Serializable {
	

	protected String numSerie;
	protected double altura;
	protected double anchura;
	
	private static int cuantosAltavoces=0;
	
	public Altavoz(String numSerie, double altura, double anchura) {
		this.numSerie = numSerie;
		this.altura = altura;
		this.anchura = anchura;
		
		cuantosAltavoces++;
	}

	public String getNumSerie() {
		return numSerie;
	}
	
	public static void cuantosAltavoces() {
		System.out.println("Creados "+cuantosAltavoces+" altavoces");
	}
	
	@Override
	public int compareTo(Altavoz o) {
		
		if(this.altura>o.altura)
	          return -1;
	    else if(o.altura>this.altura)
	          return 1;
	    return 0;
	}

	
	
	public double getAnchura() {
		return anchura;
	}

	@Override
	public String toString() {
		return "Altavoz [numSerie=" + numSerie + ", altura=" + altura + "]";
	}

	
}
