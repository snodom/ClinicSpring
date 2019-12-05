package clinic.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    private static String URL = "jdbc:mysql://localhost:3306/clinicdb";
    private static String dbUserName = "root";
    private static String dbUserPassword = "password";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection=DriverManager.getConnection(URL, dbUserName, dbUserPassword);
            System.out.println("connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

