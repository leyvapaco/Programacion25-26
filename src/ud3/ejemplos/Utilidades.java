package ud3.ejemplos;

import java.util.Scanner;



public class Utilidades {
	
 static double suma(double a, double b) {
	 return a+b;
 }
	
 static double divide(double a, double b) throws DivPorCeroException {
	 if (b == 0) {
         throw new DivPorCeroException("No se puede dividir entre cero.");
     }
	 	 return a/b;
 }
 
 static double calcular(double a, double b, char op) throws DivPorCeroException {
     switch (op) {
         case '+': return suma(a,b);
         case '-': return a - b; //Implementar la función resta
         case '*': return a * b; //Implementar la función producto
         case '/':return divide(a,b);
         default:
             throw new IllegalArgumentException("Operación desconocida.");
     }
 }
 
}

