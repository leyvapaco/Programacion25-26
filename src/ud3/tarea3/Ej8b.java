package ud3.tarea3;

public class Ej8b {
public static void main(String[] args) {
	int[][] miArray= new int[5][5];
	int min=100;
	int max=0;
	
	for (int i=0; i<5; i++)
		for (int j=0; j<5; j++) {
			miArray[i][j]=(int) (Math.random()*100);
			System.out.println(miArray[i][j]);
		}
	
	for (int i=0; i<5; i++)
		for (int j=0; j<5; j++) {
			if (miArray[i][j]<min)
				min=miArray[i][j];
			
			if (miArray[i][j]>max)
				max=miArray[i][j];				
		}
	
	System.out.println("Mínimo: "+min);
	System.out.println("Máximo "+max);
}
}
