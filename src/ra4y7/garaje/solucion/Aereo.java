package ra4y7.garaje.solucion;

public abstract class Aereo extends Vehiculo {

    protected int altitud;
    protected String codigoOACI;

    private static int totalAereos = 0;

    public Aereo(String nombre, int capacidadPersonas, int altitud, String codigoOACI) {
        super(nombre, capacidadPersonas);
        this.altitud = altitud;
        this.codigoOACI = codigoOACI;
        totalAereos++;
    }

    public static int getTotalAereos() {
        return totalAereos;
    }

    public abstract String volar();

    @Override
    public String toString() {
        return mostrarTipo() + " - Código OACI: " + codigoOACI +
               ", Altitud: " + altitud + "m";
    }
}
