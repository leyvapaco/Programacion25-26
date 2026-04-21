package ud7.tarea2;

import java.io.Serializable;

public class Tren implements Serializable {
	private static final long serialVersionUID = 1234L;
	
    private String nombre;
    private int numPasajeros;

    public Tren(String nombre, int numPasajeros) {
        this.nombre = nombre;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "nombre='" + nombre + '\'' +
                ", numPasajeros=" + numPasajeros +
                '}';
    }
}
