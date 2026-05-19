package ud8.t2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
//Importante: Debes tener incorporado al proyecto la base de datos classicmodels para SQLite (sampledatabaseSqLite.db), disponible en moodle

	private static final String CONTROLADOR = "org.sqlite.JDBC";
	private static final String URL = "jdbc:sqlite:sampledatabaseSqLite.db";
//	private static final String USUARIO = "sqladmint";  //No es necesario en nuestro SQLite
//	private static final String CLAVE = "Root-2025"; //No es necesario en nuestro SQLite
	
	
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public static Connection conectar() {
		Connection conexion = null;

		try {
	        conexion = DriverManager.getConnection( "jdbc:sqlite:sampledatabaseSqLite.db");
			System.out.println("Conexión con SQLite OK");

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return conexion;
	}
}