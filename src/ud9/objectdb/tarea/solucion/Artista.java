package ud9.objectdb.tarea.solucion;

import javax.persistence.*;

@Entity
public class Artista {

    @Id @GeneratedValue
    private long id;

    private String nombre;
    private String pais;

    public Artista() {}

    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }

    public void setNombre(String n) { this.nombre = n; }
    public void setPais(String p) { this.pais = p; }

    @Override
    public String toString() {
        return id + ": " + nombre + " (" + pais + ")";
    }
}
