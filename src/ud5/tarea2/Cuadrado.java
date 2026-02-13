package ud5.tarea2;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado, Colores color) {
        super(lado, color);
    }

    public Cuadrado() {
        super();
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado → " + super.toString() + ", Área: " + getArea();
    }
}
