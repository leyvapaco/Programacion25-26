package ud3.ejemplos;

import java.util.Scanner;


public class Utilidades {
	
static boolean validaOperacion(Character op) {
		return true; //Ejercicio: Modificar para que compruebe si la operación es una letra
	 }
			
	
 static double suma(double a, double b) {
	 return a+b;
 }
 
 static double resta(double a, double b) throws RestaException {
	 if(b>a)
		 throw new RestaException("Resta negativa");
	 return a-b;
 }
 
 static double producto(double a, double b) {
	 return a*b;
 }
	
 static double divide(double a, double b) throws DivPorCeroException {
	 if (b == 0) {
         throw new DivPorCeroException("No se puede dividir entre cero.");
     }
	 	 return a/b;
 }
 
  
 static double calcular(double a, double b, char op) throws DivPorCeroException,RestaException {
     switch (op) {
         case '+': return suma(a,b);
         case '-': return resta(a,b);
         case '*': return producto(a,b);
         case '/':return divide(a,b);
         default:
             throw new IllegalArgumentException("Operación desconocida.");
     }
 }
 
}

