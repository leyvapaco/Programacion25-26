package ud5.carnaval;

import java.util.Arrays;

public class COAC {
	private AgrupacionOficial[] agrupacionesOf;
	private int MAX_AGRUPACIONES=4;
	private int numAgrupaciones;
		
	
	public COAC(){
		this.agrupacionesOf = new AgrupacionOficial[MAX_AGRUPACIONES];
		this.numAgrupaciones=0;
	}
	
			
	public void inscribir_agrupacion(AgrupacionOficial agrupacion) { 
		if (this.numAgrupaciones < this.agrupacionesOf.length) { 
			this.agrupacionesOf[numAgrupaciones++] = agrupacion; } 
	}
				
	public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
	    boolean eliminado = false;
	    int i = 0;

	    // Buscar la posición
	    while (i < numAgrupaciones && !agrupacionesOf[i].equals(agrupacion)) {
	        i++;
	    }

	    // Si se encontró, eliminar desplazando
	    if (i < numAgrupaciones) {
	        int j = i;
	        while (j < numAgrupaciones - 1) {
	            agrupacionesOf[j] = agrupacionesOf[j + 1];
	            j++;
	        }
	        agrupacionesOf[numAgrupaciones - 1] = null;
	        numAgrupaciones--;
	        eliminado = true;
	    }

	    return eliminado;
	}

	
	 public void ordenar_por_nombre() { 
		// Por defecto usa el compareTo establecido, que es por nombre
		 Arrays.sort(agrupacionesOf);
		 this.mostrar();
		 //Alternativa: System.out.println(this.toString());
	 }
 	 
	 public void ordenar_por_puntos() {
		 //Instancio un comparador por puntos
		 Arrays.sort(agrupacionesOf,new ComparatorPuntos());
		 this.mostrar();
	 }
	
	 
	 public void ordenar_por_autor() {
		//Instancio un comparador por autor
		 Arrays.sort(agrupacionesOf,new ComparatorAutor());
		 this.mostrar();
	 }
	 
	 public void mostrar() { 
		 for (int i = 0; i < numAgrupaciones; i++) {
			 System.out.println(agrupacionesOf[i]); 
			 } 
	}
	 
	
		@Override
	public String toString() {
		return "COAC [grupos=" + Arrays.toString(agrupacionesOf) + "]";
	}

}
