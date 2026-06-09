package ud3.examen;

import java.util.Scanner;

//Excepción propia para DNI inválido
class DNIInvalidoException extends Exception {
 public DNIInvalidoException(String mensaje) {
     super(mensaje);
 }
}

public class Ej1Sol {

 // Función que lee un DNI y valida su formato
 public static String leerDNI() throws DNIInvalidoException {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el DNI (8 números y una letra): ");
     String dni = sc.next();

     // Expresión regular: 8 números seguidos de una letra mayúscula
     if (!dni.matches("^[0-9]{8}[A-Za-z]$")) {
         throw new DNIInvalidoException("Formato de DNI inválido. Debe ser 8 números y una letra.");
     }
     return dni.toUpperCase();
 }

 // Función que cambia un dígito en la posición indicada
 public static String cambiarDigito(String dni, int posicion, char nuevoValor) throws DNIInvalidoException {
     // Validar que la posición esté dentro de los 8 números
     if (posicion < 1 || posicion > 8) {
         throw new DNIInvalidoException("La posición debe estar entre 1 y 8 (solo los dígitos numéricos).");
     }
     if (!Character.isDigit(nuevoValor)) {
         throw new DNIInvalidoException("El nuevo valor debe ser un dígito numérico.");
     }

     // Convertir a array de caracteres para modificar
     char[] caracteres = dni.toCharArray();
     caracteres[posicion - 1] = nuevoValor; // -1 porque el índice empieza en 0

     return new String(caracteres);
 }

 public static void main(String[] args) {
     try {
         String dni = leerDNI();
         System.out.println("DNI válido: " + dni);

         // Ejemplo: cambiar el 3er dígito por '9'
         String dniModificado = cambiarDigito(dni, 3, '9');
         System.out.println("DNI modificado: " + dniModificado);

     } catch (DNIInvalidoException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
