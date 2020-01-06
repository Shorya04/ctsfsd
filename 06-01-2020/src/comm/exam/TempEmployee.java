package comm.exam;

import java.time.LocalDate;
import java.util.UUID;

public class TempEmployee extends Employee {
	private double hourlyRate;

	
	
	public TempEmployee() {
		super();
	}

	public TempEmployee(double hourlyDate) {
		super(UUID.randomUUID().toString(),"John",LocalDate.now());
		this.hourlyRate=hourlyRate;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()+" Hourly Rate: "+hourlyRate;
	}

}
