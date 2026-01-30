package ud5.tarea1;

public class EtiquetaNumero {
    private final int numeroEtiqueta;

	public EtiquetaNumero(int numeroEtiqueta) {
		this.numeroEtiqueta = numeroEtiqueta;
	}

	@Override
	public String toString() {
		return "[número=" + numeroEtiqueta + "]";
	}
   
	
}
