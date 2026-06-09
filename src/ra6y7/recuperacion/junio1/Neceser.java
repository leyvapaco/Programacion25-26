package ra6y7.recuperacion.junio1;

public class Neceser extends Equipaje {

    private boolean impermeable;

    public Neceser(String codigo, double alto, double ancho, double profundidad,
                   boolean impermeable) {
        super(codigo, alto, ancho, profundidad);
        this.impermeable = impermeable;
    }

    @Override
    public double calcularVolumen() {
        return alto * ancho * profundidad;
    }

    @Override
    public String etiquetaEnvio() {
        return "Etiqueta de neceser para " + codigo;
    }
}
