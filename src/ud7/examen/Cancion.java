package ud7.examen;

import java.io.Serializable;

class Cancion implements Serializable {
    private String nombre;
    private int reproducciones;

    public Cancion(String nombre, int reproducciones) {
        this.nombre = nombre;
        this.reproducciones = reproducciones;
    }

    public String getNombre() { return nombre; }
    public int getReproducciones() { return reproducciones; }

    @Override
    public String toString() {
        return nombre + " (" + reproducciones + " reproducciones)";
    }
}
