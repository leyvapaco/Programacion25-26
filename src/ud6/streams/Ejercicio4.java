package ud6.streams;

import java.util.Comparator;
import java.util.List;

//Dada una lista de nombres, encuentra el nombre con mayor longitud usando max y un Comparator.

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Ernestina", "Julio", "Mario");

        String masLargo = nombres.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("Lista vacía");

        System.out.println("Nombre más largo: " + masLargo);
    }
    
    //Alternativa  .max(Comparator.comparingInt(s -> s.length()));
}
