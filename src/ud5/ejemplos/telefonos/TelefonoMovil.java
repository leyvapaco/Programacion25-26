package ud5.ejemplos.telefonos;

public abstract class TelefonoMovil implements Telefono {
    protected String marca;
    protected String modelo;

    public TelefonoMovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println(marca + " " + modelo + " se está encendiendo...");
    }

    // Todos los móviles modernos cargan, pero no igual
    public abstract void cargar();

	@Override
	public String toString() {
		return "TelefonoMovil [marca=" + marca + ", modelo=" + modelo + "]";
	}
    
    
}
