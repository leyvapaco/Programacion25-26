package ra4y7.garaje.solucion;

public class Motocicleta extends Terrestre {

    public Motocicleta(String nombre, int capacidadPersonas, String matricula,
                       int anioFabricacion, Color color) {
        super(nombre, capacidadPersonas, matricula, anioFabricacion, color);
    }

    @Override
    public String mostrarTipo() {
        return "Motocicleta";
    }
}
