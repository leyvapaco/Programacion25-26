package ud5.carnaval;

import java.util.Arrays;

public final class Comparsa extends AgrupacionOficial {

	private String empresaAtrezo;
	
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo , String empresaAtrezo, int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo, numIntegrantes);
		this.empresaAtrezo = empresaAtrezo;
		
	}

	@Override
	public void caminito_del_falla() {
		System.out.println("La comparsa " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación de la Comparsa con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("La Comparsa "+this.nombre + " va de "+ this.tipo);
		
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"[Comparsa [empresaAtrezo=" + empresaAtrezo + "]";
	} 


}
