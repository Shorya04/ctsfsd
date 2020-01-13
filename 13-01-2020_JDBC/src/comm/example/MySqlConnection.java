package comm.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnection {
	private Connection connection;
	static MySqlConnection myConnection;
	
	public static Properties getConnectionProperties() throws IOException {
		InputStream in=new FileInputStream("mysql.Properties");
		Properties p=new Properties();
		p.load(in);
		return p;
	}
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
      
    public Connection getMyConnection() throws SQLException,IOException
    {
    	//DriverManager.registerDriver(driver);
    	Properties p=getConnectionProperties();
    	String url=p.getProperty("jdbc.connection.url");
		String user=p.getProperty("jdbc.connection.user");
		String password=p.getProperty("jdbc.connection.password");
    	connection=DriverManager.getConnection(url,user,password);
    	return connection;
    	
    }
}
