package com.myCompany.setter_injection;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class App 
{
    public static void main( String[] args )throws IOException,FileNotFoundException
    {
    	try {
    		 ApplicationContext con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	        Employee employee=con.getBean("employee",Employee.class);
    	        System.out.println(employee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
}
