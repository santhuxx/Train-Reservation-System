package train;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {

    // Define the URL, username, and password for the database connection
    public static String url = "jdbc:mysql://localhost:3306/train";
    public static String user = "root";
    public static String password = "Santhu1234";
    public static Connection con;

    // Method to establish a database connection
    public static Connection getConnection() {
        try {
            // Load the MySQL database driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish a database connection using the provided parameters
            con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {
            // Handle exceptions if the database connection fails
            System.out.println("Database connection is not successful!!!");
        }
        
        return con;
    }
}
