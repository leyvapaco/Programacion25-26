package ud5.tarea2;

import java.util.Comparator;

import java.util.Comparator;

public class CompararTrianguloPorColor implements Comparator<Triangulo> {
    @Override
    public int compare(Triangulo t1, Triangulo t2) {
        return t1.color.name().compareTo(t2.color.name());
        
        /* Usamos name() porque convierte el literal del enum a String.
        Así garantizamos un orden alfabético real, incluso si los
        colores no están declarados en orden alfabético dentro del enum. */
    }
}

