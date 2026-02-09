package ud4.reto;

public class Ingrediente {

    private Producto nombre;
    private int calorias100g;
    private boolean tieneGluten;

    public Ingrediente(Producto nombre, int calorias100g, boolean tieneGluten) {
        this.nombre = nombre;
        this.calorias100g = calorias100g;
        this.tieneGluten = tieneGluten;
    }
    
    public Ingrediente() {
        this(Producto.QUESO, 250, false);
    }

    public Producto getNombre() {
        return nombre;
    }

    public int getCalorias100g() {
        return calorias100g;
    }

    public boolean isTieneGluten() {
        return tieneGluten;
    }

    @Override
    public String toString() {
        return nombre + " (" + calorias100g + " cal, gluten: " + tieneGluten + ")";
    }
}

