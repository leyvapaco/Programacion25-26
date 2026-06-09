package ra6y7.recuperacion.junio1;

public class MaletaCabina extends Equipaje {

    private double pesoMaximo;
    private boolean ruedas360;

    public MaletaCabina(String codigo, double alto, double ancho, double profundidad,
                        double pesoMaximo, boolean ruedas360) {
        super(codigo, alto, ancho, profundidad);
        this.pesoMaximo = pesoMaximo;
        this.ruedas360 = ruedas360;
    }

    @Override
    public double calcularVolumen() {
        return alto * ancho * profundidad;
    }

    @Override
    public String etiquetaEnvio() {
        return "Etiqueta de cabina para " + codigo;
    }
}
