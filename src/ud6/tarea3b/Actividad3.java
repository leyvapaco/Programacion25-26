package ud6.tarea3b;

import java.util.HashMap;
import java.util.Map;

public class Actividad3 {

    public static void main(String[] args) {

        // Creamos el HashMap con clave Integer y valor String
        HashMap<Integer, String> mapa = new HashMap<>();

        // Insertamos algunos compañeros
        mapa.put(calcularClave("46221877D"), "Pedro Gonzalez Jimenez");
        mapa.put(calcularClave("12345678A"), "María López Ruiz");
        mapa.put(calcularClave("98765432B"), "Lucía Fernández Soto");
        mapa.put(calcularClave("11223344C"), "Javier Martín Pérez");

        // Recorremos el mapa mostrando cada clave-valor con el formato pedido
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println(
                "La clave " + entrada.getKey() +
                " está asociada al nombre \"" + entrada.getValue() + "\"."
            );
        }
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
