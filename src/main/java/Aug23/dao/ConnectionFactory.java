package Aug23.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String JDBC_DRIVER = "org.postgresql.Driver";
    private static String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
    private static String jdbcUsername = "postgres";
    private static String jdbcPassword = "123456";

    public static Connection getPGConnection(){
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
