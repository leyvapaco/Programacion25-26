package ud6.compraonline;

import java.util.*;

//Implementa la lógica de una tienda online que gestiona un carrito de compra.

public class Principal {
    public static void main(String[] args) {

        List<Producto> productos = List.of(
            new Producto("P1", "Teclado mecánico", "Periféricos", 49.99),
            new Producto("P2", "Ratón inalámbrico", "Periféricos", 19.99),
            new Producto("P3", "Monitor 24\"", "Pantallas", 129.99),
            new Producto("P4", "Auriculares gaming", "Audio", 39.99),
            new Producto("P5", "Altavoces 2.1", "Audio", 59.99)
        );

        Tienda tienda = new Tienda(productos);
        Carrito carrito = new Carrito();

        carrito.agregarProducto(productos.get(0));
        carrito.agregarProducto(productos.get(0));
        carrito.agregarProducto(productos.get(3));

        System.out.println("Total productos: " + carrito.cantidadTotalProductos());
        System.out.println("Precio total: " + carrito.precioTotal());
        System.out.println("Ordenados por precio: " + carrito.obtenerProductosOrdenadosPorPrecio());

        System.out.println("Categorías: " + tienda.obtenerCategorias());
        System.out.println("Agrupados por categoría: " + tienda.agruparPorCategoria());
        System.out.println("Buscar 'ga': " + tienda.buscarPorNombre("ga"));
    }
}
