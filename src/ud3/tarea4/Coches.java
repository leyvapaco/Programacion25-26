package ud3.tarea4;


import java.util.Scanner;

class Coches{
	
	public static void dameInfoCoches(String[][] datos) {
		System.out.println("Salida de dameInfoCoches:\n");
		System.out.println(" Número de vehículos:"+datos.length+"\n");
		
        for (int i=0; i<datos.length; i++)
        System.out.println(" Marca: "+datos[i][0]+"\t Modelo: " +datos[i][1]);
   	}
	
	public static String dameModeloCoche(String[][] datos, String marca) {
		String modelo="";
		System.out.println("\nSalida de dameModeloCoche:");
		
        for (int i=0; i<datos.length; i++)
        if (datos[i][0].equals(marca))
        	modelo=datos[i][1];
        	
        	return(modelo);
   	}
	
	
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        String[][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}}; 
              	
        dameInfoCoches(coches);  
        
        String marca="kia";
        String modelo=dameModeloCoche(coches,"renault"); 
        System.out.println("\n Marca: "+marca+"\t Modelo: " +modelo);
    }
}
 