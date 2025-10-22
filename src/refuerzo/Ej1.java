package refuerzo;

import java.util.Scanner;

public class Ej1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Tiene credenciales activas? (true/false): ");
        boolean credenciales = sc.nextBoolean();

        System.out.print("Tipo de usuario (A/P/E): ");
        char tipo = sc.next().charAt(0);

        if (credenciales && edad >= 18) {
            System.out.println("Acceso permitido");
        } else if (credenciales) {
            System.out.println("Acceso restringido por edad");
        } else {
            System.out.println("Acceso denegado");
        }

        switch (tipo) {
            case 'A': System.out.println("Panel de administración"); break;
            case 'P': System.out.println("Acceso a clases y recursos"); break;
            case 'E': System.out.println("Consulta tus tareas y calificaciones"); break;
            default: System.out.println("Tipo de usuario no reconocido");
        }
    }
}
