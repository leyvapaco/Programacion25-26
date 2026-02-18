package ud5.carnaval;

import java.util.Comparator;

public class ComparatorAutor  implements Comparator<AgrupacionOficial> {

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		return o1.autor.compareTo(o2.autor);
	}

}
