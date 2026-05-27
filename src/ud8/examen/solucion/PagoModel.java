package ud8.examen.solucion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagoModel {

    // ------------------ INSERTAR PAGO ------------------
    public static void insertPago(Connection con, Pago p) throws SQLException {

        String sql = "INSERT INTO payments (customerNumber, checkNumber, paymentDate, amount) "
                   + "VALUES (?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, p.getCustomerNumber());
        ps.setString(2, p.getCheckNumber());
        ps.setString(3, p.getPaymentDate());
        ps.setDouble(4, p.getAmount());

        ps.executeUpdate();
    }

    // ------------------ CONSULTAR IMPORTE ------------------
    public static double getImporte(Connection con, int customerNumber, String checkNumber)
            throws SQLException {

        String sql = "SELECT amount FROM payments "
                   + "WHERE customerNumber=? AND checkNumber=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, customerNumber);
        ps.setString(2, checkNumber);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getDouble("amount");
        } else {
            throw new SQLException("No existe ese pago para ese cliente.");
        }
    }


    // ------------------ ACTUALIZAR IMPORTE ------------------
    public static void updateImporte(Connection con, int customerNumber, String checkNumber, double nuevoImporte)
            throws SQLException {

        String sql = "UPDATE payments SET amount=? "
                   + "WHERE customerNumber=? AND checkNumber=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, nuevoImporte);
        ps.setInt(2, customerNumber);
        ps.setString(3, checkNumber);

        ps.executeUpdate();
    }

    // ------------------ ELIMINAR PAGO ------------------
    public static void deletePago(Connection con, int customerNumber, String checkNumber)
            throws SQLException {

        String sql = "DELETE FROM payments "
                   + "WHERE customerNumber=? AND checkNumber=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, customerNumber);
        ps.setString(2, checkNumber);

        ps.executeUpdate();
    }
}

