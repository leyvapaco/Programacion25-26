package ra4y7.garaje.solucion;

public abstract class Vehiculo {

    protected String nombre;
    protected int capacidadPersonas;
    protected int personasTransportadas;

    public Vehiculo(String nombre, int capacidadPersonas) {
        this.nombre = nombre;
        this.capacidadPersonas = capacidadPersonas;
        this.personasTransportadas = 0;
    }

    public void transportar(int personas) {
        if (personasTransportadas + personas <= capacidadPersonas) {
            personasTransportadas += personas;
        } else {
            System.out.println("No se pueden transportar tantas personas. Capacidad excedida.");
        }
    }

    public abstract String mostrarTipo();

    @Override
    public String toString() {
        return nombre + " (capacidad: " + capacidadPersonas +
               ", transportadas: " + personasTransportadas + ")";
    }
}
