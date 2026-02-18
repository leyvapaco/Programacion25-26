package ud5.carnaval;

import java.util.Arrays;

public final class Cuarteto extends AgrupacionOficial implements Callejera{
	private int numMiembros;
	
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numMiembros) {
		super(nombre, autor, autorMusica, autorLetra, tipo,4);
		this.numMiembros = numMiembros;
		
	}

	@Override
	public void caminito_del_falla() {
	System.out.println("El cuarteto " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación del cuarteto con nombre " + this.nombre);
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("El cuarteto "+this.nombre + " va de "+ this.tipo);
	}
	public void amo_a_escucha() {
		System.out.println("Amo a escucha - Cuarteto "+this.nombre);
		
	}

	
	@Override
	public String toString() {
		return super.toString()+"[numMiembros=" + numMiembros +"]";
	}
}
