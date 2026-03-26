package ud6.veterinaria.v3;

public class Gato extends Domestico {

    private int pesoUniasGato=20;


	public Gato(String nombre, int edad, String raza, String chip,Sexo sexo, int peso, Propietario propietario) {
		super(sexo, peso, propietario, nombre, edad, raza, chip);
		this.pesoUniasGato = pesoUniasGato;
	}

	//Implementamos el método abstracto de la clase padre
	public void cortaUnias() {
        int nuevoPeso = this.peso - pesoUniasGato;
        this.peso = (nuevoPeso >= 0) ? nuevoPeso : 0;
    }

    //Implementamos este método propio de la clase Perro
    @Override
    public void contactaPropietario() {
        System.out.println("Contactando al Propietario/a del Gato");
    }

    //Implementamos el interfaz Contactable
    @Override
    public String toString() {
        return "Gato " + nombre + " (" + raza + ")";
    }

}
