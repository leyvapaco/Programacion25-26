package ud6.compraonline.plantilla;

import java.util.*;


public class Carrito {

    private Map<String, Integer> cantidades = new HashMap<>();
    private Map<String, Producto> productos = new HashMap<>();

    // Añade un producto al carrito; si ya existe, incrementa su cantidad.
    public void agregarProducto(Producto p) {
    	//COMPLETAR AQUI
    }

    // Elimina completamente un producto del carrito.
    public void eliminarProducto(String idProducto) {

    	
    }

    // Devuelve el total de unidades en el carrito.
    public int cantidadTotalProductos() {
        int total = 0;
    	//COMPLETAR AQUI
        
        return total;
    }

    // Devuelve el precio total del carrito.
    public double precioTotal() {
        double total = 0;

    	//COMPLETAR AQUI

        return total;
    }

    // Devuelve los productos ordenados de menor a mayor precio.
    public List<Producto> obtenerProductosOrdenadosPorPrecio() {
        List<Producto> lista = new ArrayList<>(productos.values());

    	//COMPLETAR AQUI

        return lista;
    }
}
