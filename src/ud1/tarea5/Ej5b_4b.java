package ud1.tarea5
;
import java.util.Scanner;

//Solución a Ej5 usando bucles

public class Ej5b_4b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		
		int horasTrabajadas=sc.nextInt();
		
		final int HORAS_SEMANA=40; //constante
		
		float precioHoraOrdinaria=12.0f;
		float precioHoraExtra=16.0f;
		
		float salarioSemanal=0.0f;
		
		int contador=0;
		while (contador<horasTrabajadas) {
			if (contador<HORAS_SEMANA)
				salarioSemanal=salarioSemanal+precioHoraOrdinaria;
			else
				salarioSemanal=salarioSemanal+precioHoraExtra;
			contador++;
		}
		
		System.out.println("El sueldo por trabajar "+horasTrabajadas+" es "+salarioSemanal+" euros.");
   }


}
