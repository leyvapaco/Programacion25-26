package ud3.tarea1;

public class Ej5 {
	
	static int calculaMayor(int a,int b, int c) {
		int mayor;
		
		if (a>b)
			if(a>c) 
				mayor=a;
			else
				mayor=c;
		else if (b>c)
			    mayor=b;
			 else mayor=c;
		
		return mayor;
	}
	
	public static void main(String[] args) {
		
		//Prueba de todos los casos
		System.out.println(calculaMayor(1,2,3));
		System.out.println(calculaMayor(1,3,2));
		System.out.println(calculaMayor(2,1,3));
		System.out.println(calculaMayor(2,3,1));
		System.out.println(calculaMayor(3,1,2));	
		System.out.println(calculaMayor(3,2,1));		
	}
}
