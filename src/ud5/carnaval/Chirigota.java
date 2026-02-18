package ud5.carnaval;

import java.util.Arrays;

public final class Chirigota extends AgrupacionOficial implements Callejera{

	private int numCuples;

	
	public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo,int numCuples,int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo, numIntegrantes);
		this.numCuples = numCuples;
		
	
	}

	@Override
	public void caminito_del_falla() {
		
		System.out.println("La chirigota " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación de la Chirigotacon nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("La chirigota "+this.nombre + " va de "+ this.tipo);
	}
	public void amo_a_escucha() {
		System.out.println("Amo a escucha la Chirigota "+this.nombre);
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"[numCuples=" + numCuples + "]";
	}
	
}
