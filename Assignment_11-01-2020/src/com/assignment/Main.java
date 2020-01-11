package com.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Employees: ");
		int n=Integer.parseInt(br.readLine());
		List<Employee>employeelist=new ArrayList<Employee>();
		for(int i=0;i<n;i++) {
		    System.out.println("Enter Employee details: "+(i+1));
		    String name=br.readLine();
		    String department=br.readLine();
		    Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			int age=Integer.parseInt(br.readLine());
			
	}


