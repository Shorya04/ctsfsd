package HIBERNATE.myCompany.hibernateAnnotation.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Todo_Info")
public class ToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	
	@Column(name="UID")
	private String uid;
	
	@Column(name="Name")
	private String todoName;
	
	@Column(name="Created")
	private LocalDateTime creationDate;

	public ToDo(int todoId, String todoName) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
	}

	
	}

	
	

