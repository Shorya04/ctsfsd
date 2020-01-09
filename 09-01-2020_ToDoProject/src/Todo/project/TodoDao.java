package Todo.project;

import java.util.List;

public interface TodoDao {
	
	public Todo createTodo(String todoName);
	public List<Todo> getAllTodo();
	public Todo findByTodo(String todoId);
	public void todoRemove(String todoId);
	public void toRemoveAll();
	

}
