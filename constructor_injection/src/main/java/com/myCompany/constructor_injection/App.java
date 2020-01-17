package com.myCompany.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Employee;

public class App 
{
    public static void main( String[] args )
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
