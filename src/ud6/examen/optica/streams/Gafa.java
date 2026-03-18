package ud6.examen.optica.streams;

public abstract class Gafa implements Promocion{
	
	private static Integer cuantas=0; //Contador de gafas
	protected  Integer id; //Identificador secuencial de la gafa
	protected  Montura montura;
	protected  Lente lenteI;
	protected  Lente lenteD;
	protected  double coste; //Coste de proveedor
	protected  double precioVenta;
	
	
	public Gafa(Montura mont, Lente lenteI, Lente lenteD,  double coste, double precioVenta){
		cuantas++;
		this.id=cuantas;
		this.montura = mont;
		this.lenteI=lenteI;
		this.lenteD=lenteD;
		this.coste = coste;
		this.precioVenta= precioVenta;
	}
	
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public abstract TipoGafa getTipo();
	
	public double getCoste() {
		return coste;
	}

	public Integer getId() {
		return id;
	}
	
    @Override
    //Podríamos considerar que 2 gafas son iguales si tienen el mismmo id
    //Por lo que en realidad no debería haber gafas iguales 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gafa)) return false;
        return this.id == ((Gafa) o).id;
    }

	@Override
	public String toString() {
		return "Gafa [id=" + id + ", montura=" + montura + ", lenteI=" + lenteI + ", lenteD=" + lenteD + ", coste="
				+ coste + ", precioVenta=" + precioVenta + "]";
	}
		
}
