package ra6y7.recuperacion.junio1;

public class Accesorio {

    private String nombre;
    private double precio;
    private TipoAccesorio tipo;

    public Accesorio(String nombre, double precio, TipoAccesorio tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - " + precio + "€";
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    //Ojo, si implementasemos aquí el interfaz Comparable, debería
    //comparar exactamente por el mismo atributo que el equals
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Accesorio)) return false;
        Accesorio a = (Accesorio) o;
        return this.nombre.equals(a.nombre);
    }
}
