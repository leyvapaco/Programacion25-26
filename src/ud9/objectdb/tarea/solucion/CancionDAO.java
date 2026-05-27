package ud9.objectdb.tarea.solucion;


import javax.persistence.*;
import java.util.List;

// DAO: Data Access Object

public class CancionDAO {

    private EntityManager em;

    public CancionDAO(EntityManager em) {
        this.em = em;
    }

    // CREATE (ahora recibe un Artista)
    public void insertar(String titulo, Artista artista, int reproducciones) {
        em.getTransaction().begin();
        em.persist(new Cancion(titulo, artista, reproducciones));
        em.getTransaction().commit();
    }

    // READ (uno)
    public Cancion buscar(long id) {
        return em.find(Cancion.class, id);
    }

    // READ (todos)
    public List<Cancion> listar() {
        return em.createQuery("SELECT c FROM Cancion c ORDER BY c.id", Cancion.class)
                 .getResultList();
    }

    // READ (todas las canciones de un artista)
    public List<Cancion> listarPorArtista(long idArtista) {
        return em.createQuery(
                "SELECT c FROM Cancion c WHERE c.artista.id = :id ORDER BY c.titulo",
                Cancion.class)
                .setParameter("id", idArtista)
                .getResultList();
    }

    // UPDATE (ahora recibe un Artista)
    public void actualizar(long id, String titulo, Artista artista, int reproducciones) {
        em.getTransaction().begin();
        Cancion c = em.find(Cancion.class, id);
        if (c != null) {
            c.setTitulo(titulo);
            c.setArtista(artista);
            c.setReproducciones(reproducciones);
        }
        em.getTransaction().commit();
    }

    // DELETE
    public void borrar(long id) {
        em.getTransaction().begin();
        Cancion c = em.find(Cancion.class, id);
        if (c != null) em.remove(c);
        em.getTransaction().commit();
    }
}

