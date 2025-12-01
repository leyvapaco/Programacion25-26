package ud3.tarea3;

public class Ej8 {
public static void main(String[] args) {
	int[][] miArray= new int[5][5];
	
	for (int i=0; i<5; i++)
		for (int j=0; j<5; j++)
			miArray[i][j]=i+j;
	
	for (int i=0; i<5; i++)
		for (int j=0; j<5; j++) {
			System.out.print(" miArray["+i+"]["+j+"]=");
			System.out.println(miArray[i][j]);
		}
	
}
}
