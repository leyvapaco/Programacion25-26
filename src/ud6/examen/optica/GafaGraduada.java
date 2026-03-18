package ud6.examen.optica;

public class GafaGraduada extends Gafa implements Promocion{

	private static double porcentajeDescuento=10; //Porcentaja de descuento para todas las gafas graduadas
	
	public GafaGraduada( Montura mont, LenteGraduada lenteI, LenteGraduada lenteD,  double coste, double precioVenta) {
		super(mont,lenteI,lenteD,coste,precioVenta);
	}

	
    @Override
    public TipoGafa getTipo() {
        return TipoGafa.GRADUADA;
    }
	
	//Implementamos la interfaz Promocion
    @Override
    public void aplicaDescuento() {
        double porcentaje = porcentajeDescuento / 100.0;
        double precioConDescuento = getPrecioVenta() * (1 - porcentaje);
        setPrecioVenta(precioConDescuento);
    }
    
 	@Override
	public String toString() {
		return super.toString();
	}	
	
}
