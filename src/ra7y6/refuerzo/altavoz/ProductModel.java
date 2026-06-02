package ra7y6.refuerzo.altavoz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private Connection con;

    public ProductModel(Connection conn) throws SQLException {
        this.con = conn;
        // Dejamos el autocommit desactivado 
        this.con.setAutoCommit(false);
    }

    // ---------------------------------------------------------
    // INSERTA VARIOS ALTAVOCES COMO PRODUCTOS (SIN BATCH)
    // ---------------------------------------------------------
    public void insertarProductos(String linea, List<Altavoz> lista) throws SQLException {

        String sql = "INSERT INTO products "
                + "(productCode, productName, productLine, productScale, productVendor, "
                + "productDescription, quantityInStock, buyPrice, MSRP) "
                + "VALUES (?, ?, ?, '1:1', 'SuperSound', ?, 10, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        try {
            for (Altavoz a : lista) {

                ps.setString(1, a.getNumSerie());                     // productCode
                ps.setString(2, "Altavoz " + a.getNumSerie());        // productName
                ps.setString(3, linea);                               // productLine
                ps.setString(4, "Altavoz artesanal");                 // productDescription
                ps.setDouble(5, 100.0);                               // buyPrice ficticio
                ps.setDouble(6, 150.0);                               // MSRP ficticio

                ps.executeUpdate();
            }

            con.commit();

        } catch (SQLException e) {
            con.rollback();
            throw e;
        }
    }

    // ---------------------------------------------------------
    // ACTUALIZA PRECIOS DE UNA LÍNEA (SIN BATCH)
    // ---------------------------------------------------------
    public void actualizarPrecios(String linea, double porcentaje) throws SQLException {

        String sql = "UPDATE products SET buyPrice = buyPrice * ?, MSRP = MSRP * ? "
                   + "WHERE productLine = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            double factor = 1 + (porcentaje / 100.0);

            ps.setDouble(1, factor);
            ps.setDouble(2, factor);
            ps.setString(3, linea);

            ps.executeUpdate();
            con.commit();

        } catch (SQLException e) {
            con.rollback();
            throw e;
        }
    }

    // ---------------------------------------------------------
    // CONSULTA PRODUCTOS DE UNA LÍNEA
    // (NO ES TRANSACCIÓN, SOLO LECTURA)
    // ---------------------------------------------------------
    public List<String> consultarLinea(String linea) throws SQLException {

        String sql = "SELECT productCode, productName, buyPrice, MSRP "
                   + "FROM products WHERE productLine = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, linea);

        ResultSet rs = ps.executeQuery();

        List<String> lista = new ArrayList<>();

        while (rs.next()) {
            lista.add(
                rs.getString("productCode") + " - " +
                rs.getString("productName") + " - " +
                rs.getDouble("buyPrice") + "€ / " +
                rs.getDouble("MSRP") + "€"
            );
        }

        return lista;
    }

    // ---------------------------------------------------------
    // ELIMINA UN PRODUCTO POR CÓDIGO
    // ---------------------------------------------------------
    public void eliminarProducto(String codigo) throws SQLException {

        String sql = "DELETE FROM products WHERE productCode = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);

            ps.executeUpdate();
            con.commit();

        } catch (SQLException e) {
            con.rollback();
            throw e;
        }
    }
}

