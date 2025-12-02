package ud3.tarea4;


import java.util.Scanner;

class CochesPlantilla{
	
	public static void dameInfoCoches(String[][] datos) {
		System.out.println("Salida de dameInfoCoches:\n");
		//COMPLETAR
   	}
	
	public static String dameModeloCoche(String[][] datos, String marca) {
		String modelo="";
		System.out.println("\nSalida de dameModeloCoche:");
		
		//COMPLETAR
        	
        return(modelo);
   	}
	
	
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        String[][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}}; 
              	
        dameInfoCoches(coches);  
        
        String marca="kia";
        String modelo=dameModeloCoche(coches,"kia"); 
        System.out.println("\n Marca: "+marca+"\t Modelo: " +modelo);
    }
}
 