package ud8.sqLite;
import java.sql.*;

public class Principal {
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\leyva\\u8BD\\sampledatabaseSqLite.db");
            Statement statement= connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println("nombre: " + rs.getString("firstName"));
            }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            } finally{
                try {
                    if (connection!=null) {
                        connection.close();
                    }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
