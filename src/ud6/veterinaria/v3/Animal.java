package ud6.veterinaria.v3;

public abstract class Animal implements Contactable {

    protected int id;
    protected Sexo sexo;
    protected int peso; // gramos
    protected Propietario propietario;
    private static int numAnimales = 0; //Compartido por toda la clase al ser estático
  

    public Animal(Sexo sexo, int peso, Propietario propietario) {
        this.sexo = sexo;
        this.peso = peso;
        this.propietario = propietario;
		this.id=numAnimales+1;
		numAnimales++;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    //Método estático para devolver un atributo estático
    public static int getTotalAnimales() {
        return numAnimales;
    }
    

}
