package com.myCompany._01_2020_MAVEN.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	
	public Connection connection;
	public static MyConnection myCon;
	private MyConnection() {
		super();
	}
	
	public static MyConnection getMyConnectionObject() {
		if(myCon==null) {
			myCon=new MyConnection();
		}
		
			return myCon;
		}	
	 
	public Connection getMyConnection() throws IOException,SQLException {
		InputStream in=new FileInputStream("H2.Properties");
		Properties p=new Properties();
		p.load(in);
		connection=DriverManager.getConnection(p.getProperty("connection.url"),p.getProperty("connection.user"),p.getProperty("connection.password"));
		return connection;
	}	
		
	}
 


