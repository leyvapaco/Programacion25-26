package ud8.tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LineaPedidoModel {

    public static void insertLineaPedido(Connection con, LineaPedido lp) throws SQLException {

        String sql = "INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, lp.getOrderNumber());
        ps.setString(2, lp.getProductCode());
        ps.setInt(3, lp.getQuantityOrdered());
        ps.setDouble(4, lp.getPriceEach());
        ps.setInt(5, lp.getOrderLineNumber());

        ps.executeUpdate();
    }
}
