package ud9.objectdb.tarea.solucion;

import javax.persistence.*;
import java.util.List;

public class ArtistaDAO {

    private EntityManager em;

    public ArtistaDAO(EntityManager em) {
        this.em = em;
    }

    // CREATE
    public void insertar(String nombre, String pais) {
        em.getTransaction().begin();
        em.persist(new Artista(nombre, pais));
        em.getTransaction().commit();
    }

    // READ (uno)
    public Artista buscar(long id) {
        return em.find(Artista.class, id);
    }

    // READ (todos)
    public List<Artista> listar() {
        return em.createQuery("SELECT a FROM Artista a ORDER BY a.nombre", Artista.class)
                 .getResultList();
    }

    // UPDATE
    public void actualizar(long id, String nombre, String pais) {
        em.getTransaction().begin();
        Artista a = em.find(Artista.class, id);
        if (a != null) {
            a.setNombre(nombre);
            a.setPais(pais);
        }
        em.getTransaction().commit();
    }

    // DELETE
    public void borrar(long id) {
        em.getTransaction().begin();
        Artista a = em.find(Artista.class, id);
        if (a != null) em.remove(a);
        em.getTransaction().commit();
    }
}

