package ud6.streams;

import java.util.List;
import java.util.stream.Collectors;

//Dada una lista de nombres en minúsculas, conviértelos todos a mayúsculas usando map.

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = List.of("mireia", "PACO", "pablo");

        List<String> mayus = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Nombres en mayúsculas: " + mayus);
        
        //Alternativa con expresión lamda
        List<String> mayus2 = nombres.stream()
        		.map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Nombres en mayúsculas: " + mayus2);

    }
}
