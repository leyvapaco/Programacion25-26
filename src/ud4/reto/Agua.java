package ud4.reto;

public class Agua extends Bebida {

    private boolean conGas;

    public Agua(double precio, boolean conGas) {
        super("Agua", precio, true);
        this.conGas = conGas;
    }

    @Override
    public boolean esSaludable() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " (con gas: " + conGas + ")";
    }
}
