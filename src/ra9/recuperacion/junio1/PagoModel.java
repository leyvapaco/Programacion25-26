package ra9.recuperacion.junio1;
import java.sql.*;

public class PagoModel {

    private Connection conn;

    public PagoModel(Connection conn) {
        this.conn = conn;
    }

    public void crearPago(int customerNumber, String checkNumber, double amount, String paymentDate)
            throws SQLException {

        String sql = "INSERT INTO payments (customerNumber, checkNumber, amount, paymentDate) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, customerNumber);
            ps.setString(2, checkNumber);
            ps.setDouble(3, amount);
            ps.setString(4, paymentDate);
            ps.executeUpdate();
        }
    }

    public double consultarImporte(int customerNumber, String checkNumber) throws SQLException {
        double importe = 0.0;

        String sql = "SELECT amount FROM payments WHERE customerNumber=? AND checkNumber=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, customerNumber);
            ps.setString(2, checkNumber);

            ResultSet rs = ps.executeQuery();   // sin segundo try
            if (rs.next()) {
                importe = rs.getDouble("amount");
            }
            rs.close();
        }

        return importe;
    }

    public boolean actualizarImporte(int customerNumber, String checkNumber, double nuevoImporte)
            throws SQLException {

        boolean resultado = false;
        double actual = consultarImporte(customerNumber, checkNumber);

        if (actual != 0.0 && nuevoImporte > actual) {
            String sql = "UPDATE payments SET amount=? WHERE customerNumber=? AND checkNumber=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setDouble(1, nuevoImporte);
                ps.setInt(2, customerNumber);
                ps.setString(3, checkNumber);
                resultado = (ps.executeUpdate() == 1);
            }
        }

        return resultado;
    }

    public int borrarPago(int customerNumber, String checkNumber) throws SQLException {
        int filas = 0;

        String sql = "DELETE FROM payments WHERE customerNumber=? AND checkNumber=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, customerNumber);
            ps.setString(2, checkNumber);
            filas = ps.executeUpdate();
        }

        return filas;
    }
}

