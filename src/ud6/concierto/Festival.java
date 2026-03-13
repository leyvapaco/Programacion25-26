package ud6.concierto;

import java.io.*;
import java.util.*;

//Excepción para estilo incorrecto
class EstiloErroneoException extends Exception {
	private static final long serialVersionUID = 1L; //Esta línea es para poder escribir y leer de fichero
	public EstiloErroneoException(String mensaje) {
		super(mensaje);
	}
}


public class Festival {
    private Map<Estilo, Set<Artista>> mapaArtistas;
    private String nombreEvento;
    private int cp;
    private static int numArtistasInscritos=0;

    public Festival( String nombre_evento, int cp) {
        
        this.nombreEvento = nombre_evento;
        this.cp = cp;
        mapaArtistas= new HashMap<Estilo, Set<Artista>>();
       
    }

    public static int cuantosInscritos() {
		return numArtistasInscritos;
	}


    //METODOS

    public void inscribeArtista(Estilo estilo, Artista artista) throws EstiloErroneoException {
        if (artista.getEstilo().equals(estilo)) {

            if (!mapaArtistas.containsKey(estilo)) {
                mapaArtistas.put(estilo, new TreeSet<Artista>());
            }

            mapaArtistas.get(estilo).add(artista);
            numArtistasInscritos++;
        } else {
        	throw new EstiloErroneoException("No insertado. El artista "+artista.getNombre()+" no pertenece al estilo "+estilo);
        }
       }

	public void artistasInscritos() {
        //Convierto los valores del mapa en un ArrayList al que poder
		//hacer después un Collections.sort(List<T) que use el comparador por defecto de la clase Artista.
		
        List<Artista> listaArtistas = new ArrayList<>();

       // Añadimos todos los artistas del mapa
        for (Estilo e : mapaArtistas.keySet()) {
            listaArtistas.addAll(mapaArtistas.get(e));
        }

        // Ordenamos
        Collections.sort(listaArtistas);

        // Mostramos el resultado
        for (Artista a : listaArtistas) {
            System.out.println(a);
        }
    }

	//Alternativa: Si no fuese obligatorio Collections.sort podría crear un TreeSet 
	// para que use el comparador por defecto de la clase Artista.
	public void artistasInscritos2() {
	    System.out.println("Todos los artistas ordenados por nombre:");

	    // TreeSet usa compareTo() de Artista para ordenar automáticamente
	    Set<Artista> ordenados = new TreeSet<>();

	    // Añadimos todos los artistas del mapa
	    for (Estilo e : mapaArtistas.keySet()) {
	        ordenados.addAll(mapaArtistas.get(e));
	    }

	    // Mostramos el resultado
	    for (Artista a : ordenados) {
	        System.out.println(a);
	    }
	}
	
    public void artistasByCache(Estilo estilo) {
        System.out.println("Artistas estilo " + estilo + " ordenados por caché:");

        // Usamos un TreeSet usando el comparador ComparadorCache
        Set<Artista> ordenados = new TreeSet<>(new ComparadorCache());

        // Añadimos los artistas del estilo indicado
        ordenados.addAll(mapaArtistas.get(estilo));

        // Mostramos el resultado usando Iterator
        // Al usar Iterator podrías añadir lógica adicional dentro del bucle 
        // (por ejemplo, eliminar elementos con it.remove()
        
        Iterator<Artista> it = ordenados.iterator();

        while (it.hasNext()) {
            Artista a = it.next();
            System.out.println(a);
        }
   }

    
	@Override
    public String toString() {
        return "Concierto{" +
                "mapa_artista=" + mapaArtistas +
                ", nombre_evento='" + nombreEvento + '\'' +
                ", recinto='" + cp + '\'' +
                '}';
    }
/* Comento los métodos de fichero, que aún no los hemos visto.
 
    public void cargarArtistas() {
        try (ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("C:\\pruebaficheros\\artistas.dat"))) {
            mapaArtistas = (Map<Estilo, Set<Artista>>) archivo.readObject();        
            System.out.println("\nArtistas cargados de fichero:");
            System.out.println(mapaArtistas);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void guardarArtistas() {
        try (ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\pruebaficheros\\artistas.dat"))) {
            archivo.writeObject(mapaArtistas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nFichero creado!!");
    }*/
}



