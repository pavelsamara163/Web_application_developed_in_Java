package Databases;






import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Павел on 18.10.2016.
 */
public class DBproccessor {
    private Connection connection;

     public Connection getConnection(String url, String username, String password) throws SQLException {

        if(connection != null)
            return connection;
            connection = DriverManager.getConnection(url, username, password);
                return connection;
    }

}
