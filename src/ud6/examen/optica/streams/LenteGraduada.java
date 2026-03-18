package ud6.examen.optica.streams;


public class LenteGraduada extends Lente{

	private TipoProblema problema;
	private double gradoCorreccion;
	
	
	LenteGraduada(char pos,TipoProblema problema, double grado) {
		super(pos);
		this.gradoCorreccion = grado;
		this.problema = problema;
	}
	
	
	public void dimeTipoLente() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Lente Graduada [problema=" + problema + ", gradoCorreccion=" + gradoCorreccion + ", pos=" + pos + "]";
	}

	
	
}