package ud5.tarea1;

public class Caja {

    private final double ancho;   // en cm
    private final double alto;    // en cm
    private final double fondo;   // en cm
    private Etiqueta etiqueta;    // la etiqueta sí puede cambiar

    public Caja(double ancho, double alto, double fondo, Unidades u) {

        // Convertimos a centímetros si vienen en metros
        if (u == Unidades.m) {
            ancho *= 100;
            alto  *= 100;
            fondo *= 100;
        }

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    // Añadir etiqueta
    public void setEtiqueta(Etiqueta e) {
        this.etiqueta = e;
    }

    // Volumen en m³
    public double getVolumen() {
        // Convertimos cm³ a m³ dividiendo entre 1.000.000
        return (ancho * alto * fondo) / 1000000.0;
    }
    
    

    public double getAncho() {
		return ancho;
	}

	public double getAlto() {
		return alto;
	}

	public double getFondo() {
		return fondo;
	}

	@Override
    public String toString() {
        return "Caja (" + ancho + "cm x " + alto + "cm x " + fondo + "cm)"
                + (etiqueta != null ? " Etiqueta: " + etiqueta : "");
    }
}

