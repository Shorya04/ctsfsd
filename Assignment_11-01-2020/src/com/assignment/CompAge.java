package com.assignment;

import java.util.Comparator;

public class CompAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge()>o2.getAge()) {
			return -1;
		}
		else if(o2.getAge()==o2.getAge()) {
			return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
		}
		else {
		return 1;
	}
	}
	


}