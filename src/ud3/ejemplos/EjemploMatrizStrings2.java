package ud3.ejemplos;

public class EjemploMatrizStrings2 {
    public static void main(String[] args) {
        String[][] alumnos = {
            {"Héctor", "Programación"},
            {"Mario", "Bases de Datos"},
            {"Irene", "Sistemas"}
        };

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i][0] + 
                               " | Módulo: " + alumnos[i][1]);
        }
    }
}
