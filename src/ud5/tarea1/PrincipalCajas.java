package ud5.tarea1;

public class PrincipalCajas {
    public static void main(String[] args) {
    	
    	//Actividad 7
        System.out.println("\nActividad 7");
        Caja c = new Caja(2, 0.5, 0.3, Unidades.m); // medidas en metros
        //Etiqueta e1=new Etiqueta("F. Leyva", "Av Andaluces, 3");
        //c.setEtiqueta(e1);
        c.setEtiqueta(new Etiqueta("F. Leyva", "Av Andaluces, 3"));

        System.out.println(c); //Internamente llama a toString() del objeto
        System.out.println("Volumen: " + c.getVolumen() + " m³");
        
    	//Actividad 8
        
        System.out.println("\nActividad 8");
        CajaCarton c1 = new CajaCarton(30, 20, 10); 
        EtiquetaNumero etiq1=new EtiquetaNumero(12345);
        c1.setEtiqueta(etiq1); 
        
        CajaCarton c2 = new CajaCarton(50, 40, 30); 
        EtiquetaNumero etiq2=new EtiquetaNumero(67890);
        c2.setEtiqueta(etiq2); 
        
        System.out.println(c1); 
        System.out.println(c2); 
        System.out.println("\nSuperficie total de cartón: " + CajaCarton.getSuperficieTotal() + " cm²");
    
    }
}
