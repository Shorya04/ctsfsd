package HIBERNATE.myCompany.OnetoOneMapping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;



@Data
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int todoId;
	private String todoName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="taskId")
	private Task task;

	public Todo(String todoName) {
		super();
		this.todoName = todoName;
		
	}



}



