package ud6.streams;

import java.util.*;
import java.util.stream.*;

/*
Ejercicio: Usar Streams encadenados para:
1) Filtrar mayores de 18.
2) Agrupar por ciudad y calcular salario medio.
3) Filtrar ciudades con media > 2500.
4) Ordenar por salario medio desc.
5) Devolver Map<String, Double> manteniendo el orden.
*/


public class Ejercicio14 {

    static class Persona {
        private String nombre;
        private int edad;
        private String ciudad;
        private double salario;

        public Persona(String nombre, int edad, String ciudad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
            this.salario = salario;
        }

        public String getNombre() { return nombre; }
        public int getEdad() { return edad; }
        public String getCiudad() { return ciudad; }
        public double getSalario() { return salario; }

        @Override
        public String toString() {
            return nombre + " (" + edad + ", " + ciudad + ", " + salario + ")";
        }
    }

    public static void main(String[] args) {

        List<Persona> personas = List.of(
                new Persona("Pepe", 30, "Madrid", 2500),
                new Persona("Luis", 17, "Sevilla", 0),
                new Persona("Marta", 40, "Madrid", 3200),
                new Persona("Pedro", 25, "Valencia", 3800),
                new Persona("Lucía", 30, "Sevilla", 2100),
                new Persona("Juan", 50, "Madrid", 4000),
                new Persona("Lucas", 25, "Valencia", 4000)
        );

        //  Ejercicio avanzado con Streams encadenados
        Map<String, Double> resultado =
                personas.stream()
                // 1. Filtrar mayores de edad
                   .filter(p -> p.getEdad() > 18)

                        // 2. Agrupar por ciudad y calcular salario medio
                   .collect(Collectors.groupingBy(
                          Persona::getCiudad,
                          Collectors.averagingDouble(Persona::getSalario)
                   ))

                //Resultado de lo anterior: Map<String, Double> ciudadSalarioMedio
                        
                // 3. Convertir a stream para seguir operando
                // (Volvemos a abrir un stream, pero ahora sobre las entradas del mapa:)
                   .entrySet().stream()

                // 4. Filtrar ciudades con salario medio > 2500
                // Resultado: stream de entradas ciudad→media, pero solo las “bien pagadas”.
                   .filter(e -> e.getValue() > 2500)

                // 5. Ordenar por salario medio descendente
                //Ordenamos las entradas por el valor (el salario medio), de mayor a menor:
                   .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                   
                // Después de esto tendremos un stream: Stream<Map.Entry<String, Double>>
                // pero sigue siendo un stream, no una estructura de datos final (mapa)

                // 6. Volver a Map manteniendo el orden
                // Volvemos a cerrar el stream y construir el Map<String, Double> final
                // Map.Entry::getKey → la clave será la ciudad.
                // Map.Entry::getValue → el valor será el salario medio.
                // (a, b) -> a → función de resolución de colisiones (aquí realmente no habrá, pero es obligatorio indicarla).
                // “Si hay dos valores para la misma clave, quédate con el primero y descarta el segundo.”
                // LinkedHashMap::new → usamos LinkedHashMap para mantener el orden de inserción, es decir, el orden que hemos conseguido con el sorted
                // Map<String, Double> resultado final
                // con las ciudades ordenadas de mayor a menor salario medio, solo mayores de 2500.
                        
                   .collect(Collectors.toMap(
                         Map.Entry::getKey,
                         Map.Entry::getValue,
                         (a, b) -> a,
                           LinkedHashMap::new
                   ));

        System.out.println("Resultado final:");
        resultado.forEach((ciudad, media) ->
                System.out.println(ciudad + " → " + media)
        );
    }
}
