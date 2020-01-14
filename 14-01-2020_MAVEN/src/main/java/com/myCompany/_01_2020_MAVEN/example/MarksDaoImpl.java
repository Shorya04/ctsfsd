package com.myCompany._01_2020_MAVEN.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MarksDaoImpl implements MarksDao{
	
	private MyConnection myCon;
	private Connection connection=null;
	private PreparedStatement ps;
	private Marks marks;{
		myCon=MyConnection.getMyConnectionObject();
		try {
			connection=myCon.getMyConnection();
		}
		catch(IOException | SQLException e){
			e.printStackTrace();
		}
	}
	@Override
	public Marks createStudentInfo(String student_name, double ds, double dbms) {
		marks=new Marks(student_name,ds,dbms);
		ps=connection.prepareStatement( insert into marks(student_name,ds,dbms);
		
		return createStudentInfo(student_name, ds, dbms);
	}
	

}
