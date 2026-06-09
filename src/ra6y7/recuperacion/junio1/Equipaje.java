package ra6y7.recuperacion.junio1;

public abstract class Equipaje implements Comparable<Equipaje> {

    protected String codigo;
    protected double alto, ancho, profundidad;
    private static int total = 0;

    public Equipaje(String codigo, double alto, double ancho, double profundidad) {
        this.codigo = codigo;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        total++;
    }

    public static int getTotalEquipajes() {
        return total;
    }

    public abstract double calcularVolumen();

    public String etiquetaEnvio() {
        return "Envío estándar para equipaje " + codigo;
    }

    @Override
    public int compareTo(Equipaje o) {
        return Double.compare(this.alto, o.alto);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + codigo + ") - " + alto + "cm";
    }

    public String getCodigo() {
        return codigo;
    }
}
