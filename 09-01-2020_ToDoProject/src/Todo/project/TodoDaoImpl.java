package Todo.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;



public class TodoDaoImpl implements TodoDao{
	
	private List<Todo> todoList=null;
	private Todo todo;
	{
     todoList=new ArrayList<Todo>();
	}

	@Override
	public Todo createTodo(String todoName) {
		String str[]=UUID.randomUUID().toString().split("-");
		todo= new Todo((str[0]+str[1]).toLowerCase(),todoName);
		todoList.add(todo);
		return todo;
	}

	@Override
	public List<Todo> getAllTodo() {
		if(todoList.isEmpty())
		{
			System.out.println("list is empty");
		}
		return todoList;
	}

	@Override
	public Todo findByTodo(String todoId) {
    Iterator<Todo> iterator=todoList.iterator();
		
		while(iterator.hasNext())
		{
			todo=iterator.next();
			
		          if(todo.getTodoId()==todoId) {
			System.out.println(todo.getTodoId());
			break;
		          }
			}
		
	return todo;
	}


	@Override
	public void todoRemove(String todoId) {
		if(todoList.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}
		todo=findByTodo(todoId);
		if(todo==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			todoList.remove(todo);
			System.out.println("remoded sucessfully with id: "+todoId);
		}
		
		
	}

	@Override
	public void toRemoveAll() {
		todoList.removeAll(todoList);
		
	}


	
	}
	

