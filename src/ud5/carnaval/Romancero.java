package ud5.carnaval;


public final class Romancero extends Agrupacion implements Callejera{
	private String tematicaCartelo;
	
	public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo,String tematica) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		this.tematicaCartelo = tematica;
	}

	public void amo_a_escucha() {
		System.out.println("Amo a escucha el Romancero "+this.nombre);
		//Alternativa:
		//System.out.println("Amo a escucha el "+this.getClass().getSimpleName()+" "+this.nombre);
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación del Romancero con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("El Romancero "+this.nombre + " va de "+ this.tipo);
		
	}
	
	//Revisar
	@Override
	public String toString() {
		return "Romancero [tematicaCartelo=" + tematicaCartelo + ", nombre=" + nombre + ", autor=" + autor
				+ ", autorMusica=" + autorMusica + ", autorLetra=" + autorLetra + ", tipo=" + tipo + ", integrantes="
				+ "]";
	}
	
}
