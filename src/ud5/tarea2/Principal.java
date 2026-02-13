package ud5.tarea2;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // 1. Array de Figuras
        Figura[] figuras = new Figura[5];
        figuras[0] = new Cuadrado(5, "rojo");
        figuras[1] = new Triangulo(6, 8, "amarillo");
        figuras[2] = new Cuadrado(7, "verde");
        figuras[3] = new Triangulo(4, 5, "azul");
        figuras[4] = new Circulo(3);

        // Mostrar array
        System.out.println("=== CONTENIDO DEL ARRAY DE FIGURAS ===");
        for (Figura f : figuras) {
            System.out.println(f);
        }

        // Mostrar contador de polígonos
        System.out.println("\nPolígonos creados: " + PoligonoRegular.getContadorPoligonos());

        // 2. Array de Triángulos
        Triangulo[] triangulos = {
            new Triangulo(9, 6, "verde"),
            new Triangulo(3, 4, "amarillo"),
            new Triangulo(7, 5, "rojo"),
            new Triangulo(5, 8, "azul")
        };

        // Ordenación por defecto (lado)
        // sort usa la ordenación definida en el compareTo() de Triangulo
       
        Arrays.sort(triangulos);
        System.out.println("\n=== TRIÁNGULOS ORDENADOS POR LADO ===");
        for (Triangulo t : triangulos) {
            System.out.println(t);
        }

        // Ordenación por color. Sort usa el comparador definido en
        // la clase CompararTrianguloPorColor 
        Arrays.sort(triangulos, new CompararTrianguloPorColor());
        System.out.println("\n=== TRIÁNGULOS ORDENADOS POR COLOR ===");
        for (Triangulo t : triangulos) {
            System.out.println(t);
        }
    }
}
