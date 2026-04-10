package ud6.compraonline.plantilla;

import java.util.*;

public class Tienda {

    private List<Producto> catalogo;

    public Tienda(List<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    // Devuelve todas las categorías del catálogo.
    public Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();

    	//COMPLETAR AQUI

        return categorias;
    }

    // Agrupa los productos por categoría.
    public Map<String, List<Producto>> agruparPorCategoria() {
        Map<String, List<Producto>> mapa = new HashMap<>();

    	//COMPLETAR AQUI

        return mapa;
    }

    // Devuelve los productos cuyo nombre contenga el texto (ignorando mayúsculas/minúsculas).
    public List<Producto> buscarPorNombre(String texto) {
        List<Producto> resultado = new ArrayList<>();
        String t = texto.toLowerCase();

    	//COMPLETAR AQUI

        return resultado;
    }
}
