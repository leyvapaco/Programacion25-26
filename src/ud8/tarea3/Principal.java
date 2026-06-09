package ud8.t3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// INSTRUCCIONES
//Debes tener configurado en el proyecto daw1t de Eclipse el Driver JDBC para SQLite
//Deber arrastrar al proyecto daw1t el fichero con la base de datos sampledatabaseSqLite.db. La tienes disponible en moodle
//Abre una conexión con DBeaver contra el fichero sampledatabaseSqLite.db que estés utilizando en el proyecto de eclipse (consulta su ruta con el botón derecho)
//Importante: Si ejecutas este programa y va todo bien, la siguiente vez fallará ya que...
//...dará error por claves duplicadas. Entonces deberás borrar manualmente todos los registros previamente insertados, por ejemplo desde DBeaver
//Otra opción es usar claves diferentes en la inserción (por ejemplo oficina 21, etc)


public class main_transacciones {
    public static void main(String[] args) {
       Connection con=Conexion.conectar();

        try{
            con.setAutoCommit(false);

            OfficeModel.insertOffice(con,
                    new Office(
                            "20",
                            "Sevilla",
                            "+34 955 123 123",
                            "Avda Castilleja",
                            "default",
                            "",
                            "Spain",
                            "41940",
                            "EMEA"));

            System.out.println("Insertada oficina");

            EmployeeModel.insertEmployee(con,
                    new Employee(
                            9020,
                            "Yazmine",
                            "Lamal",
                            "8181",
                            "yl@classicmodelcars.com",
                            "9",
                            1102,
                            "Comercial"));
           
            System.out.println("Insertado empleado");


            EmployeeModel.insertEmployee(con,
                    new Employee(
                            9021,
                            "Morriña",
                            "José",
                            "8181",
                            "jm@classicmodelcars.com",
                            "1",
                            1102,
                            "Comercial"));

            System.out.println("Insertado empleado");
            
            ClienteModel.insertCliente(con,
                    new Cliente(
                            520,
                            "Alixar Store",
                            "apellido",
                            "nombre",
                            "609876543",
                            "Avda",
                            "Avda2",
                            "Tomares",
                            "Sevilla",
                            "41940",
                            "Spain",
                            null,
                            null));
            
            System.out.println("Insertado cliente");
            
            ClienteModel.updateSalesRepEmployeeNumber(con,
                    520,   // customerNumber. Cliente "Alixar Store" insertado previamente
                    9021   // salesRepEmployeeNumber. Empleado Yazmine Lamal
            );

            System.out.println("Relacionado el nuevo cliente con uno de los empleados");
            
            con.commit(); //Hacemos efectiva la transacción 1
            
            System.out.println("Hecho el commit para la primera transacción");
            
         // Insertar pedido nuevo
            PedidoModel.insertPedido(con,
                    new Pedido(
                            20001,               // orderNumber
                            "2026-05-21",        // orderDate
                            "2026-05-28",        // requiredDate
                            "In Process",        // status
                            9021                 // customerNumber
                    )
            );

            System.out.println("Insertada la cabecera de pedido");
         // Primera línea
            LineaPedidoModel.insertLineaPedido(con,
                    new LineaPedido(
                            20001,        // orderNumber
                            "S10_1949",   // productCode
                            10,           // quantityOrdered
                            95.70,        // priceEach (MSRP real)
                            1             // orderLineNumber
                    )
            );

            System.out.println("Insertada la primera línea de pedido");
            // Segunda línea
            LineaPedidoModel.insertLineaPedido(con,
                    new LineaPedido(
                            20001,
                            "S10_4757",
                            5,
                            92.19,
                            2
                    )
            );
            System.out.println("Insertada la segunda línea de pedido");


            con.commit(); //Hacemos efectiva la transacción 2
            System.out.println("Hecho el commit para la segunda transacción");

        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
