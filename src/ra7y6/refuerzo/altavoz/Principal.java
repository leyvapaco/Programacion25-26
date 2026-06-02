package ra7y6.refuerzo.altavoz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ra7y6.refuerzo.altavoz.AltavozEmpotrable.Ubicacion;
import ra7y6.refuerzo.altavoz.AltavozTV.Conector;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        Empresa superSound = new Empresa("27.837.24X");

        Altavoz mov1 = new AltavozMovil("MOV_001", 10.2, 10.2);
        AltavozTV tv1 = new AltavozTV("TV_001", 10.2, 10.2, Conector.BLUETOOTH);

        AltavozCoche puertaDcha = new AltavozEmpotrable("EMPO_PD_001", 15.2, 1.3, Ubicacion.PUERTA);
        AltavozCoche salpicadero1 = new AltavozEmpotrable("EMPO_SAL_001", 8.2, 8.2, Ubicacion.SALPICADERO);

        AltavozCoche trasero1 = new AltavozTrasero("TRA_001", 35.2, 35.2, 100, true);
        AltavozCoche trasero2 = new AltavozTrasero("TRA_002", 35.2, 35.2, 100, true);

        Altavoz.cuantosAltavoces();

        trasero1.activarGraves();

        // Registramos los altavoces vendidos; el primero por duplicado
        superSound.addVendidos(tv1);
        superSound.addVendidos(tv1);
        superSound.addVendidos(puertaDcha);
        superSound.addVendidos(salpicadero1);
        superSound.addVendidos(trasero2);

        // Intentamos eliminar de vendidos uno que no está registrado
        superSound.delVendidos(mov1);

        Date ahora = new Date();

        Revision rev1 = new Revision(ahora, 230.0, true);
        superSound.addReview(puertaDcha, rev1);
        superSound.addReview(trasero2, rev1);

        // Generamos un breve retraso
        Thread.sleep(1000);
        Date despues = new Date();

        Revision rev2 = new Revision(despues, 130.0, true);
        superSound.addReview(puertaDcha, rev2);
        superSound.addReview(trasero2, rev2);

        superSound.mostrarRevisiones("EMPO_PD_001");
        superSound.mostrarRevisiones("TRA_002");

        superSound.mostrarAltavoces();

        // ---------------------------------------------------------
        // -------------------- PRUEBAS BBDD ------------------------
        // ---------------------------------------------------------

        System.out.println("\n=== PRUEBA 1: insertaProductoBBDD ===");

        // Creamos una lista de altavoces que queremos insertar en la BBDD
        List<Altavoz> listaAltavoces = new ArrayList<>();
        listaAltavoces.add(new AltavozMovil("MOV_010", 12.0, 12.0));
        listaAltavoces.add(new AltavozTV("TV_010", 20.0, 20.0, Conector.IR));

        // Insertamos en la línea "LineaX"
        superSound.insertaProductoBBDD("LineaX", listaAltavoces);


        System.out.println("\n=== PRUEBA 2: actualizaPrecioProducto ===");
        // Subimos un 10% los productos de LineaX
        superSound.actualizaPrecioProducto("LineaX", 10.0);


        System.out.println("\n=== PRUEBA 3: consultaProductosLinea ===");
        superSound.consultaProductosLinea("LineaX");


        System.out.println("\n=== PRUEBA 4: eliminaProducto ===");
        // Eliminamos uno de los altavoces insertados
        superSound.eliminaProducto("MOV_010");

        System.out.println("\n=== CONSULTA FINAL TRAS ELIMINAR ===");
        superSound.consultaProductosLinea("LineaX");
        
      //  superSound.aFichero();
    }
}


