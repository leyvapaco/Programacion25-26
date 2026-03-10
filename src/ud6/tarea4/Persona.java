package ud6.tarea4;

public class Persona {
    protected String nombre;
    protected String dni;
    protected int edad;
    protected double estatura;

    public Persona(String nombre, String dni, int edad, double estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", DNI: " + dni +
               ", Edad: " + edad +
               ", Estatura: " + estatura;
    }
}
