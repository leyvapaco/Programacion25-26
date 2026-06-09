package ra6y7.recuperacion.junio1;

public class MaletaRigida extends MaletaFacturada {

    private Material material;

    public MaletaRigida(String codigo, double alto, double ancho, double profundidad,
                        Material material) {
        super(codigo, alto, ancho, profundidad);
        this.material = material;
    }

    @Override
    public double calcularVolumen() {
        return alto * ancho * profundidad;
    }

  

    @Override
    public String etiquetaEnvio() {
        return "Envío especial (maleta rígida) " + codigo;
    }
}
