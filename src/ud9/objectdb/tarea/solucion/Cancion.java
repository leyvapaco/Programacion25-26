package ud9.objectdb.tarea.solucion;

import javax.persistence.*;

@Entity
public class Cancion {

    @Id @GeneratedValue
    private long id;

    private String titulo;
    private int reproducciones;

    @ManyToOne
    private Artista artista;

    public Cancion() {}

    public Cancion(String titulo, Artista artista, int reproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.reproducciones = reproducciones;
    }

    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    public int getReproducciones() { return reproducciones; }

    public void setTitulo(String t) { this.titulo = t; }
    public void setArtista(Artista a) { this.artista = a; }
    public void setReproducciones(int r) { this.reproducciones = r; }

    @Override
    public String toString() {
        return id + ": " + titulo + " - " + artista.getNombre() +
               " (" + reproducciones + ")";
    }
}


