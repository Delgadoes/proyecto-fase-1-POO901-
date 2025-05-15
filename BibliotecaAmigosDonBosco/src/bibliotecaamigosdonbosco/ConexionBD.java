
package bibliotecaamigosdonbosco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca11";
    private static final String USER = "root"; // Cambia "root" a tu usuario de MySQL
    private static final String PASSWORD = "hola123"; // Cambia "" a tu contraseña de MySQL

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
}
