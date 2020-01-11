package com.assignment;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
    static int count;
	private int Id;
	private String employeeName;
	private String department;
	private DateFormat dateOfJoining;
	private int age;
	private int salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int employeedId, String employeeName, String department, DateFormat dateOfJoining, int age, int salary) {
		super();
		Id=++count;
		this.employeeName = employeeName;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public DateFormat getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(DateFormat dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + Id;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Id != other.Id)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeedId=" + Id + ", employeeName=" + employeeName + ", department=" + department
				+ ", dateOfJoining=" + dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(salary==e.salary) {
			return 0;
		}
		else if(salary>e.salary) {
			return 1;
		}
		else
		{
			return 0;
		}
	
	
	}

	
}
