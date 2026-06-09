package ud9.objectdb.ejemplos;

import javax.persistence.*;

@Entity
public class Cancion {

    @Id @GeneratedValue
    private long id;

    private String titulo;
    private String artista;
    private int reproducciones;

    public Cancion() {}

    public Cancion(String titulo, String artista, int reproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.reproducciones = reproducciones;
    }

    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }
    public int getReproducciones() { return reproducciones; }

    public void setTitulo(String t) { this.titulo = t; }
    public void setArtista(String a) { this.artista = a; }
    public void setReproducciones(int r) { this.reproducciones = r; }

    @Override
    public String toString() {
        return id + ": " + titulo + " - " + artista + " (" + reproducciones + ")";
    }
}

