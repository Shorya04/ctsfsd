package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	private Connection connection;
	static MySqlConnection myConnection;
	
	public MySqlConnection() {
	
	}
	
    public static MySqlConnection getMyConnectionOject()
    {
    	if(myConnection==null) {
    		return new MySqlConnection();
    	}
    	else {
   		    return myConnection;
    	}
    }
      
    public Connection getMyConnection() throws SQLException
    {
    	//DriverManager.registerDriver(driver);
    	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","welcome");
    	return connection;
    	
    }
}
