package ud1.tarea5;
import java.util.Scanner;

//Solución a Ej5b sin usar bucles

public class Ej5_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		
		int horasTrabajadas=sc.nextInt();
		
		final int HORAS_SEMANA=40; //constante
		
		int excesoHoras=(horasTrabajadas-HORAS_SEMANA>0)?horasTrabajadas-HORAS_SEMANA:0;
		
		float precioHoraOrdinaria=12.0f;
		float precioHoraExtra=16.0f;
		
		float salarioSemanal=0.0f;
		
		salarioSemanal=(horasTrabajadas-excesoHoras)*precioHoraOrdinaria;
		salarioSemanal+=excesoHoras*precioHoraExtra;

		
		System.out.println("El sueldo por trabajar "+horasTrabajadas+" horas es "+salarioSemanal+" euros.");
   }


}
