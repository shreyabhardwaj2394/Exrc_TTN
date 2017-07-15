import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Shreya on 6/30/2017.
 */
public class Connector {
    public Connection con;

    Connector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost/servlet_test", "root", "root");
    }
}
