package ud3.ejemplos;

public class ContarDigitos {
    public static int contar(int numero) {
        int contador=1;
    	
    	while (numero/10>0) {
    		contador++;
    		numero=numero/10;
    	}
        return contador;
    }

    public static void main(String[] args) {
        int numero = 1234567;
        System.out.println("Cantidad de dígitos: " + contar(numero));
    }
}
