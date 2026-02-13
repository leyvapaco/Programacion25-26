package ud5.tarea2;
public abstract class PoligonoRegular implements Figura {

    protected double lado;              // visible para hijas y vecinas
    public Colores color;                 // visible desde cualquier clase
    public static int contadorPoligonos = 0;

    public PoligonoRegular(double lado, Colores color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }

    public PoligonoRegular() {
        this(10, Colores.AZUL);
    }

       
    @Override
    public String toString() {
        return "Lado: " + lado + ", Color: " + color;
    }
}
