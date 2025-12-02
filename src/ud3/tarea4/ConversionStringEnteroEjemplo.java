package ud3.tarea4;

public class ConversionStringEnteroEjemplo {
    public static void main(String[] args) {
        // --- String a int ---
        String textoNumero = "123";
        int numero = Integer.parseInt(textoNumero); // conversión
        System.out.println("String \"" + textoNumero + "\" convertido a int: " + numero);

        // --- Control de errores ---
        try {
            int numeroInvalido = Integer.parseInt("abc"); // esto dará error
            System.out.println(numeroInvalido);
        } catch (NumberFormatException e) {
            System.out.println("Error: 'abc' no es un número válido.");
        }

        // --- int a String ---
        int edad = 25;
        String edadTexto1 = String.valueOf(edad);       // forma recomendada
        String edadTexto2 = Integer.toString(edad);     // alternativa

        System.out.println("int " + edad + " convertido a String con valueOf: " + edadTexto1);
        System.out.println("int " + edad + " convertido a String con toString: " + edadTexto2);

    }
}
