package com.assignment;
import java.util.List;

	public class Employee1 {
		public static void printEmp(List<Employee>list)
		{
			System.out.format("%-15s %-30s %-30s %-20s %-10s %-10s\n","Employee ID","Name","Department","Date Of Joining","Age","Salary");
			for(Employee e:list)
				System.out.println(e);
		}

	}

