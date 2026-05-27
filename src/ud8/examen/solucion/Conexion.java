package ud8.examen.solucion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
//Importante: Debes tener incorporado al proyecto la base de datos classicmodels para SQLite (sampledatabaseSqLite.db), disponible en moodle

	private static final String CONTROLADOR = "org.sqlite.JDBC";
	
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