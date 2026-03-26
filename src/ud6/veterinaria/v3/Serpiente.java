package ud6.veterinaria.v3;

public class Serpiente extends Animal {
    private EspecieSerpiente especie;
    private boolean venenosa;

    public Serpiente(EspecieSerpiente especie, boolean venenosa,
                     Sexo sexo, int peso, Propietario propietario) {
        super(sexo, peso, propietario);
        this.especie = especie;
        this.venenosa = venenosa;
    }

    @Override
    public void contactaPropietario() {
        System.out.println("Contactando al Propietario/a de la Serpiente");
    }

    @Override
    public String toString() {
        String texto = "Serpiente " + especie;
        if (venenosa) {
            texto = texto + " (venenosa)";
        }
        return texto;
    }
}
