package comm.ex;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student implements Comparable<Student>{
	
	private String rollNo;
	private String firstName;
	private String lastName;
	private double cgpa;
	@Override
	public int compareTo(Student student) {
	int result=0;
	if(this.getCgpa()>student.getCgpa()) {
		result=1;
	}
		if(this.getCgpa()==student.getCgpa()) {
			result=0;
		}
		if(this.getCgpa()<student.getCgpa()) {
			result=-1;
		}
		return result;
	}
	@Override
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
			if((this.getFirstName()==student.getFirstName()) && (this.getLastName()==student.getLastName())){
				isEqual=true;
				//throw new InvalidNameException("Can't get Student");
			}
			return isEqual;
			}
			
	}

	
	
		
	


