package ud5.tarea1;

	public abstract class Instrumento {
		private final static int TAM_MAX = 100;
		protected static notaMusical[] notasMusicales = new notaMusical[TAM_MAX];
	    protected static int contadorNotas = 0;
	    
	    public enum notaMusical {
	        DO, RE, MI, FA, SOL, LA, SI;
	    }

	    static void add(notaMusical nota) {
	        if (contadorNotas < TAM_MAX) {
	            notasMusicales[contadorNotas++] = nota;
	        } else {
	            System.out.println("No se pueden agregar más notas.");
	        }
	    }

	    public abstract void interpretar();


}
