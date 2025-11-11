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

//Ejercicio: Crear una excepción propia para el caso en que la operación no sea valida
//Excepción personalizada
class OpNoValidaException extends Exception {
public OpNoValidaException(String mensaje) {
super(mensaje); 
}
}

//Ejercicio2: Crea aquí una excepción propia OperandoNoValidoException
// para el caso en que el operando no sea un número

public class CalculadoraConFunciones {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     //Ejercicio2: llama aquí a la función validaOperando(num1)
     // Y captura su posible excepción OperandoNoValidoException
     
     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();
     
     //Ejercicio2: llama a la función validaOperando(num2)
     // Y captura su posible excepción OperandoNoValidoException

     System.out.print("Elige operación (+, -, *, /): ");
     Character operacion = sc.next().charAt(0); //Cambiado de char a Character para poder hacer el Ejercicio
    
    
    try {
    	//Capturar la nueva excepción
         Utilidades.validaOperacion(operacion);
     }catch (OpNoValidaException e) {
    	 System.out.println("Error: " + e.getMessage());
     }
     
         
     try {
    	 Utilidades.validaOperacion(operacion);
    	 double resultado = Utilidades.calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } 
     catch (DivPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } 
     catch (RestaException e) {
         System.out.println("Error: " + e.getMessage());
    }catch (Exception e) {
         System.out.println("Fin del programa");
     }

     sc.close();
 }

}

