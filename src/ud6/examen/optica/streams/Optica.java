package ud6.examen.optica.streams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Optica {

    private String nombre;
    private String cif;

    // Mapa: tipo → conjunto de gafas
    private Map<TipoGafa, Set<Gafa>> stock;
    private static int contadorGafas = 0;

    public Optica(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;

        stock = new HashMap<>();
        stock.put(TipoGafa.GRADUADA, new HashSet<>());
        stock.put(TipoGafa.SOL, new TreeSet<>());
    }

    public static int cuantasGafas() {
        return contadorGafas;
    }

    // -----------------------------
    //      MÉTODOS CON STREAMS
    // -----------------------------

    public void addGafa(TipoGafa tipo, Gafa gafa) {
        stock.getOrDefault(tipo, Set.of()).add(gafa);
        contadorGafas++;
    }

    public void delGafas(Gafa gafa) {
        if (gafa == null) return;

        stock.getOrDefault(gafa.getTipo(), Set.of())
             .removeIf(g -> g.equals(gafa));

        contadorGafas--;
    }

    // -----------------------------
    //     CÁLCULO DE PRECIOS
    // -----------------------------

    public double damePrecioGafa(Gafa gafa) {
        gafa.aplicaDescuento();
        return Math.max(gafa.getPrecioVenta(), gafa.getCoste());
    }

    // -----------------------------
    //     LISTADO POR PROVEEDOR
    // -----------------------------

    public void gafasByProveedor() {
        Set<Gafa> sol = stock.get(TipoGafa.SOL);

        if (sol == null || sol.isEmpty()) {
            System.out.println("No hay gafas de sol en stock.");
            return;
        }

        sol.stream()
           .map(g -> (GafaSol) g)
           .forEach(gs -> System.out.println(
               "Gafa ID " + gs.getId() +
               " - Proveedor: " + gs.getProveedor().getNombre()
           ));
    }

    // -----------------------------
    //     COSTE POR TIPO
    // -----------------------------

    public void costeGafasByTipo(TipoGafa tipo) {
        double total = stock.getOrDefault(tipo, Set.of())
                            .stream()
                            .mapToDouble(Gafa::getCoste)
                            .sum();

        System.out.println("Coste total de gafas " + tipo + ": " + total);
    }

    // -----------------------------
    //     MÉTODOS EXTRA ÚTILES
    // -----------------------------

    /** Devuelve todas las gafas de la óptica */
    public Set<Gafa> getTodasLasGafas() {
        return stock.values()
                    .stream()
                    .flatMap(Set::stream)
                    .collect(Collectors.toSet());
    }

    /** Busca gafas de sol por proveedor */
    public Set<GafaSol> buscarPorProveedor(String nombreProveedor) {
        return stock.getOrDefault(TipoGafa.SOL, Set.of())
                    .stream()
                    .map(g -> (GafaSol) g)
                    .filter(gs -> gs.getProveedor().getNombre().equalsIgnoreCase(nombreProveedor))
                    .collect(Collectors.toSet());
    }

    /** Precio total de venta tras aplicar descuentos */
    public double precioTotalVenta() {
        return stock.values()
                    .stream()
                    .flatMap(Set::stream)
                    .mapToDouble(g -> {
                        g.aplicaDescuento();
                        return Math.max(g.getPrecioVenta(), g.getCoste());
                    })
                    .sum();
    }

    // -----------------------------
    //     GETTERS
    // -----------------------------

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }
}
