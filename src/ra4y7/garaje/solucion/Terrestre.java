package ra4y7.garaje.solucion;

public abstract class Terrestre extends Vehiculo implements Comparable<Terrestre> {

    protected String matricula;
    protected int anioFabricacion;
    protected Color color;

    public Terrestre(String nombre, int capacidadPersonas, String matricula,
                     int anioFabricacion, Color color) {
        super(nombre, capacidadPersonas);
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
    }

    @Override
    public int compareTo(Terrestre otro) {
        return this.matricula.compareTo(otro.matricula);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Terrestre)) return false;
        Terrestre t = (Terrestre) obj;
        return this.matricula.equals(t.matricula);
    }


    public static int compararPorAnio(Terrestre t1, Terrestre t2) {
        return new ComparadorTerrestrePorAnio().compare(t1, t2);
    }


    @Override
    public String toString() {
        return mostrarTipo() + " [" + matricula + "] Año: " + anioFabricacion +
               ", Color: " + color + ", Nombre: " + nombre;
    }
}
