package ud2.tarea1;

import java.util.Scanner;

public class Ej2 {
public static void main(String[] args) {
	int i,num;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Introduce un número");
	num=sc.nextInt();
	
	System.out.println("Mostrando los 10 posteriores "+num);
	i=num;
	
	while(i<num+10) {
		System.out.println("Número posterior "+i);
		i++;
	}
	
}
}
