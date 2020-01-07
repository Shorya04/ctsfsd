package comm.example;

import java.time.LocalDate;

public class Task {

	private String taskId;
	private String taskName;
	private LocalDate date;
	private boolean isCompleted;
	public Task() {
		super();
	}
	public Task(String taskId, String taskName, LocalDate date, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.date = date;
		this.isCompleted = isCompleted;
	}
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", date=" + date + ", isCompleted=" + isCompleted
				+ "]";
	}
	@Override
	public boolean equals(Object object) {
		Task task=null;
		boolean isEqual=false;
		
		if(object instanceof Task) {
			task=(Task) object;
		}
		if((this.getTaskName()==task.getTaskName()) && (this.getDate().isEqual(task.getDate()))  && (this.isCompleted()==task.isCompleted()))
		{
		isEqual=true;
		}
	return isEqual;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

	
	
	
	
}
