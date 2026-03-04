package ud6;
/*Crear una colección de 20 números enteros aleatorios menores que 10,
 *  guardarlos por orden decreciente a medida 
 *  que se vayan generando y mostrar la colección por pantalla.*/

//Este ejemplo visualiza cómo al insertar un elemento en una posición intermedia, reubica dinámicamente a los elementos que van detrás del insertado en una posición posterior

import java.util.ArrayList;
import java.util.Random;

public class Actividad3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(10); // número aleatorio entre 0 y 9

            // Insertar en orden decreciente a medida que se vayan generando
            int posicion = 0;
            while (posicion < numeros.size() && numeros.get(posicion) > num) {
                posicion++;
            }
            numeros.add(posicion, num);
        }

        // Mostrar la colección
        System.out.println("Colección ordenada (decreciente):");
        System.out.println(numeros);
    }
}

