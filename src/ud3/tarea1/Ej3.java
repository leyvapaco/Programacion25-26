package ud3.tarea1;

public class Ej3 {
public static void main(String[] args) {
	int tipo=1; //Estas variables no son conocidas dentro de la función
	double r=5.0;
	double a=10.0;
	
	System.out.println("Resultado: "+calculaAV(tipo,r,a));	
	
}

static double calculaAV(int tipo, double radio, double altura) {
	double resultado=0.0;
	final double PI=3.1416;
	//Estas variables no son conocidas fuera de la función
	
	switch (tipo) {
	case 1:
		resultado=2*PI*radio*(altura+radio);
		break;
	case 2:
		resultado=PI*radio*radio*altura;
		break;
	}
	return resultado;
 }

}
