package com.myCompany.Nw_JDBC.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2Connection {

	private Connection connection;
	static H2Connection myH2;
	
    private H2Connection(){
		
	}
    

	public static H2Connection getMyH2ConnectionObject() {
		if(myH2==null) {
			myH2=new H2Connection();
		}
		
			return myH2;
		
	}
	
	public Connection getConnection() throws IOException, SQLException{
		InputStream in=new FileInputStream("mysql.properties");
		Properties p=new Properties();
		p.load(in);
		//System.out.println(p.getProperty("connection.url"));
		connection=DriverManager.getConnection(p.getProperty("connection.url"),p.getProperty("connection.user"),p.getProperty("connection.password"));
		return connection;
		
		
		
		
			
			}
		}

