package ra7y6.refuerzo.altavoz;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ud8.examen.solucion.Conexion;


public class Empresa {
	private String cif;	
	private  List<Altavoz> altVendidos;
	private Map<String,TreeSet<Revision>> revisiones; //<Número de serie, Revisión>
	private ProductModel productModel;

	

	public Empresa(String cif) {
		this.cif = cif;
		altVendidos = new ArrayList();
		revisiones= new HashMap<String,TreeSet<Revision>>();
	    try {
	    	Connection con = Conexion.conectar();
	        this.productModel = new ProductModel(con);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}	

	
	public void addVendidos(Altavoz altavoz) {
		altVendidos.add(altavoz);
		System.out.println("\nVendido altavoz "+altavoz.getNumSerie());

	}
	
	public boolean delVendidos(Altavoz altavoz) {
		if (altVendidos.contains(altavoz)) {
			altVendidos.remove(altavoz);
			System.out.println("\nEliminado altavoz "+altavoz.getNumSerie());
			return true;
		} else {
			System.out.println("\nEl altavoz "+altavoz.getNumSerie()+" no estaba registrado");	
			return false;
		}
	}
	
	//IMPORTANTE Vamos a obviar lo de "en el mismo día" del enunciado original, porque resultaría realmente complejo
	// y no es el propósito de este médodo. Por tanto
	//simplemente vamos a añadir una revisión al altavoz, comprobando si existía previamente o no.
	
	public void addReview (Altavoz altavoz, Revision revision) {
		String clave= altavoz.getNumSerie(); //La clave del mapa es el Numero de Serie
		
		if (!revisiones.containsKey(clave)) { //Si no existe creamos la entrada en el mapa
			revisiones.put(clave, new TreeSet<Revision>()); //El TreeSet permitirá usar el comparador natural por precio
	    }
		revisiones.get(clave).add(revision);
		System.out.println("\nAñadida revision para "+altavoz.getNumSerie());

	}
	
	// Muestra las revisiones realizadas a un  determinado altavoz
	public void mostrarRevisiones(String numSerie) {

	    System.out.println("\nRevisiones realizadas a " + numSerie + " ordenadas por precio:");

	    TreeSet<Revision> setRevisiones = revisiones.get(numSerie);

	    if (setRevisiones == null) {
	        System.out.println("El altavoz " + numSerie + " no existe.");
	    } else {
	        if (setRevisiones.isEmpty()) {
	            System.out.println("No hay revisiones registradas.");
	        } else {
	            for (Revision r : setRevisiones) {
	                System.out.println(r);
	            }
	        }
	    }
	}

		
	//PRACTICAR: Crear un método que muestre las revisiones ordenadas por un atributo que no sea el precio (orden natural)
	// sino por anchura. Instanciamos un Comparator
	
	public void mostrarAltavoces2() {

	    System.out.println("\nAltavoces vendidos ordenados por anchura:");

	    // Ordenar por anchura usando Comparator sin streams
	    Collections.sort(altVendidos, new Comparator<Altavoz>() {
	        @Override
	        public int compare(Altavoz a1, Altavoz a2) {
	            if (a1.getAnchura() < a2.getAnchura())
	                return -1;
	            else if (a1.getAnchura() > a2.getAnchura())
	                return 1;
	            return 0;
	        }
	    });

	    System.out.println(altVendidos);
	}

	
	public void mostrarAltavoces() {
		System.out.println("\nAltavoces vendidos ordenados por altura:");
		altVendidos.sort((o1, o2) -> o1.compareTo(o2));
  	 // Equivalente a la línea anterior:  usar compareTo() de Altavoz Collections.sort(altVendidos); 
		System.out.println(altVendidos);
	}
	
	
	
	public void insertaProductoBBDD(String linea, List<Altavoz> lista) {
	    try {
	        productModel.insertarProductos(linea, lista);
	        System.out.println("Productos insertados correctamente.");
	    } catch (Exception e) {
	        System.out.println("Error insertando productos: " + e.getMessage());
	    }
	}

	public void actualizaPrecioProducto(String linea, double porcentaje) {
	    try {
	        productModel.actualizarPrecios(linea, porcentaje);
	        System.out.println("Precios actualizados.");
	    } catch (Exception e) {
	        System.out.println("Error actualizando precios: " + e.getMessage());
	    }
	}

	public void consultaProductosLinea(String linea) {
	    try {
	        var lista = productModel.consultarLinea(linea);
	        lista.forEach(System.out::println);
	    } catch (Exception e) {
	        System.out.println("Error consultando productos: " + e.getMessage());
	    }
	}

	public void eliminaProducto(String codigo) {
	    try {
	        productModel.eliminarProducto(codigo);
	        System.out.println("Producto eliminado.");
	    } catch (Exception e) {
	        System.out.println("Error eliminando producto: " + e.getMessage());
	    }
	}

/*
	public void aFichero() {
        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("vendidos.dat"));

            Set<Altavoz> setAltVendidos=Set.copyOf(altVendidos);
            
            Iterator  itr = setAltVendidos.iterator();
            
            while (itr.hasNext()) {
                s.writeObject(itr.next());
            }
            s.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        System.out.println("\nFichero de ventas creado");
    }*/
	
}
