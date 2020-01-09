package Todo.project;

import java.util.List;

public class TodoServiveImpl implements TodoService {

	private TodoDao dao=null;
	{
		dao=new TodoDaoImpl();
	}
	@Override
	public Todo createTodo(String todoName) {
		
		return dao.createTodo(todoName);
	}

	@Override
	public List<Todo> getAllTodo() {
		
		return dao.getAllTodo();
	}

	@Override
	public Todo findByTodo(String todoId) {
		// TODO Auto-generated method stub
		return dao.findByTodo(todoId);
	}

	@Override
	public void todoRemove(String todoId) {
		dao.todoRemove(todoId);
	}

	@Override
	public void toRemoveAll() {
		dao.toRemoveAll();
		
	}

}
