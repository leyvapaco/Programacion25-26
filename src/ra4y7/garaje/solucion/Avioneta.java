package ra4y7.garaje.solucion;

public class Avioneta extends Aereo {

    public Avioneta(String nombre, int capacidadPersonas, int altitud, String codigoOACI) {
        super(nombre, capacidadPersonas, altitud, codigoOACI);
    }

    @Override
    public String volar() {
        return "Avioneta volando a " + altitud + " metros.";
    }

    @Override
    public String mostrarTipo() {
        return "Avioneta";
    }
}
