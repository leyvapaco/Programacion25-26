package ud6.examen.optica.streams;


public class LenteSinGraduar extends Lente {
	private ColorLente  color;

	LenteSinGraduar(char pos, ColorLente  color) {
		super(pos);
		this.color = color;
	}

	
	public void dimeTipoLente() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Override
	public String toString() {
		return "Lente Sin Graduar [color=" + color + ", pos=" + pos + "]";
	}
	
	

}
