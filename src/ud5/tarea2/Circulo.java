package ud5.tarea2;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this(10);
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo → Radio: " + radio + ", Área: " + getArea();
    }
}
