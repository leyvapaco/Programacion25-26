package ud9.objectdb.tarea;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:musica.odb");
        EntityManager em = emf.createEntityManager();
        CancionDAO dao = new CancionDAO(em);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ CANCIONES ===");
            System.out.println("1. Insertar canción");
            System.out.println("2. Listar canciones");
            System.out.println("3. Buscar canción por ID");
            System.out.println("4. Actualizar canción");
            System.out.println("5. Borrar canción");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Artista: ");
                    String a = sc.nextLine();
                    System.out.print("Reproducciones: ");
                    int r = Integer.parseInt(sc.nextLine());
                    dao.insertar(t, a, r);
                    break;

                case 2:
                    List<Cancion> lista = dao.listar();
                    lista.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID: ");
                    long idb = Long.parseLong(sc.nextLine());
                    Cancion c = dao.buscar(idb);
                    System.out.println(c != null ? c : "No encontrada.");
                    break;

                case 4:
                    System.out.print("ID: ");
                    long idu = Long.parseLong(sc.nextLine());
                    System.out.print("Nuevo título: ");
                    String nt = sc.nextLine();
                    System.out.print("Nuevo artista: ");
                    String na = sc.nextLine();
                    System.out.print("Nuevas reproducciones: ");
                    int nr = Integer.parseInt(sc.nextLine());
                    dao.actualizar(idu, nt, na, nr);
                    break;

                case 5:
                    System.out.print("ID: ");
                    long idd = Long.parseLong(sc.nextLine());
                    dao.borrar(idd);
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
}
