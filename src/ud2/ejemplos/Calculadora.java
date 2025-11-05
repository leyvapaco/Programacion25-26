package ud2.ejemplos;

import java.util.Scanner;


public class Calculadora {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();

     System.out.print("Elige operación (+, -, *, /): ");
     char operacion = sc.next().charAt(0);
     
     /* Probar a quitar los comentarios de este bloque y veréis cómo el compilador nos avisa de posible excepción
     double resultado = calcular(num1, num2, operacion);
     System.out.println("Resultado: " + resultado);
     */
     /*
     try {
         double resultado = calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }*/

     sc.close();
 }

 public static double calcular(double a, double b, char op) throws DivisionPorCeroException {
     double resultado=0;
	 switch (op) {
         case '+': resultado= a + b;
         	break;
         case '-': resultado= a - b;
         	break;
         case '*': resultado= a * b;
         	break;
         case '/': resultado= a / b;
      		break;
         default:
             System.out.println("Operación desconocida");
     }
	return resultado;

 }
}

