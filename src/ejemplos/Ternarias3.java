package ejemplos;
import java.util.Scanner;

//Varios ejemplos de uso de operadores ternarios

public class Ternarias3{
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		//Mostrar mayor de dos números
		int a = 10;
		int b = 20;
		int mayor = (a > b) ? a : b;
		System.out.println("El mayor es: " + mayor);
		
		//Averiguar si un número es par o impar
		int num = 7;
		String tipo = (num % 2 == 0) ? "Par" : "Impar";
		System.out.println("El número "+num+" es: " + tipo);
		
		//Averiguar si es mayor de edad
		int edad = 16;
		String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
		System.out.println(mensaje);
		
		//Indicar nota
		int nota = 5;
		String resultado = (nota >= 9) ? "Sobresaliente" :
		                   (nota >= 5) ? "Aprobado" :
		                   "Suspenso";
		System.out.println("Resultado: " + resultado);
		
		//Descuento en función del tipo de cliente
		String tipoCliente = "Premium";
		double descuento = tipoCliente.equals("Premium") ? 0.20 : 0.10;
		System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
		
		//Número dentro de un rango
		int valor = 15;
		String estado = (valor >= 10 && valor <= 20) ? "Dentro del rango" : "Fuera del rango";
		System.out.println(estado);
		
		//Mostrar texto en función de la temperatura
		int temperatura = 30;
		String mensaje2 = (temperatura > 35) ? "Demasiado calor" :
		                 (temperatura < 10) ? "Mucho frío" :
		                 "Temperatura agradable";
		System.out.println(mensaje2);

 }
}
