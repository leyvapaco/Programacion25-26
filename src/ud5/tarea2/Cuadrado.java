package ud5.tarea2;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado, String color) {
        super(lado, color);
    }

    //Implementamos la interfaz Figura
    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", color=" + color + ", area=" + getArea() + "]";
    }
}

