package ud6.examen.optica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Optica {
	private String nombre;
	private String cif;
	
	//Mapa con clave el tipo de gafa (graduada o sol) y su valor un set de gafas.
	//Set porque no hay 2 gafas iguales porque se diferencian por un atributo: id
	
	private Map<TipoGafa,Set<Gafa>> stock; 
	private static int contadorGafas=0;
		
    public Optica(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;

        stock = new HashMap<>();

        // Gafas graduadas → sin orden
        stock.put(TipoGafa.GRADUADA, new HashSet<>());

        // Gafas de sol → ordenadas por proveedor (GafaSol implements Comparable)
        stock.put(TipoGafa.SOL, new TreeSet<>());
    }
		
	public static int cuantasGafas() {
		return contadorGafas;
	}
	
	public void addGafa(TipoGafa tipo, Gafa gafa) {
	    Set<Gafa> conjunto = stock.get(tipo);
	    if (conjunto != null) {
	            conjunto.add(gafa);
	    }
        contadorGafas++;	       
	}
	// Alternativa  sin usar la variable intermedia conjunto
	public void addGafaAlternativo(TipoGafa tipo, Gafa gafa) {
	    if (stock.get(tipo) != null) {
	        stock.get(tipo).add(gafa);
	    }
	    contadorGafas++;
	}
    
	public void delGafas(Gafa gafa) {
        if (gafa == null) return;

        TipoGafa tipo = gafa.getTipo();
        Set<Gafa> conjunto = stock.get(tipo);

        if (conjunto != null) {
            conjunto.remove(gafa); 
        }
		contadorGafas --;
	}
	
	// Alternativa   sin usar la variable intermedia conjunto
	public void deGafasAlternativo(Gafa gafa) {
	    if (gafa == null) return;

	    TipoGafa tipo = gafa.getTipo();

	    if (stock.get(tipo) != null) {
	        stock.get(tipo).remove(gafa);
	    }

	    contadorGafas--;
	}

	 
	
	public double damePrecioGafa(Gafa gafa)  {
		gafa.aplicaDescuento();

        // Si queda por debajo del coste, simplemente devolvemos el coste
        if (gafa.getPrecioVenta() < gafa.getCoste()) {
            return gafa.getCoste();
        }

        return gafa.getPrecioVenta();
	}

	   public void gafasByProveedor() {
	        Set<Gafa> sol = stock.get(TipoGafa.SOL);

	        if (sol == null || sol.isEmpty()) {
	            System.out.println("No hay gafas de sol en stock.");
	            return;
	        }

	        for (Gafa g : sol) {
	            GafaSol gs = (GafaSol) g;
	            System.out.println("Gafa ID " + gs.getId() +
	                               " - Proveedor: " + gs.getProveedor().getNombre());
	        }
	        
	        /* Alternativa: 
	        for (Gafa g : sol) {
	            if (g instanceof GafaSol gs) {
	                System.out.println("Gafa ID " + gs.getId() +
	                                   " - Proveedor: " + gs.getProveedor().getNombre());
	            }
	        }*/
	        
	        // Alternativa: Mover el método getProveedor() a la clase padre Gafa
	    }
		
    public void costeGafasByTipo(TipoGafa tipo) {

        Set<Gafa> conjunto = stock.get(tipo);
        double total = 0;

        if (conjunto != null) {
            for (Gafa g : conjunto) {
                total += g.getCoste();
            }
        }

        System.out.println("Coste total de gafas " + tipo + ": " + total);
    }


	public String getNombre() {
		return nombre;
	}
	
	
}
	
	
	
	
	

