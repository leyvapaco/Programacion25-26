package ud6.examen.optica.streams;


public class Montura{
	private String marca;
	private MaterialMontura  material;
	private String color;
	
	Montura( String marca,String color, MaterialMontura  material){
		this.marca = marca;
		this.color = color;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Montura [marca=" + marca + ", mat=" + material + ", color=" + color + "]";
	}
	
	
}
