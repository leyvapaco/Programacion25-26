package ra4y7.garaje.solucion;

public class Helicoptero extends Aereo {

    public Helicoptero(String nombre, int capacidadPersonas, int altitud, String codigoOACI) {
        super(nombre, capacidadPersonas, altitud, codigoOACI);
    }

    @Override
    public String volar() {
        return "Helicóptero volando a " + altitud + " metros.";
    }

    @Override
    public String mostrarTipo() {
        return "Helicóptero";
    }
}
