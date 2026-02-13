package ud5.tarea2;

public class Triangulo extends PoligonoRegular implements Comparable<Triangulo> {

    private double altura;

    public Triangulo(double lado, double altura, Colores color) {
        super(lado, color);
        this.altura = altura;
    }

    public Triangulo() {
        this(10, 10, Colores.AZUL);
    }

    @Override
    public double getArea() {
        return (lado * altura) / 2;
    }

    @Override
    public int compareTo(Triangulo otro) {
        return Double.compare(this.lado, otro.lado);
    }

    @Override
    public String toString() {
        return "Triángulo → Lado: " + lado + ", Altura: " + altura +
               ", Color: " + color + ", Área: " + getArea();
    }
}
