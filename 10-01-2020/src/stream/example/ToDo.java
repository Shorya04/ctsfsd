package stream.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ToDo implements Serializable {
	private String todoId;
	private String todoName;
	private LocalDate date;
	
	public ToDo(String todoName, LocalDate date) {
		super();
		this.todoId=UUID.randomUUID().toString();
		this.todoName = todoName;
		this.date = date;
	}
	
	

}
