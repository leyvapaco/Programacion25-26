package ud3.tarea3;

import java.util.HashSet;
public class Ej6 {

    public static int[] sinRepetidos(int t[]) {
        // Array auxiliar con el mismo tamaño que t (máximo posible de únicos)
        int[] aux = new int[t.length];
        int contador = 0; // número de elementos únicos encontrados

        // Recorremos el array original
        for (int i = 0; i < t.length; i++) {
            int elemento = t[i];
            boolean repetido = false;

            // Comprobamos si ya está en aux
            int j = 0;
            while (!repetido && j < contador) {
                  if (aux[j] == elemento) {
                        repetido = true;	
                   }
                  j++;
            }        
            // Si no está repetido, lo añadimos
            if (!repetido) {
                aux[contador] = elemento;
                contador++;
            }
        }

        // Creamos el array resultado con el tamaño exacto
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = aux[i];
        }

        return resultado;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] datos = {4, 2, 7, 2, 4, 9, 7, 1};
        int[] sinDup = sinRepetidos(datos);

        System.out.print("Array sin repetidos: ");
        for (int n : sinDup) {
            System.out.print(n + " ");
        }
    }
}

