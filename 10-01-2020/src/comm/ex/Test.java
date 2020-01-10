package comm.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class Test {
	public static void main(String[] args) { //throws StudentExecption {
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(UUID.randomUUID().toString(), "Shorya", "Singh", 8.4));
		set.add(new Student(UUID.randomUUID().toString(), "Amardeep", "Kaur", 8.0));
		set.add(new Student(UUID.randomUUID().toString(), "Anshita", "Chandel", 8.8));
		Iterator<Student> i=set.iterator();
			while(i.hasNext()) {
				Student itr= i.next();
				System.out.println(itr+"\n");
			}
		
	}

}
