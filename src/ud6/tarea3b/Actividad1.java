package ud6.tarea3b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Actividad1 {

    public static void main(String[] args) {

        // Creamos el HashMap con clave Integer y valor String
        HashMap<Integer, String> mapa = new HashMap<>();

        // Algunos ejemplos de compañeros con su DNI
        mapa.put(calcularClave("46221877D"), "Paco");
        mapa.put(calcularClave("12345678A"), "Mireia");
        mapa.put(calcularClave("98765432B"), "Irene");
        mapa.put(calcularClave("11223344C"), "José Manuel");

        // Mostrar todos los elementos del HashMap
        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + " - Valor: " + mapa.get(clave));
        }        
        System.out.println("------Otra forma de iterar el mapa");
        
        // Otra forma de iterar el mapa
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }
        System.out.println("------Otra forma de iterar el mapa");
        
        // Otra forma de iterar el mapa
        Iterator<Integer> it = mapa.keySet().iterator();

        while (it.hasNext()) {
            Integer entrada = it.next();
            System.out.println("Clave: " + entrada + " - Valor: " + mapa.get((entrada)));
        }        
        System.out.println("------Otra forma de iterar el mapa");
        
        // Otra forma de iterar el mapa
        Iterator<Map.Entry<Integer, String>> it2 = mapa.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<Integer, String> entrada = it2.next();
            System.out.println("Clave: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }
    }

    // Método que calcula la suma de los dígitos del DNI (ignorando la letra)
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
