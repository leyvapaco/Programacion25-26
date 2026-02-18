package ud5.carnaval;

public abstract class Agrupacion implements Comparable<Agrupacion>{
	protected String nombre;
	protected String autor;
	protected String autorMusica;
	protected String autorLetra;
	protected String tipo; //disfraz

	private static int numAgrupaciones; //Total de agrupaciones
	
	
	Agrupacion(String nombre,String autor,String autorMusica,String autorLetra , String tipo){
		this.nombre = nombre;
		this.autor = autor;
		this.autorMusica = autorMusica;
		this.autorLetra = autorLetra;
		this.tipo = tipo;

		numAgrupaciones = numAgrupaciones+ 1;
	}
		
	
	public abstract void cantar_la_presentacion();
	
	public abstract void mostrar_tipo();

	public static int getNumAgrupaciones() {
		return numAgrupaciones;
	}
	
	
	@Override
	//Implemento el interfaz Comparable con la ordenación por defecto (String)
	public int compareTo(Agrupacion agrupacion) {
			return this.nombre.compareTo(agrupacion.nombre);
	}

	
	@Override public String toString() {
		return getClass().getSimpleName() + ": " + nombre + " (" + autor + ")"; }
	
	
}
