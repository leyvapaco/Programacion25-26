package ud6.veterinaria.v3;

public class Medicamento {
    private String nombre;
    private int gramos;
    private double precio;

    public Medicamento(String nombre, int gramos, double precio) {
        this.nombre = nombre;
        this.gramos = gramos;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGramos() {
        return gramos;
    }

    @Override
    public String toString() {
        return nombre + " (" + gramos + "g)";
    }
}
