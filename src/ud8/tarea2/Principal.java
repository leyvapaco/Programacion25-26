package ud8.tarea2;

import java.sql.*;
import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try (Connection cn = Conexion.conectar()) {

            int op;
            do {
                System.out.println("\n1.Insertar cliente\n2.Asignar empleado\n3.Añadir producto a pedido\n4.Mostrar pedido\n5.Salir");
                System.out.print("Opción: ");
                op = Integer.parseInt(sc.nextLine());

                switch (op) {
                    case 1:
                        insertarCliente(cn);
                        break;

                    case 2:
                        asignarEmpleado(cn);
                        break;

                    case 3:
                        anadirProductoPedido(cn);
                        break;

                    case 4:
                        mostrarDetallePedido(cn);
                        break;

                    case 5:
                        System.out.println("Aplicación finalizada");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (op != 5);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ------------------ 1) Insertar cliente ------------------
    static void insertarCliente(Connection cn) {
        try {
            System.out.print("Nombre del cliente: ");
            String customerName = sc.nextLine();

            System.out.print("Apellido del contacto: ");
            String lastName = sc.nextLine();

            System.out.print("Nombre del contacto: ");
            String firstName = sc.nextLine();

            System.out.print("Teléfono: ");
            String phone = sc.nextLine();

            System.out.print("Dirección: ");
            String address = sc.nextLine();

            System.out.print("Ciudad: ");
            String city = sc.nextLine();

            System.out.print("País: ");
            String country = sc.nextLine();

            PreparedStatement ps = cn.prepareStatement(
                "INSERT INTO customers " +
                "(customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setString(1, customerName);
            ps.setString(2, lastName);
            ps.setString(3, firstName);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.setString(6, city);
            ps.setString(7, country);

            ps.executeUpdate();
            System.out.println("Cliente insertado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // ------------------ 2) Asignar empleado ------------------
    static void asignarEmpleado(Connection cn) {
        try {
            System.out.print("ID cliente: ");
            int cli = Integer.parseInt(sc.nextLine());

            System.out.print("ID empleado: ");
            int emp = Integer.parseInt(sc.nextLine());

            boolean existe = true;

            // Comprobar cliente
            PreparedStatement psCli = cn.prepareStatement(
                "SELECT customerNumber FROM customers WHERE customerNumber=?");
            psCli.setInt(1, cli);
            ResultSet rsCli = psCli.executeQuery();
            if (!rsCli.next()) {
                System.out.println("Cliente no existe");
                existe = false;
            }

            // Comprobar empleado
            if (existe) {
                PreparedStatement psEmp = cn.prepareStatement(
                    "SELECT employeeNumber FROM employees WHERE employeeNumber=?");
                psEmp.setInt(1, emp);
                ResultSet rsEmp = psEmp.executeQuery();
                if (!rsEmp.next()) {
                    System.out.println("Empleado no existe");
                    existe = false;
                }
            }

            // Actualizar
            if (existe) {
                PreparedStatement ps = cn.prepareStatement(
                    "UPDATE customers SET salesRepEmployeeNumber=? WHERE customerNumber=?");
                ps.setInt(1, emp);
                ps.setInt(2, cli);
                ps.executeUpdate();

                System.out.println("Empleado asignado.");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // ------------------ 3) Añadir producto a pedido ------------------
    static void anadirProductoPedido(Connection cn) {
        boolean existe = true;

        try {
            System.out.print("Pedido: ");
            int ped = Integer.parseInt(sc.nextLine());

            System.out.print("Producto: ");
            String prod = sc.nextLine();

            System.out.print("Cantidad: ");
            int cant = Integer.parseInt(sc.nextLine());

            double precio = 0;
            int lineNumber = 1; // por defecto si no hay líneas

            // ----------- Comprobar pedido -----------
            PreparedStatement psPed = cn.prepareStatement(
                "SELECT orderNumber FROM orders WHERE orderNumber=?");
            psPed.setInt(1, ped);
            ResultSet rsPed = psPed.executeQuery();

            if (!rsPed.next()) {
                System.out.println("Pedido no existe");
                existe = false;
            }

            // ----------- Obtener precio producto -----------
            if (existe) {
                PreparedStatement psProd = cn.prepareStatement(
                    "SELECT MSRP FROM products WHERE productCode=?");
                psProd.setString(1, prod);
                ResultSet rsProd = psProd.executeQuery();

                if (!rsProd.next()) {
                    System.out.println("Producto no existe");
                    existe = false;
                } else {
                    precio = rsProd.getDouble("MSRP");
                }
            }

            // ----------- Calcular siguiente línea, en la que insertar el nuevo producto  -----------
            if (existe) {
                PreparedStatement psLine = cn.prepareStatement(
                    "SELECT MAX(orderLineNumber) + 1 FROM orderdetails WHERE orderNumber=?");
                psLine.setInt(1, ped);
                ResultSet rsLine = psLine.executeQuery();

                if (rsLine.next()) {
                	int valor = rsLine.getInt(1);
                	if (valor != 0) {
                	    lineNumber = valor;
                	}

                }
            }

            // ----------- Insertar línea -----------
            if (existe) {
                PreparedStatement psInsert = cn.prepareStatement(
                    "INSERT INTO orderdetails (orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber) " +
                    "VALUES (?, ?, ?, ?, ?)");
                psInsert.setInt(1, ped);
                psInsert.setString(2, prod);
                psInsert.setInt(3, cant);
                psInsert.setDouble(4, precio);
                psInsert.setInt(5, lineNumber);

                psInsert.executeUpdate();
                System.out.println("Producto añadido al pedido.");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // ------------------ 4) Mostrar detalle pedido ------------------
    static void mostrarDetallePedido(Connection cn) {
        boolean existe = true;

        try {
            System.out.print("Pedido: ");
            int ped = Integer.parseInt(sc.nextLine());

            PreparedStatement ps = cn.prepareStatement(
                "SELECT orderDate, status FROM orders WHERE orderNumber=?");
            ps.setInt(1, ped);
            ResultSet rs = ps.executeQuery();

            String fecha = null;
            String estado = null;

            if (!rs.next()) {
                System.out.println("Pedido no existe");
                existe = false;
            } else {
                fecha = rs.getString("orderDate");
                estado = rs.getString("status");
            }

            if (existe) {
                System.out.println("Fecha: " + fecha + " | Estado: " + estado);
            }

            if (existe) {
                PreparedStatement ps2 = cn.prepareStatement(
                    "SELECT p.productName, od.quantityOrdered, od.priceEach " +
                    "FROM orderdetails od, products p " +
                    "WHERE od.productCode = p.productCode " +
                    "AND od.orderNumber = ?"
                );
                ps2.setInt(1, ped);
                ResultSet rs2 = ps2.executeQuery();

                double total = 0;

                while (rs2.next()) {
                    String nom = rs2.getString("productName");
                    int q = rs2.getInt("quantityOrdered");
                    double pr = rs2.getDouble("priceEach");
                    double sub = q * pr;
                    total += sub;

                    System.out.println(nom + " | Cant: " + q + " | Precio: " + pr + " | Sub: " + sub);
                }

                System.out.println("TOTAL: " + total);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}


