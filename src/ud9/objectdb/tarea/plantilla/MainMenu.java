package ud9.objectdb.tarea.plantilla;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:musica2.odb");
        EntityManager em = emf.createEntityManager();

        ArtistaDAO artistaDAO = new ArtistaDAO(em);
        CancionDAO cancionDAO = new CancionDAO(em);

        insertarDatosIniciales(artistaDAO, cancionDAO);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ CANCIONES ===");
            System.out.println("1. Insertar canción");
            System.out.println("2. Listar canciones");
            System.out.println("3. Buscar canción por ID");
            System.out.println("4. Actualizar canción");
            System.out.println("5. Borrar canción");
            System.out.println("6. Listar canciones por artista");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    artistaDAO.listar().forEach(System.out::println);
                    System.out.print("ID del artista: ");
                    long idArt = Long.parseLong(sc.nextLine());
                    Artista art = artistaDAO.buscar(idArt);

                    if (art == null) {
                        System.out.println("Artista no encontrado.");
                        break;
                    }

                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Reproducciones: ");
                    int r = Integer.parseInt(sc.nextLine());

                    cancionDAO.insertar(t, art, r);
                    break;

                case 2:
                    cancionDAO.listar().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID: ");
                    long idb = Long.parseLong(sc.nextLine());
                    Cancion c = cancionDAO.buscar(idb);
                    System.out.println(c != null ? c : "No encontrada.");
                    break;

                case 4:
                    System.out.print("ID: ");
                    long idu = Long.parseLong(sc.nextLine());
                    Cancion cu = cancionDAO.buscar(idu);

                    if (cu == null) {
                        System.out.println("No existe esa canción.");
                        break;
                    }

                    System.out.print("Nuevo título: ");
                    String nt = sc.nextLine();

                    artistaDAO.listar().forEach(System.out::println);
                    System.out.print("Nuevo ID de artista: ");
                    long idNuevoArt = Long.parseLong(sc.nextLine());
                    Artista nuevoArt = artistaDAO.buscar(idNuevoArt);

                    System.out.print("Nuevas reproducciones: ");
                    int nr = Integer.parseInt(sc.nextLine());

                    cancionDAO.actualizar(idu, nt, nuevoArt, nr);
                    break;

                case 5:
                    System.out.print("ID: ");
                    long idd = Long.parseLong(sc.nextLine());
                    cancionDAO.borrar(idd);
                    break;

                case 6:
                    artistaDAO.listar().forEach(System.out::println);
                    System.out.print("ID del artista: ");
                    long idList = Long.parseLong(sc.nextLine());
                    List<Cancion> lista = cancionDAO.listarPorArtista(idList);
                    lista.forEach(System.out::println);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        em.close();
        emf.close();
        sc.close();
    }

    private static void insertarDatosIniciales(ArtistaDAO artistaDAO, CancionDAO cancionDAO) {

        // Insertar artistas
        artistaDAO.insertar("Feid", "Colombia");
        artistaDAO.insertar("Karol G", "Colombia");
        artistaDAO.insertar("Quevedo", "España");

        // Recuperar artistas
        Artista feid = artistaDAO.listar().get(0);
        Artista karol = artistaDAO.listar().get(1);
        Artista quevedo = artistaDAO.listar().get(2);

        // Insertar canciones
        cancionDAO.insertar("Luna", feid, 8200000);
        cancionDAO.insertar("Classy 101", feid, 5400000);
        cancionDAO.insertar("Friki", karol, 4900000);
        cancionDAO.insertar("Columbia", quevedo, 6800000);
    }
}

