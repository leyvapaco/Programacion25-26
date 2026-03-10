package ud6.tarea4;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Empleado> empleados = new LinkedHashMap<>();

        System.out.println("=== CARGA INICIAL DE EMPLEADOS ===");

        // Inserción inicial
        insertarEmpleados(sc, empleados);

        int opcion;

        do {
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Visualizar listado");
            System.out.println("2. Borrar empleado");
            System.out.println("3. Visualizar empleado por DNI");
            System.out.println("4. Modificar empleado");
            System.out.println("5. Insertar nuevos empleados");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    visualizarListado(empleados);
                    break;

                case 2:
                    borrarEmpleado(sc, empleados);
                    visualizarListado(empleados);
                    break;

                case 3:
                    visualizarEmpleado(sc, empleados);
                    break;

                case 4:
                    modificarEmpleado(sc, empleados);
                    visualizarListado(empleados);
                    break;

                case 5:
                    insertarEmpleados(sc, empleados);
                    visualizarListado(empleados);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        System.out.println("\n=== LISTADO FINAL DE EMPLEADOS ===");
        visualizarListado(empleados);
    }

    
    
    // ---------------- MÉTODOS AUXILIARES ----------------

    public static void insertarEmpleados(Scanner sc, Map<String, Empleado> empleados) {
        String continuar;

        do {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("DNI: ");
            String dni = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Estatura: ");
            double estatura = sc.nextDouble();

            System.out.print("Sueldo: ");
            double sueldo = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            empleados.put(dni, new Empleado(nombre, dni, edad, estatura, sueldo));

            System.out.print("¿Insertar otro empleado? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void visualizarListado(Map<String, Empleado> empleados) {
        System.out.println("\n=== LISTADO DE EMPLEADOS ===");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        for (Empleado e : empleados.values()) {
            System.out.println(e);
        }
    }

    public static void borrarEmpleado(Scanner sc, Map<String, Empleado> empleados) {
        String continuar;

        do {
            System.out.print("Introduce el DNI del empleado a borrar: ");
            String dni = sc.nextLine();

            if (empleados.remove(dni) != null) {
                System.out.println("Empleado eliminado.");
            } else {
                System.out.println("No existe un empleado con ese DNI.");
            }

            System.out.print("¿Borrar otro empleado? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void visualizarEmpleado(Scanner sc, Map<String, Empleado> empleados) {
        System.out.print("Introduce el DNI del empleado: ");
        String dni = sc.nextLine();

        Empleado e = empleados.get(dni);

        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("No existe un empleado con ese DNI.");
        }
    }

    public static void modificarEmpleado(Scanner sc, Map<String, Empleado> empleados) {
        System.out.print("Introduce el DNI del empleado a modificar: ");
        String dni = sc.nextLine();

        Empleado e = empleados.get(dni);

        if (e == null) {
            System.out.println("No existe un empleado con ese DNI.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        e.setNombre(sc.nextLine());

        System.out.print("Nueva edad: ");
        e.setEdad(sc.nextInt());

        System.out.print("Nueva estatura: ");
        e.setEstatura(sc.nextDouble());

        System.out.print("Nuevo sueldo: ");
        e.setSueldo(sc.nextDouble());
        sc.nextLine(); // limpiar buffer

        System.out.println("Empleado modificado.");
    }
}
