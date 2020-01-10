package comm.ex;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestComp {
	public static void main(String[] args) {
		
		Comparator c =new GPAcomp();
		c=new NameComp();
		Set<Student> studentSet= new TreeSet<Student>(c);
		studentSet.add(new Student("Shorya", "Singh", 101, 4.0));
		studentSet.add(new Student("Anshita", "Chandel", 102, 2.8));
		studentSet.add(new Student("Amardeep", "Kaur", 103, 3.6));
		studentSet.add(new Student("Shailja", "Singh", 104, 2.3));
		
		Object[] studentArray=studentSet.toArray();
		Student s;
		for(Object obj: studentArray) {
			s=(Student) obj;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.getFirstName(), s.getLastName(), s.getRollNo(),
					s.getCgpa());
		}
		
	}

}
