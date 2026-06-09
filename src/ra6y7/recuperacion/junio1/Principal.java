package ra6y7.recuperacion.junio1;

public class Principal {

    public static void main(String[] args) {
        probarParteA();
       // probarParteB();
    }

    // =======================   PARTE A   =========================

    public static void probarParteA() {

        System.out.println("=== PRUEBA PARTE A ===");

        Equipaje cabina = new MaletaCabina("CAB01", 55, 40, 20, 10.0, true);
        Equipaje neceser = new Neceser("NEC01", 25, 15, 10, true);
        Equipaje rigida = new MaletaRigida("RIG01", 70, 45, 30, Material.ABS);
        Equipaje blanda = new MaletaBlanda("BLA01", 65, 40, 28, 3, true);

        System.out.println(cabina.etiquetaEnvio());
        System.out.println(neceser.etiquetaEnvio());
        System.out.println(rigida.etiquetaEnvio());
        System.out.println(blanda.etiquetaEnvio());

        System.out.println("Volumen CAB01: " + cabina.calcularVolumen());
        System.out.println("Volumen RIG01: " + rigida.calcularVolumen());

        System.out.println("Total equipajes creados: " + Equipaje.getTotalEquipajes());
    }


    // =======================   PARTE B   =========================

    public static void probarParteB() {

        System.out.println("\n=== PRUEBA PARTE B ===");

        Empresa emp = new Empresa();

        // Crear equipajes
        Equipaje cabina = new MaletaCabina("CAB01", 55, 40, 20, 10.0, true);
        Equipaje neceser = new Neceser("NEC01", 25, 15, 10, true);
        Equipaje rigida = new MaletaRigida("RIG01", 70, 45, 30, Material.ABS);
        Equipaje blanda = new MaletaBlanda("BLA01", 65, 40, 28, 3, true);

        // Añadir vendidos
        emp.addVendido(cabina);
        emp.addVendido(rigida);
        emp.addVendido(blanda);
        emp.addVendido(cabina); // repetido permitido
        emp.addVendido(neceser);

        System.out.println("\n=== VENDIDOS ORDENADOS POR ALTURA (DESC) ===");
        emp.mostrarVendidos();

        // Accesorios
        Accesorio a1 = new Accesorio("Candado", 8.5, TipoAccesorio.CANDADO);
        Accesorio a2 = new Accesorio("Funda protectora", 12.0, TipoAccesorio.FUNDA);
        Accesorio a3 = new Accesorio("Protector esquinas", 6.0, TipoAccesorio.PROTECTOR);

        emp.addAccesorio("CAB01", a1);
        emp.addAccesorio("CAB01", a2);
        emp.addAccesorio("RIG01", a3);

        // Accesorios añadidos a NEC01
        Accesorio a4 = new Accesorio("Etiqueta identificativa", 4.0, TipoAccesorio.ETIQUETA);
        Accesorio a5 = new Accesorio("Correa adicional", 7.5, TipoAccesorio.CORREA);

        emp.addAccesorio("NEC01", a4);
        emp.addAccesorio("NEC01", a5);

        System.out.println("\n=== ACCESORIOS DE CAB01 ORDENADOS POR PRECIO ===");
        emp.mostrarAccesorios("CAB01");

        System.out.println("\n=== ACCESORIOS DE NEC01 ORDENADOS POR PRECIO ===");
        emp.mostrarAccesorios("NEC01");

        // ===== NUEVO: volúmenes vendidos usando array =====

        System.out.println("\n=== VOLÚMENES DE EQUIPAJES VENDIDOS ===");
        double[] vols = emp.volumenesVendidos();
        for (int i = 0; i < vols.length; i++) {
            System.out.println("Volumen " + i + ": " + vols[i]);
        }
    }
}



