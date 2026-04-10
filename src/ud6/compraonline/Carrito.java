package ud6.compraonline;

import java.util.*;


public class Carrito {

    private Map<String, Integer> cantidades = new HashMap<>();
    private Map<String, Producto> productos = new HashMap<>();

    // Añade un producto al carrito; si ya existe, incrementa su cantidad.
    public void agregarProducto(Producto p) {
        productos.put(p.getId(), p);

        if (cantidades.containsKey(p.getId())) {
            cantidades.put(p.getId(), cantidades.get(p.getId()) + 1);
        } else {
            cantidades.put(p.getId(), 1);
        }
    }

    // Elimina completamente un producto del carrito.
    public void eliminarProducto(String idProducto) {
        productos.remove(idProducto);
        cantidades.remove(idProducto);
    }

    // Devuelve el total de unidades en el carrito.
    public int cantidadTotalProductos() {
        int total = 0;
        for (Integer c : cantidades.values()) {
            total += c;
        }
        return total;
    }

    // Devuelve el precio total del carrito.
    public double precioTotal() {
        double total = 0;

        for (String id : productos.keySet()) {
            Producto p = productos.get(id);
            int cant = cantidades.get(id);
            total += p.getPrecio() * cant;
        }

        return total;
    }

    // Devuelve los productos ordenados de menor a mayor precio.
    public List<Producto> obtenerProductosOrdenadosPorPrecio() {
        List<Producto> lista = new ArrayList<>(productos.values());

        Collections.sort(lista, new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                if (a.getPrecio() < b.getPrecio()) return -1;
                if (a.getPrecio() > b.getPrecio()) return 1;
                return 0;
            }
        });

        return lista;
    }
}
