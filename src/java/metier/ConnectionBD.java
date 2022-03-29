package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
 private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
                        
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_tp_jee","root","");
                        System.out.println("ok connexion");
		} catch (ClassNotFoundException | SQLException e) {
                     System.out.println("error de connixion");
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	

    
    
    
}
