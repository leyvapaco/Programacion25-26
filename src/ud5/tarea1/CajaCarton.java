package ud5.tarea1;

public class CajaCarton extends Caja {

	private EtiquetaNumero etiqueta;                // etiqueta numérica
    private static double superficieTotal = 0;  // acumulada entre todas las cajas

    public CajaCarton(double ancho, double alto, double fondo) {
        // Siempre en centímetros → usamos Unidades.cm
        super(ancho, alto, fondo, Unidades.cm);

        // Cada vez que se crea una caja, sumamos su superficie
        superficieTotal += calcularSuperficie();
    }


    public EtiquetaNumero getEtiqueta() {
		return etiqueta;
	}



	public void setEtiqueta(EtiquetaNumero etiqueta) {
		this.etiqueta = etiqueta;
	}



	@Override
    public double getVolumen() {
        // Volumen real * 0.8
        return super.getVolumen() * 0.8;
    }

    // Superficie total de cartón (en cm²)
    // Fórmula de un prisma rectangular:
    // 2*(ancho*alto + ancho*fondo + alto*fondo)
    private double calcularSuperficie() {
        double a = getAncho();
        double h = getAlto();
        double f = getFondo();
        return 2 * (a*h + a*f + h*f);
    }

    public static double getSuperficieTotal() {
        return superficieTotal;
    }

    @Override
    public String toString() {
        return "CajaCarton (" + getAncho() + "cm x " + getAlto() + "cm x " + getFondo() + "cm)"
                + (etiqueta != null ? " Etiqueta: " + etiqueta : "")
                + " Volumen útil: " + getVolumen() + " m³";
    }
}

