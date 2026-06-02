package ra7y6.refuerzo.altavoz;

import java.util.Date;

public class Revision implements Comparable<Revision> {

    private Date fecha;
    private boolean buenEstado;
    private double precio;

    public Revision(Date ahora, double precio, boolean buenEstado) {
        this.fecha = ahora;
        this.buenEstado = buenEstado;
        this.precio = precio;
    }

    // === GETTERS NECESARIOS ===
    public Date getFecha() {
        return fecha;
    }

    public boolean isBuenEstado() {
        return buenEstado;
    }

    public double getPrecio() {
        return precio;
    }

    // === SETTERS (si los necesitas) ===
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Revision o) {
        // Orden natural: precio descendente (como tú lo tenías)
        if (this.precio > o.precio)
            return -1;
        else if (o.precio > this.precio)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Revision [fecha=" + fecha + ", buenEstado=" + buenEstado + ", precio=" + precio + "]";
    }
}

