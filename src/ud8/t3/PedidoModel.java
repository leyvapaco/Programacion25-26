package ud8.t3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoModel {

    public static void insertPedido(Connection con, Pedido pedido) throws SQLException {

        String sql = "INSERT INTO orders "
                   + "(orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber) "
                   + "VALUES (?, ?, ?, NULL, ?, NULL, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, pedido.getOrderNumber());
        ps.setString(2, pedido.getOrderDate());       // formato YYYY-MM-DD
        ps.setString(3, pedido.getRequiredDate());    // formato YYYY-MM-DD
        ps.setString(4, pedido.getStatus());          // p.e. "In Process"
        ps.setInt(5, pedido.getCustomerNumber());

        ps.executeUpdate();
    }
}
