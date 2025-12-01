package ud3.tarea3;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alumnos = 5;
        int trimestres = 3;

        // Matriz: filas = trimestres, columnas = alumnos
        int[][] notas = new int[trimestres][alumnos];

        // Lectura de notas
        for (int i = 0; i < trimestres; i++) {
            System.out.println("Introduce las notas del trimestre " + (i + 1) + ":");
            for (int j = 0; j < alumnos; j++) {
                System.out.print("Alumno " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
            }
        }

        // Calcular media del grupo en cada trimestre
        for (int i = 0; i < trimestres; i++) {
            int suma = 0;
            for (int j = 0; j < alumnos; j++) {
                suma += notas[i][j];
            }
            double media = (double) suma / alumnos;
            System.out.println("Media del grupo en trimestre " + (i+1) + ": " + media);
        }

        // Calcular media de un alumno concreto
        System.out.print("Introduce la posición del alumno (1-5): ");
        int pos = sc.nextInt() - 1; // restamos 1 para índice

        if (pos >= 0 && pos < alumnos) {
            int sumaAlumno = 0;
            for (int i = 0; i < trimestres; i++) {
                sumaAlumno += notas[i][pos];
            }
            double mediaAlumno = (double) sumaAlumno / trimestres;
            System.out.println("Media del alumno " + (pos+1) + ": " + mediaAlumno);
        } else {
            System.out.println("Posición inválida.");
        }
    }
}
