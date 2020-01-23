package HIBERNATE.myCompany.HibernateInheritence.Entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
@Entity
@DiscriminatorValue("Contractual")
public class ContractualEmployee extends Employee {
	
	double hourlyPay;
	public ContractualEmployee() {
	}


	public ContractualEmployee(String name, LocalDate doj,double salary,double hourlyPay) {
		super(name, doj,salary);
		hourlyPay=hourlyPay;
	}


		


	}



	

	
	
	
	

