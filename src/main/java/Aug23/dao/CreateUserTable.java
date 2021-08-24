package Aug23.dao;

import java.sql.Connection;
import java.sql.Statement;

public class CreateUserTable {
    private static final String CREATE_TABLE = "CREATE TABLE users " +
            "(  ID int not NULL,"
            + "Name varchar(255),"
            + "Age int,"
            +"PRIMARY KEY ( ID )) ";

    public static void main(String[] args) {
        System.out.println(CREATE_TABLE);
        // Step 1: Establishing a Connection
        try (Connection connection = ConnectionFactory.getPGConnection();
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(CREATE_TABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
