package ud5.carnaval;

public final class Coro extends AgrupacionOficial {
	private int numBandurrias;
	private int numGuitarras;
	
	public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numBandurrias , int numGuitarras,int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo,numIntegrantes);
		this.numBandurrias = numBandurrias;
		this.numGuitarras = numGuitarras;
		
	}

	@Override
	public void caminito_del_falla() {
	  System.out.println("El coro " + this.nombre +" va caminito del falla");	
		
	  //Alternativa:
	  //System.out.println(this.getClass().getSimpleName() + this.nombre +" va caminito del falla");	 
				
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación del coro con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		super.toString();
		System.out.println("El coro "+this.nombre + " va de "+ this.tipo);
		
	}

	
	@Override
	public String toString() {		
		return  super.toString()+"[ numBandurrias=" + numBandurrias + ", numGuitarras=" + numGuitarras + "]";
	}


	
}
