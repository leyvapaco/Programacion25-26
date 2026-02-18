package ud5.carnaval;

import java.util.Comparator;

public class ComparatorPuntos implements Comparator<AgrupacionOficial> {

	
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		return (o1.getPuntos() > o2.getPuntos()) ? -1 : (o1.getPuntos() < o2.getPuntos()) ? 1 : 0;
	}

}
