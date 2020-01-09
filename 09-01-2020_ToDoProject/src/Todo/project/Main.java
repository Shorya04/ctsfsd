package Todo.project;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	private static Scanner sc=new Scanner(System.in);
	
	private TodoService todoService=null;
	{
		todoService=new TodoServiveImpl();
	}

	public static void main(String[] args) {
		
		Main main=new Main();
		int choice=0;
		do {
			
			System.out.println("1.Create Todo List");
		    System.out.println("2.Display Todo List");
	        System.out.println("3.Find Todo Id");
	        System.out.println("4.To Remove Todo Id");
	        System.out.println("4.To Remove all");
	        System.out.println("0.To Exit");
	        System.out.println("<<Enter choice>>");
	        
	        try {
				choice=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
			}
			switch(choice) {
			case 1:
				System.out.println("Input task name: ");
				Todo todo=main.todoService.createTodo(sc.next());
				System.out.println("Todo List created successfully"+todo);
				break;
				
			case 2:
				List<Todo> list=main.todoService.getAllTodo();
				for(Todo t:list) {
					System.out.print(t+ "\n");
				}
				break;
			case 3:
				System.out.println("Input Todo Id to be searched in List: ");
				Todo todo1=main.todoService.findByTodo(sc.next());
				if (todo1!=null){
					System.out.println(todo1);
				}
				else {
					System.out.println("No such Todo Id available");
				}
				break;
			case 4:
				System.out.println("Input Todo Id to be Delete from List: ");
				main.todoService.todoRemove(sc.next());
				
			case 5:
				main.todoService.toRemoveAll();
				System.out.println("List deleted successfully!!");
			case 0:
				System.out.println("bye");
				System.exit(0);
				break;

			default:
				System.out.println("Enter valid choice");
				break;
			}
				
			}while(choice !=0);
		}
		
			
			}

