package ud5.ejemplos.comparable;

import java.util.Comparator;


public class ClienteEdadComparator implements Comparator<Cliente>{
	
	    	 @Override
	 	    public int compare(Cliente c1, Cliente c2) {
	 	        if (c1.getEdad() < c2.getEdad()) {
	 	            return -1;
	 	        } else if (c1.getEdad() > c2.getEdad()) { 
	 	            return 1;
	 	        } else {
	 	            return 0;
	 	        }
	 	    }

}
