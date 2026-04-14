package ra4y7.garaje.solucion;


import java.util.Comparator;

public class ComparadorTerrestrePorAnio implements Comparator<Terrestre> {

    @Override
    public int compare(Terrestre t1, Terrestre t2) {
        return Integer.compare(t1.anioFabricacion, t2.anioFabricacion);
    }
}
