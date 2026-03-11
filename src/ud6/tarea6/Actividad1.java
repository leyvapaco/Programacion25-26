package ud6.tarea6;

import java.util.*;

import java.util.*;

import java.util.*;

public class Actividad1 {

    // Clase para representar cada línea de compra
    static class LineaCompra {
        String producto;
        int cantidad;
        double precioUnitario;

        LineaCompra(String producto, int cantidad, double precioUnitario) {
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }

        double getSubtotal() {
            return cantidad * precioUnitario;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Diccionario de productos y precios
        Map<String, Double> productos = new HashMap<>();
        productos.put("tomate", 1.59);
        productos.put("quinoa", 4.50);
        productos.put("avena", 2.21);
        productos.put("guisantes", 1.80);
        productos.put("garbanzos", 2.10);

        // Lista para almacenar la compra
        List<LineaCompra> compra = new ArrayList<>();

        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().toLowerCase();

            if (producto.equals("fin")) {
                seguirComprando = false;
            } else if (!productos.containsKey(producto)) {
                System.out.println("El producto no existe. Intenta de nuevo.");
            } else {
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double precio = productos.get(producto);
                compra.add(new LineaCompra(producto, cantidad, precio));
            }
        }

        // Mostrar factura
        System.out.println("\n----------------------------------------------");
        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("----------------------------------------------");

        double total = 0;

        for (LineaCompra linea : compra) {
            double subtotal = linea.getSubtotal();
            total += subtotal;

            System.out.printf("%-12s %-10.2f %-10d %-10.2f\n",
                    linea.producto, linea.precioUnitario, linea.cantidad, subtotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Total: %.2f\n", total);
    }
}

