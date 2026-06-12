package ra6.recuperacion.junio2.dorsales;

public class Jugador implements Comparable<Jugador> {

    private String nombre;
    private String seleccion;

    public Jugador(String nombre, String seleccion) {
        this.nombre = nombre;
        this.seleccion = seleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSeleccion() {
        return seleccion;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Jugador)) return false;
        Jugador j = (Jugador) obj;
        return nombre.equals(j.nombre)
                && seleccion.equals(j.seleccion);
    }

    @Override
    public int hashCode() {
        return (nombre + seleccion).hashCode();
    }

    @Override
    public String toString() {
        return nombre + " (" + seleccion + ")";
    }
}
