package ud4.reto;

public abstract class Bebida { //Es abstracta, no tiene instancias

    protected String nombre; //acesible por clases hijas
    protected double precio;
    protected boolean saludable;

    //Aunque sea abstracta podemos incluir un constructor
    public Bebida(String nombre, double precio, boolean saludable) {
        this.nombre = nombre;
        this.precio = precio;
        this.saludable = saludable;
    }

    public abstract boolean esSaludable(); //Método abstracto, sin implementación

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + "€ (saludable: " + saludable + ")";
    }
}

