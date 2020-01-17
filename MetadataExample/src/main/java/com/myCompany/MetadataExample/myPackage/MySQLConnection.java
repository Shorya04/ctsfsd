package com.myCompany.MetadataExample.myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

 public class MySQLConnection {
	
	public static void main(String[] args) throws SQLException, FileNotFoundException,IOException {
		InputStream in=new FileInputStream("sql.properties");
		Properties p=new Properties();
		p.setProperty("jdbc.url","jdbc:mysql://localhost:3306/db1");
		p.setProperty("jdbc.user", "root");
		p.setProperty("jbdc.password","welcome");
		
	//	p.load(in);
		Connection connection=DriverManager.getConnection(p.getProperty("jdbc.connection.url"),p.getProperty("jdbc.connection.user"),p.getProperty("jdbc.connection.password"));
		DatabaseMetaData mData=connection.getMetaData();
		ResultSet rs=mData.getTables(null, null, "Customer1", null);
		if(rs.next())
		{
			System.out.println("table exists");
		}
		else
		{
			System.out.println("not exists");
		}
		StringBuffer buffer=new StringBuffer();
		buffer.append(mData.getDatabaseProductName());
		buffer.append(mData.getDatabaseProductVersion());
		buffer.append(mData.getDriverName());
		buffer.append(mData.getURL());
		buffer.append(mData.getUserName());
		System.out.println(buffer.toString());
		Statement statement=connection.createStatement();
		rs=statement.executeQuery("select * from customer");
		ResultSetMetaData rmData=rs.getMetaData();
		System.out.println(rmData.getCatalogName(1));
		System.out.println(rmData.getColumnCount());
	}
}
		



