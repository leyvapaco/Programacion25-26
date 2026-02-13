package ud5.tarea2;

public class Circulo implements Figura {

    private double radio;

    public Circulo() {
        this.radio = 10;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", area=" + getArea() + "]";
    }
}
