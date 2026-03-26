package ud6.veterinaria.v3;

import java.util.Objects;

public class Propietario {
    private String nombre;
    private String telefono;

    public Propietario(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " (" + telefono + ")";
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales = false;
        if (this == o) {
            iguales = true;
        } else if (o instanceof Propietario) {
            Propietario that = (Propietario) o;
            iguales = Objects.equals(nombre, that.nombre)
                    && Objects.equals(telefono, that.telefono);
        }
        return iguales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }
}
