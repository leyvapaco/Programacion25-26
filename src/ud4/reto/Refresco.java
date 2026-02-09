package ud4.reto;

public class Refresco extends Bebida {

    private boolean zero;

    public Refresco(String nombre, double precio, boolean zero) {
        super(nombre, precio, !zero);
        this.zero = zero;
    }

    @Override
    public boolean esSaludable() {
        return zero;
    }

    @Override
    public String toString() {
        return super.toString() + " (zero: " + zero + ")";
    }
}

