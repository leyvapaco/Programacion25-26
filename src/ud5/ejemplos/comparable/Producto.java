package ud5.ejemplos.comparable;

import java.time.LocalDate;

public class Producto implements Comparable<Producto> {
    String nombre;
    private double precio;
    private LocalDate fechaCaducidad;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
        
    public Producto(String nombre, double precio, LocalDate fechaCaducidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.fechaCaducidad = fechaCaducidad;
	}


	@Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }
    
    /*
    
    //Comparador con String
    @Override 
    public int compareTo(Producto otro) {
    	return this.nombre.compareTo(otro.nombre); 
    	}

    //Comparador con Fecha
    @Override 
    public int compareTo(Producto otro) {
    	return this.fechaCaducidad.compareTo(otro.fechaCaducidad); 
    }
       

	//Comparo por fechas y si son iguales, entonces por nombre
	 @Override
	 public int compareTo(Producto otro) {
	     int cmp = Integer.compare(this.fechaCaducidad, otro.fechaCaducidad);
	     if (cmp == 0) {
	           return this.nombre.compareTo(otro.nombre);
	     }
	     return cmp;
	   }
*/
		
}
