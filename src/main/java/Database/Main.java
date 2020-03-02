package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String name,pass,url,db;

        Connection conn = null;

        try {
            db = "db_name";
            url="jdbc:mysql://localhost:3306/" + db;
            name="root";
            pass="";

            conn = DriverManager.getConnection(url,name,pass);
            System.out.println("Connection created");
            conn.close();
            System.out.println("Connection closed");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}

