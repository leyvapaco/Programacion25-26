package ud6.tarea6;

import java.util.*;

import java.util.*;

import java.util.*;

public class Actividad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Diccionario de productos y precios
        Map<String, Double> precios = new HashMap<>();
        precios.put("tomate", 1.59);
        precios.put("quinoa", 4.50);
        precios.put("avena", 2.21);
        precios.put("guisantes", 1.80);
        precios.put("garbanzos", 2.10);

        // Mapa para acumular cantidades (mantiene orden de inserción)
        Map<String, Integer> compra = new LinkedHashMap<>();

        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().toLowerCase();

            if (producto.equals("fin")) {
                seguirComprando = false;
            } else if (!precios.containsKey(producto)) {
                System.out.println("El producto no existe. Intenta de nuevo.");
            } else {
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                // Acumular cantidades sin continue
                int cantidadActual = compra.getOrDefault(producto, 0);
                compra.put(producto, cantidadActual + cantidad);
            }
        }

        // Código de descuento
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigo = sc.nextLine().trim();

        boolean aplicaDescuento = codigo.equalsIgnoreCase("ECODTO");

        // Mostrar factura
        System.out.println("\n----------------------------------------------");
        System.out.printf("%-12s %-10s %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
        System.out.println("----------------------------------------------");

        double total = 0;

        for (String producto : compra.keySet()) {
            int cantidad = compra.get(producto);
            double precio = precios.get(producto);
            double subtotal = cantidad * precio;

            total += subtotal;

            System.out.printf("%-12s %-10.2f %-10d %-10.2f\n",
                    producto, precio, cantidad, subtotal);
        }

        System.out.println("----------------------------------------------");

        if (aplicaDescuento) {
            double descuento = total * 0.10;
            total -= descuento;
            System.out.printf("Descuento aplicado (10%%): -%.2f\n", descuento);
        }

        System.out.printf("Total: %.2f\n", total);
    }
}



