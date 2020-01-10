package comm.ex;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor

@Getter
@Setter
@ToString

public class Student{
	
	private int rollNo=0;
	private String firstName;
	private String lastName;
	private double cgpa=0.0;
	

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object object)  {
		Student student=null;
		boolean isEqual=false;
		if(object instanceof Student) {
			student=(Student) object;
		}
			if((this.getFirstName().equals(student.getFirstName()))  && (this.getLastName().equals(student.getLastName()))){
				isEqual=true;
				 //throw new StudentException("Can't get Student");
			}
			return isEqual;
			}*/
	public Student(String firstName, String lastName, int rollNo, double cgpa) {
		if(firstName==null || lastName==null || rollNo==0 || cgpa==0.0) {
			throw new NullPointerException();
		}
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
	}
	public String firstName() {
		return firstName;
	}

	public String lastName() {
		return lastName;
	}

	public int studentID() {
		return rollNo;
	}

	public double cgpa() {
		return cgpa;
	}
			
	}

	
	
		
	


