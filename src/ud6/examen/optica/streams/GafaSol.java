package ud6.examen.optica.streams;

public class GafaSol extends Gafa implements Promocion, Comparable<GafaSol> {

	private Proveedor proveedor;
	private static int porcentajeDescuento=5;//porcentaje de escuento para todas las gafas de sol
	
	public GafaSol(Montura mont, LenteSinGraduar lenteI, LenteSinGraduar lenteD,  double coste, double precioVenta, Proveedor prov) {
		super(mont,lenteI,lenteD,coste,precioVenta);
		this.proveedor = prov;
	}

    @Override
    public TipoGafa getTipo() {
        return TipoGafa.SOL;
    }

    //Implementamos la interfaz Promocion
    @Override
    public void aplicaDescuento() {
        double porcentaje = porcentajeDescuento / 100.0;
        double precioConDescuento = getPrecioVenta() * (1 - porcentaje);
        setPrecioVenta(precioConDescuento);
    }
	

    public Proveedor getProveedor() {
		return proveedor;
	}

	@Override
	//Comparador por defecto: Por nombre de proveedor
    public int compareTo(GafaSol otra) {
        int cmp = this.proveedor.getNombre().compareTo(otra.proveedor.getNombre());
        if (cmp != 0) return cmp;
        return Integer.compare(this.id, otra.id); // desempate por ID
    }
    
	@Override
	public String toString() {
		return  "Proveedor=" + proveedor.getNombre() +" "+ super.toString();
	}

	
}
