package ud6.examen.optica;

public class Principal {

    public static void main(String[] args) {

        Optica opt1 = new Optica("Veo Veo", "A12345678");
        System.out.println("ÓPTICA: " + opt1.cuantasGafas() + " gafas en stock inicialmente.");

        // -----------------------------
        // Proveedores
        // -----------------------------
        Proveedor prov1 = new Proveedor("22.222.222B", "BernardoSunglasses", "+34311234");
        Proveedor prov2 = new Proveedor("11.111.111B", "AlfonsoVision", "+34211233");

        // -----------------------------
        // Monturas
        // -----------------------------
        Montura mon1 = new Montura("Rayban", "Rojo", MaterialMontura.PASTA);
        Montura mon2 = new Montura("Guess", "Marrón", MaterialMontura.METAL);

        // -----------------------------
        // Lentes
        // -----------------------------
        LenteGraduada lenGIzd = new LenteGraduada('I', TipoProblema.MIOPIA, 1.2);
        LenteGraduada lenGDer = new LenteGraduada('D', TipoProblema.MIOPIA, 0.8);

        LenteSinGraduar lenSolIzd = new LenteSinGraduar('I', ColorLente.VERDE);
        LenteSinGraduar lenSolDer = new LenteSinGraduar('D', ColorLente.VERDE);

        // Probamos dimeTipoLente()
        System.out.println("\nProbando dimeTipoLente():");
        lenGIzd.dimeTipoLente();
        lenSolIzd.dimeTipoLente();

        // -----------------------------
        // Gafas graduadas
        // -----------------------------
        Gafa gafaG1 = new GafaGraduada(mon1, lenGIzd, lenGDer, 100.0, 200.0);
        Gafa gafaG2 = new GafaGraduada(mon2, lenGIzd, lenGDer, 80.0, 150.0);
        Gafa gafaG3 = new GafaGraduada(mon2, lenGIzd, lenGDer, 80.0, 150.0);

        System.out.println("\n¿Son iguales gafaG2 y gafaG3? " + gafaG2.equals(gafaG3));

        // -----------------------------
        // Gafas de sol
        // -----------------------------
        Gafa gafaSol1 = new GafaSol(mon1, lenSolIzd, lenSolDer, 50.0, 100.0, prov1);
        Gafa gafaSol2 = new GafaSol(mon2, lenSolIzd, lenSolDer, 30.0, 60.0, prov2);

        // -----------------------------
        // Añadir al stock
        // -----------------------------
        opt1.addGafa(TipoGafa.GRADUADA, gafaG1);
        opt1.addGafa(TipoGafa.GRADUADA, gafaG2);
        opt1.addGafa(TipoGafa.GRADUADA, gafaG3);
        opt1.addGafa(TipoGafa.SOL, gafaSol1);
        opt1.addGafa(TipoGafa.SOL, gafaSol2);

        System.out.println("\nTotal gafas en stock: " + opt1.cuantasGafas());

        // -----------------------------
        // Listado por proveedor
        // -----------------------------
        System.out.println("\nGafas de sol ordenadas por proveedor:");
        opt1.gafasByProveedor();

        // -----------------------------
        // Costes por tipo
        // -----------------------------
        System.out.println();
        opt1.costeGafasByTipo(TipoGafa.GRADUADA);
        opt1.costeGafasByTipo(TipoGafa.SOL);

        // -----------------------------
        // Precios con descuento
        // -----------------------------
        System.out.println("\nPrecios tras aplicar descuento:");
        System.out.println("Gafa G1: " + opt1.damePrecioGafa(gafaG1));
        System.out.println("Gafa G2: " + opt1.damePrecioGafa(gafaG2));
        System.out.println("Gafa Sol1: " + opt1.damePrecioGafa(gafaSol1));
        System.out.println("Gafa Sol2: " + opt1.damePrecioGafa(gafaSol2));

        // -----------------------------
        // Borrado de una gafa
        // -----------------------------
        System.out.println("\nBorrando gafa del proveedor AlfonsoVision...");
        opt1.delGafas(gafaSol2);

        System.out.println("Total gafas en stock: " + opt1.cuantasGafas());
        System.out.println("\nGafas de sol tras borrado:");
        opt1.gafasByProveedor();
    }
}
