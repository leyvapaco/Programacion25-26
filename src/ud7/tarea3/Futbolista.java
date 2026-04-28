package ud7.tarea3;

import java.util.List;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private List<String> demarcaciones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, List<String> demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    public int getDorsal() { 
    	return dorsal; 
    }
    
    public String getNombre() {
    	return nombre; 
    }
    
    public List<String> getDemarcaciones() {
    	return demarcaciones; 
    }
    
    public String getEquipo() { 
    	return equipo; 
    }
}
