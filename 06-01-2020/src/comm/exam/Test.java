package comm.exam;
import java.util.UUID;
import java.time.LocalDate;
public class Test {
	public static void main(String[] args) {
	
	Employee employee=null;
	employee=new PermanentEmployee(UUID.randomUUID().toString(),"Marry",LocalDate.now(),21000);
    System.out.println(employee.getDetails());
	
	employee=new TempEmployee(30);
	System.out.println(employee.getDetails());
	
	employee=new Consultant(UUID.randomUUID().toString(),"Joseph",LocalDate.now(), 15000);
	System.out.println(employee.getDetails());
}
}