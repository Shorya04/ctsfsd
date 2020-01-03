package comm.test;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {
	private String taskId;
	private String taskName;
	private String createdBy;
	
	
	public Task createTask(String taskName,String createdBy) {
		Task task=new Task();
		task.setTaskName(taskName);
		task.setCreatedBy(createdBy);
		task.setTaskId(UUID.randomUUID().toString());
		return task;
	}
		
	public String displayTask() {
		return "TaskId: "+getTaskId()+" TaskName: "+getTaskName()+" Created By: "+getCreatedBy();
		
	}
}


