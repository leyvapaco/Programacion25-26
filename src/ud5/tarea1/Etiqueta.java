package ud5.tarea1;

public class Etiqueta {
    private final String nombre;
    private final String direccion;

    public Etiqueta(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion;
    }
}
