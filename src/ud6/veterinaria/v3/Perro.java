package ud6.veterinaria.v3;

public class Perro extends Domestico {

    private int pesoUniasPerro=20;


    public Perro(String nombre, int edad, String raza, String chip,Sexo sexo, int peso, Propietario propietario) {
		super(sexo, peso, propietario, nombre, edad, raza, chip);
		this.pesoUniasPerro = pesoUniasPerro;
	}
    
   
	//Implementamos el método abstracto de la clase padre
    public void cortaUnias() {
        int nuevoPeso = this.peso - pesoUniasPerro;
        this.peso = (nuevoPeso >= 0) ? nuevoPeso : 0;
    }

    //Implementamos este método propio de la clase Perro
    public void damePatita() {
        System.out.println("El perro " + nombre + " te da la patita");
    }
    
    //Implementamos el interfaz Contactable
    @Override
    public void contactaPropietario() {
        System.out.println("Contactando al Propietario/a del Perro");
    }

    @Override
    public String toString() {
        return "Perro " + nombre + " (" + raza + ")";
    }
}
