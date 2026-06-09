package ra9.recuperacion.junio1;
import java.sql.*;


public class Principal {

    public static void main(String[] args) {


        Connection con = Conexion.conectar();

        // Comprobamos la conexión ANTES del try/catch
        if (con == null) {
            System.out.println("No se pudo establecer conexión con la BD.");
            return;
        }
        try {

            con.setAutoCommit(false);
            PagoModel modelo = new PagoModel(con);

            int cli = 103;
            String c1 = "A001";
            String c2 = "A002";

            // ------------------ TRANSACCIÓN 1 ------------------
            try {
                System.out.println("T1: Insertando pagos...");
                modelo.crearPago(cli, c1, 100.0, "2024-01-10");
                modelo.crearPago(cli, c2, 200.0, "2024-01-10");
                con.commit();
                System.out.println("T1 OK\n");
            } catch (Exception e) {
                con.rollback();
                System.out.println("T1 ERROR\n");
            }

            // ------------------ TRANSACCIÓN 2 ------------------
            try {
                System.out.println("T2: Actualizando importes con IVA...");

                double imp1 = modelo.consultarImporte(cli, c1);
                double imp2 = modelo.consultarImporte(cli, c2);

                double nuevo1 = imp1 * 1.21;
                double nuevo2 = imp2 * 1.21;

                modelo.actualizarImporte(cli, c1, nuevo1);
                modelo.actualizarImporte(cli, c2, nuevo2);

                System.out.println("Pago " + c1 + ": " + imp1 + " : " + nuevo1);
                System.out.println("Pago " + c2 + ": " + imp2 + " : " + nuevo2);

                con.commit();
                System.out.println("T2 OK\n");
            } catch (Exception e) {
                con.rollback();
                System.out.println("T2 ERROR\n");
            }

            // ------------------ TRANSACCIÓN 3 ------------------
            try {
                System.out.println("T3: Eliminando pagos...");

                int r1 = modelo.borrarPago(cli, c1);
                int r2 = modelo.borrarPago(cli, c2);

                System.out.println("Eliminados: " + (r1 + r2));

                con.commit();
                System.out.println("T3 OK\n");
            } catch (Exception e) {
                con.rollback();
                System.out.println("T3 ERROR\n");
            }

        } catch (SQLException e) {
            System.out.println("Error de conexión");
        }
    }
}
