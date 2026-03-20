package ud6.streams;

import java.util.List;

//Cuenta cuántas palabras empiezan por la letra “B”.

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Barco", "Casa", "Bici", "Perro", "Bebida");

        long cantidad = palabras.stream()
                .filter(p -> p.startsWith("B"))
                .count();
        
       
        System.out.println("Número de palabras que empiezan por B: " + cantidad);

        palabras.stream()
        		.filter(p -> p.startsWith("B"))
        		.forEach(System.out::println);

    }
}
