package ud5.carnaval;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
	
	protected int puntos= 0;
	protected Integrante[] integrantes;
	protected int numIntegrantes;
	
	AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		this.puntos=0;
		this.numIntegrantes = 0;
		this.integrantes = new Integrante [numIntegrantes];
	}
	
	

	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	
	public abstract void caminito_del_falla();
	
	@Override
	public abstract void cantar_la_presentacion();

	@Override
	public abstract void mostrar_tipo();
	
	public void insertar_integrante(Integrante integrante) {
		if (this.numIntegrantes < this.integrantes.length) {
			this.integrantes[this.numIntegrantes++] = integrante; 
		} 
	}
				
	public boolean eliminar_integrante(Integrante integrante) {
	    boolean eliminado = false;
	    int pos = 0;

	    // Buscar integrante
	    while (pos < numIntegrantes && !integrantes[pos].equals(integrante)) {
	        pos++;
	    }

	    // Si se encontró, desplazar
	    if (pos < numIntegrantes) {
	        int i = pos;
	        while (i < numIntegrantes - 1) {
	            integrantes[i] = integrantes[i + 1];
	            i++;
	        }
	        integrantes[numIntegrantes - 1] = null;
	        numIntegrantes--;
	        eliminado = true;
	    }

	    return eliminado;
	}


	@Override
	public String toString() {
		return super.toString()+" puntos=" + puntos + ", integrantes=" + Arrays.toString(integrantes);
	}

}
