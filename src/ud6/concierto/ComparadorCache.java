package ud6.concierto;


import java.util.Comparator;

public class ComparadorCache implements Comparator<Artista> {

    @Override
    public int compare(Artista a1, Artista a2) {
        // Orden descendente por caché
        int resultado = Double.compare(a2.getCache(), a1.getCache());

        // Si tienen el mismo caché, ordena por nombre para evitar empates en TreeSet
        if (resultado == 0) {
            return a1.getNombre().compareTo(a2.getNombre());
        }

        return resultado;
    }
}
