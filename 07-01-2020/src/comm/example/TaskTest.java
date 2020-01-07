package comm.example;

import java.time.LocalDate;
import java.util.UUID;
import java.util.UUID;
public class TaskTest {
	public static void main(String[] args) {
		
		
		Task task1=new Task(UUID.randomUUID().toString(),"Learning Modules",LocalDate.now(),true);
		Task task2=new Task(UUID.randomUUID().toString(),"Learning Modules",LocalDate.now(),true);
		System.out.println("Task1 Details: \n"+task1+" Task2 Details: \n"+task2);
		System.out.println(task1==task2);
		System.out.println(task1.equals(task2));
	}

}
