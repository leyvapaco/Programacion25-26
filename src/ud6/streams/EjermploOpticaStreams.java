package ud6.streams;

import java.util.*;
import java.util.stream.Collectors;

class Cliente {
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

class Gafa {
    private String marca;
    private double precio;
    private String tipo;
    private Cliente cliente; // null si no está vendida

    public Gafa(String marca, double precio, String tipo, Cliente cliente) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }
    public String getTipo() { return tipo; }
    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        return marca + " - " + tipo + " - " + precio + "€" +
                (cliente != null ? " (vendida a " + cliente.getNombre() + ")" : "");
    }
}

class Optica {
    private List<Gafa> inventario;

    public Optica(List<Gafa> inventario) {
        this.inventario = inventario;
    }

    // 1. Gafas vendidas
    public List<Gafa> getGafasVendidas() {
        return inventario.stream()
                .filter(g -> g.getCliente() != null)
                .collect(Collectors.toList());
    }

    // 2. Gafas por tipo
    public List<Gafa> getGafasPorTipo(String tipo) {
        return inventario.stream()
                .filter(g -> g.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    // 3. Precio medio de gafas vendidas
    public double getPrecioMedioVendidas() {
        return inventario.stream()
                .filter(g -> g.getCliente() != null)
                .mapToDouble(Gafa::getPrecio)
                .average()
                .orElse(0);
    }

    // 4. Agrupar gafas por cliente
    public Map<Cliente, List<Gafa>> getGafasPorCliente() {
        return inventario.stream()
                .filter(g -> g.getCliente() != null)
                .collect(Collectors.groupingBy(Gafa::getCliente));
    }

    // 5. Gafa más cara
    public Optional<Gafa> getGafaMasCara() {
        return inventario.stream()
                .max(Comparator.comparingDouble(Gafa::getPrecio));
    }

    // 6. Cantidad de gafas por marca
    public Map<String, Long> getGafasPorMarca() {
        return inventario.stream()
                .collect(Collectors.groupingBy(Gafa::getMarca, Collectors.counting()));
    }

    // 7. Top 3 clientes que más han gastado
    public List<Map.Entry<Cliente, Double>> getTop3Clientes() {
        return inventario.stream()
                .filter(g -> g.getCliente() != null)
                .collect(Collectors.groupingBy(
                        Gafa::getCliente,
                        Collectors.summingDouble(Gafa::getPrecio)
                ))
                .entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .collect(Collectors.toList());
    }
}

public class EjermploOpticaStreams {
    public static void main(String[] args) {

        Cliente ana = new Cliente("Ana", 30);
        Cliente luis = new Cliente("Luis", 45);
        Cliente marta = new Cliente("Marta", 28);

        List<Gafa> inventario = List.of(
                new Gafa("RayBan", 120, "sol", ana),
                new Gafa("Oakley", 150, "sol", luis),
                new Gafa("Gucci", 300, "vista", marta),
                new Gafa("Polaroid", 80, "vista", null),
                new Gafa("RayBan", 200, "progresiva", ana),
                new Gafa("Vogue", 90, "sol", null)
        );

        Optica optica = new Optica(inventario);

        System.out.println("Gafas vendidas:");
        optica.getGafasVendidas().forEach(System.out::println);

        System.out.println("\nGafas de sol:");
        optica.getGafasPorTipo("sol").forEach(System.out::println);

        System.out.println("\nPrecio medio de gafas vendidas: " + optica.getPrecioMedioVendidas());

        System.out.println("\nGafas por cliente:");
        System.out.println(optica.getGafasPorCliente());

        System.out.println("\nGafa más cara:");
        System.out.println(optica.getGafaMasCara().orElse(null));

        System.out.println("\nGafas por marca:");
        System.out.println(optica.getGafasPorMarca());

        System.out.println("\nTop 3 clientes que más han gastado:");
        System.out.println(optica.getTop3Clientes());
    }
}
