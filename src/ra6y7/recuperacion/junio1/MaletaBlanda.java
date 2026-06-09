package ra6y7.recuperacion.junio1;

public class MaletaBlanda extends MaletaFacturada {

    private int bolsillosExternos;
    private boolean expandible;

    public MaletaBlanda(String codigo, double alto, double ancho, double profundidad,
                        int bolsillosExternos, boolean expandible) {
        super(codigo, alto, ancho, profundidad);
        this.bolsillosExternos = bolsillosExternos;
        this.expandible = expandible;
    }

    @Override
    public double calcularVolumen() {
        return alto * ancho * profundidad;
    }
    @Override
    public String etiquetaEnvio() {
        return "Envío flexible (maleta blanda) " + codigo;
    }
}
