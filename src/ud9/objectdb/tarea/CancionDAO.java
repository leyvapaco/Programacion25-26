package ud9.objectdb.tarea;

import javax.persistence.*;
import java.util.List;

//DAO: Dara Access Object

public class CancionDAO {

    private EntityManager em;

    public CancionDAO(EntityManager em) {
        this.em = em;
    }

    // CREATE
    public void insertar(String titulo, String artista, int reproducciones) {
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

    // UPDATE
    public void actualizar(long id, String titulo, String artista, int reproducciones) {
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
