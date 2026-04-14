package ra4y7.garaje.solucion;

public class Garaje {

    private Vehiculo vehiculoActual;

    public void entrar(Vehiculo v) {
        if (vehiculoActual == null) {
            vehiculoActual = v;
            System.out.println("Ha entrado: " + v.mostrarTipo());
        } else {
            System.out.println("Garaje ocupado. No puede entrar " + v.mostrarTipo());
        }
    }

    public Vehiculo salir() {
        Vehiculo temp = vehiculoActual;
        vehiculoActual = null;
        System.out.println("El vehículo ha salido del garaje.");
        return temp;
    }

    public void mostrarEstado() {
        if (vehiculoActual == null) {
            System.out.println("Garaje vacío.");
        } else {
            System.out.println("Garaje ocupado por: " + vehiculoActual.mostrarTipo());
        }
    }
}
