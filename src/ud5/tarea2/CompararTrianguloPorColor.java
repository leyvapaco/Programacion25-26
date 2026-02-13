package ud5.tarea2;

import java.util.Comparator;

public class CompararTrianguloPorColor implements Comparator<Triangulo> {

    @Override
    public int compare(Triangulo t1, Triangulo t2) {
        return t1.getColor().compareToIgnoreCase(t2.getColor());
    }
}

