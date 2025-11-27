package ud3.ejemplos;

public class EjemploMatrizStrings {
    public static void main(String[] args) {
        String[][] premios = {
            {"02458", "Gordo de Navidad"},
            {"23462", "Segundo premio"},
            {"54584", "Tercer premio"}
        };

        for (int i = 0; i < premios.length; i++) {
            System.out.println("Núm: " + premios[i][0] + 
                               " | Premio: " + premios[i][1]);
        }
    }
}
