package ud3.ejemplos;

import java.util.Scanner;

//Excepción personalizada
class DivPorCeroException extends Exception {
public DivPorCeroException(String mensaje) {
   super(mensaje); 
}
}

public class CalculadoraConFunciones {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();

     System.out.print("Elige operación (+, -, *, /): ");
     char operacion = sc.next().charAt(0);

     try {
         double resultado = Utilidades.calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } catch (DivPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Operación no válida.");
     }

     sc.close();
 }

}

