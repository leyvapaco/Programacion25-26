package ud6.tarea3b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        // Creamos el HashMap con clave Integer y valor String
        HashMap<Integer, String> mapa = new HashMap<>();

        // Insertamos algunos compañeros
        mapa.put(calcularClave("46221877D"), "Cano");
        mapa.put(calcularClave("12345678A"), "Irene");
        mapa.put(calcularClave("98765432B"), "Pedrós");
        mapa.put(calcularClave("11223344C"), "Jorge");

        // Mostramos todos los elementos del HashMap
        System.out.println("Contenido del HashMap:");
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }

        // Pedimos un DNI al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce un DNI para buscar: ");
        String dniUsuario = sc.nextLine();

        // Calculamos la clave correspondiente
        int clave = calcularClave(dniUsuario);

        // Comprobamos si existe en el HashMap
        if (mapa.containsKey(clave)) {
            System.out.println("Resultado encontrado: " + mapa.get(clave));
        } else {
            System.out.println("No existe ningún compañero con esa clave (" + clave + ").");
        }

        sc.close();
    }

    // Método que calcula la suma de los dígitos del DNI
    public static int calcularClave(String dni) {
        int suma = 0;

        for (char c : dni.toCharArray()) {
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }

        return suma;
    }
}
