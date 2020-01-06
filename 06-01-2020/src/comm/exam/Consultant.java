package comm.exam;

import java.time.LocalDate;

public class Consultant extends Employee {

	private double consultationFees;

	public Consultant() {
		super();
	}

	public Consultant(String employeeId, String employeeName,LocalDate dateOfJoining,double consultationFees) {
		super(employeeId,employeeName,dateOfJoining);
		this.consultationFees= consultationFees;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+"ConsultationFees: "+consultationFees;
				
	}
	
	
}
