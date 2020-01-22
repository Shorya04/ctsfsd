package HIBERNATE.myCompany.OnetoOneMapping.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int taskId;
	private String taskName;
	@Column(name="Completed_on")
	private LocalDate date;
	public Task(String taskName) {
		super();
		this.taskName = taskName;
		date=LocalDate.now();
	}
	
	}
	
	
	

