package ud5.tarea2;

public class Triangulo extends PoligonoRegular implements Comparable<Triangulo> {

    private double altura;

    public Triangulo() {
        super();
        this.altura = 10;
    }

    public Triangulo(double lado, double altura, String color) {
        super(lado, color);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (lado * altura) / 2;
    }

    //Implementamos la interfaz Comparable 
    //para definir la ordenación por defecto
    @Override
    public int compareTo(Triangulo t) {
        return Double.compare(this.lado, t.lado);
    }

    @Override
    public String toString() {
        return "Triangulo [lado=" + lado + ", altura=" + altura + ", color=" + color + ", area=" + getArea() + "]";
    }

    public String getColor() {
        return color;
    }
}
