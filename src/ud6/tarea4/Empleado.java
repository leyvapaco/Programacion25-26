package ud6.tarea4;

public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre; 
    }
    
    public void setEdad(int edad) {
    	this.edad = edad; 
    }
    public void setEstatura(double estatura) {
    	this.estatura = estatura; 
    }
    
    public void setSueldo(double sueldo) {
    	this.sueldo = sueldo; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo;
    }
}
