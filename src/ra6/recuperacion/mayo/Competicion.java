package ra6.recuperacion.mayo;

import java.util.*;

public class Competicion {

	//Mapa que almacena las 4 selecciones que conforman cada grupo (A, B, C...)
	private Map<String, List<Seleccion>> grupos;
	
    //Mapa que almacena, para cada selección, los puntos que acumula
    private Map<Seleccion, Integer> puntos;
	
    //Lista con los nombres de jugadores que marcan goles (se pueden repetir).
    private List<Jugador> goles;

    public enum Resultado { VICTORIA, EMPATE, DERROTA }

    public Competicion() {
        grupos = new LinkedHashMap<>();
        goles = new ArrayList<>();
        puntos = new HashMap<>();
    }

    //Añade una selección a un grupo. Por ejemplo, al grupo "B", España)
    public void addSeleccionAGrupo(String grupo, Seleccion s) {

        if (!grupos.containsKey(grupo)) {
            grupos.put(grupo, new ArrayList<>());
        }

        grupos.get(grupo).add(s);

        if (!puntos.containsKey(s)) {
            puntos.put(s, 0);
        }
    }

    // MÉTODOS DE GESTIÓN

    //Cuando un jugador marca un gol, se añade a la lista goles.
    public void addGol(Jugador j) {
        goles.add(j);
    }

    // Si el resultado del partido es VICTORIA, la seleccion s debe acumular 3 puntos. Si es EMPATE, 1 punto, y en caso de derrota, 0 puntos.
    // El mapa puntos contendrá de esta forma, el total de puntos acumulados por cada selección.
    public void addResultado(Seleccion s, Resultado r) {
        int actual = puntos.containsKey(s) ? puntos.get(s) : 0;

        if (r == Resultado.VICTORIA) {
            actual += 3;
        } else if (r == Resultado.EMPATE) {
            actual += 1;
        }
        // DERROTA → no suma nada

        puntos.put(s, actual);
    }


    // MOSTRAR GRUPO CON PUNTOS
    // Muestra por consola las selecciones del grupo que se indica por parámetro, así como los puntos que tiene.
    public void mostrarGrupo(String grupo) {
        List<Seleccion> listaSelecciones = grupos.get(grupo);
        if (listaSelecciones == null) return;

        Iterator<Seleccion> it = listaSelecciones.iterator();
        while (it.hasNext()) {
            Seleccion s = it.next();
            int pts = puntos.containsKey(s) ? puntos.get(s) : 0;
            System.out.println(s + " - " + pts + " puntos");
        }
    }

    //Devuelve una lista con el nombre del jugador y el total de goles que ha metido
    public List<String> goleadores() {
        Map<Jugador, Integer> golesPorJugador = new HashMap<>();

        // Contar goles
        for (Jugador j : goles) {
            int g = golesPorJugador.containsKey(j) ? golesPorJugador.get(j) : 0;
            golesPorJugador.put(j, g + 1);
        }

        // Crear lista de resultados
        List<String> lista = new ArrayList<>();

        for (Jugador j : golesPorJugador.keySet()) {
            int g = golesPorJugador.get(j);
            lista.add(j.getNombre() + " - " + g + " goles");
        }

        return lista;
    }
    
    //Método genérido para mostrar por consola los elementos de una colección
    public <T> void mostrarColeccion(Collection<T> col) {
        for (T elem : col) {
            System.out.println(elem);
        }
    }


}


