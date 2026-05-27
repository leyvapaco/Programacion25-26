package ud9.objectdb;

import javax.persistence.*;
import java.util.List;

public class MainSimple {

    public static void main(String[] args) {

    	//JPA: Java Persistence API
    	//JPA es un estándar de Java para trabajar con bases de datos usando objetos en lugar de SQL
    	
    	//Crea una fábrica de conexiones JPA usando ObjectDB y apunta al fichero musica.odb, el cual crea si no existe.
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:musica.odb");
        
        //EntityManager es el objeto ligero que se usa para iniciar transacciones, persistir objetos, hacer consultas, etc.
        //Piensa en él como la conexión activa a la base de datos
        EntityManager em = emf.createEntityManager();

        insertarCancionesActuales(em);
        actualizarReproducciones(em, 1, 9000000);
        mostrarTopCanciones(em, 5000000);

        em.close();
        emf.close();
    }

    // INSERT con música actual
    private static void insertarCancionesActuales(EntityManager em) {
        em.getTransaction().begin();

        em.persist(new Cancion("Luna", "Feid & ATL Jacob", 8200000));
        em.persist(new Cancion("Perro Negro", "Bad Bunny & Feid", 7600000));
        em.persist(new Cancion("Columbia", "Quevedo", 6800000));
        em.persist(new Cancion("Classy 101", "Feid & Young Miko", 5400000));
        em.persist(new Cancion("Friki", "Karol G & Feid", 4900000));
        em.persist(new Cancion("LALA", "Myke Towers", 7200000));
        em.persist(new Cancion("Baby Hello", "Rauw Alejandro & Bizarrap", 6100000));
        em.persist(new Cancion("Polaris", "Saiko", 5800000));

        em.getTransaction().commit();
        System.out.println("Canciones actuales insertadas.");
    }

    // UPDATE
    private static void actualizarReproducciones(EntityManager em, long id, int nuevas) {
        em.getTransaction().begin();
        
        Cancion c = em.find(Cancion.class, id);
        if (c != null) {
            c.setReproducciones(nuevas); //Actualizamos la bbdd a través del propio objeto
            System.out.println("Actualizada: " + c);
        } else {
            System.out.println("No existe canción con id " + id);
        }
        
        em.getTransaction().commit();
    }

    // SELECT avanzado
    private static void mostrarTopCanciones(EntityManager em, int minReproducciones) {
        System.out.println("\nCanciones con más de " + minReproducciones + " reproducciones:");

        //TypedQuery<Cancion> significa “una consulta JPA que devuelve objetos de tipo Cancion”.
        
        TypedQuery<Cancion> q = em.createQuery(
            "SELECT c FROM Cancion c WHERE c.reproducciones >= :min ORDER BY c.reproducciones DESC",
            Cancion.class
        );
        q.setParameter("min", minReproducciones);

        List<Cancion> lista = q.getResultList();
        lista.forEach(System.out::println);
    }
}

