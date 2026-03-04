package ud6;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Actividad8 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();
        nombres.add("Paco");
        nombres.add("Paca");
        nombres.add("Pake");
        nombres.add("Pakis");
        nombres.add("Paco");
        nombres.add("Pico");
        nombres.add("Paca");
        
        List<String> nombresSinRepetidos = eliminaRepetidos(nombres);
        
      
        System.out.println("Lista original: " + nombres);
        System.out.println("Lista sin repetidos: " + nombresSinRepetidos);
    }

    public static List<String> eliminaRepetidos(List<String> c) {
    
        Set<String> conjunto = new HashSet<String>(c);
        
      
        List<String> listaSinRepetidos = new ArrayList<String>(conjunto);
        
        return listaSinRepetidos;
    }
}
