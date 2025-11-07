package ud3.ejemplos;

import java.util.Scanner;

//Excepción personalizada
class DivPorCeroException extends Exception {
public DivPorCeroException(String mensaje) {
   super(mensaje); 
}
}

//Excepción personalizada
class RestaException extends Exception {
public RestaException(String mensaje) {
super(mensaje); 
}
}

//Ejercicio: Crear una excepción propia para el caso en que la operción no sea valida


public class CalculadoraConFunciones {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();

     System.out.print("Elige operación (+, -, *, /): ");
     Character operacion = sc.next().charAt(0); //Cambiado de char a Character para poder hacer el Ejercicio
     
     //Ejercicio: Capturar la nueva excepción
     
     try {
         double resultado = Utilidades.calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } catch (DivPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } 
     catch (RestaException e) {
         System.out.println("Error: " + e.getMessage());
     }catch (Exception e) {
         System.out.println("Operación no válida.");
     }

     sc.close();
 }

}

