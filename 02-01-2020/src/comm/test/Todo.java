package comm.test;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Todo {
	private Task task;
	private String toDoId;
	private LocalDate date;
	private boolean isCompleted;
	private  RandomFortune rf;
	public Todo(Task task /*RandomFortuneSeervice fortuneSeervice*/) {

		this.task = task;
		//this.fortuneSeervice = fortuneSeervice;
	}
	
	public Todo createToDo(String createdBy, String taskName,boolean isCompleted) {
		Todo todo=new Todo();
		task=new Task();
		System.out.println("Creating a new task.");
		task=task.createTask(taskName,createdBy);
		System.out.println("Successfully created task.");
		todo.setToDoId(UUID.randomUUID().toString());
		todo.setDate(LocalDate.now());
		todo.setCompleted(isCompleted);
		//rf=new RandomFortune();
		//rf.selectRandom();
		todo.setTask(task);
		return todo;
		}
	
	public String getTodoDetails()	{
		return task.displayTask()+" todo id: "+getToDoId()+" Todo date: "+getDate()+" Completed: "+isCompleted;
	}

	
	}
	
	
	
	
	


