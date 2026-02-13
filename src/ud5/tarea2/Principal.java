package ud5.tarea2;

import java.util.Arrays;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // Array de 5 figuras
        Figura[] figuras = new Figura[5];
        figuras[0] = new Cuadrado(5, Colores.ROJO);
        figuras[1] = new Triangulo(6, 4, Colores.VERDE);
        figuras[2] = new Circulo(3);
        figuras[3] = new Cuadrado();
        figuras[4] = new Triangulo();

        System.out.println("Contenido del array de figuras:");
        for (Figura f : figuras) {
            System.out.println(f);
        }

        System.out.println("\nContador de polígonos creados: " + PoligonoRegular.contadorPoligonos);

        // Array de triángulos
        Triangulo[] triangulos = {
            new Triangulo(8, 5, Colores.AMARILLO),
            new Triangulo(3, 2, Colores.ROJO),
            new Triangulo(6, 4, Colores.AZUL)
        };

        System.out.println("\nTriángulos ordenados por lado (orden natural):");
        Arrays.sort(triangulos);
        for (Triangulo t : triangulos) {
            System.out.println(t);
        }

        System.out.println("\nTriángulos ordenados por color:");
        Arrays.sort(triangulos, new CompararTrianguloPorColor());
        for (Triangulo t : triangulos) {
            System.out.println(t);
        }
    }
}
