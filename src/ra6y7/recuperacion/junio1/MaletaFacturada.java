package ra6y7.recuperacion.junio1;

public abstract class MaletaFacturada extends Equipaje implements Facturable {

    public MaletaFacturada(String codigo, double alto, double ancho, double profundidad) {
        super(codigo, alto, ancho, profundidad);
    }
    
    public void imprimirEtiqueta() {
        System.out.println("Imprimiendo etiqueta de "+this.getClass().getSimpleName()+" con código "+this.getCodigo());
   }
}
