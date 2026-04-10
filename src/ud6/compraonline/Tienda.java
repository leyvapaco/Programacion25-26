package ud6.compraonline;

import java.util.*;

public class Tienda {

    private List<Producto> catalogo;

    public Tienda(List<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    // Devuelve todas las categorías del catálogo.
    public Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();

        for (Producto p : catalogo) {
            categorias.add(p.getCategoria());
        }

        return categorias;
    }

    // Agrupa los productos por categoría.
    public Map<String, List<Producto>> agruparPorCategoria() {
        Map<String, List<Producto>> mapa = new HashMap<>();

        for (Producto p : catalogo) {
            String cat = p.getCategoria();

            if (!mapa.containsKey(cat)) {
                mapa.put(cat, new ArrayList<>());
            }

            mapa.get(cat).add(p);
        }

        return mapa;
    }

    // Devuelve los productos cuyo nombre contenga el texto (ignorando mayúsculas/minúsculas).
    public List<Producto> buscarPorNombre(String texto) {
        List<Producto> resultado = new ArrayList<>();
        String t = texto.toLowerCase();

        for (Producto p : catalogo) {
            if (p.getNombre().toLowerCase().contains(t)) {
                resultado.add(p);
            }
        }

        return resultado;
    }
}
