package comm.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int counter=-1;
		
        Scanner sc=new Scanner(System.in);
        int choice=0;
	    final int MAX=10;
		Todo[] arr=new Todo[MAX];
		Todo todo=new Todo();
		Todo tempTodo=null;
		
		do {
			System.out.println("Enter Choice: ");
			System.out.println("1.Create Todo List");
			System.out.println("2.Display Todo List");
			System.out.println("0.Exit");
		    choice=sc.nextInt();
			
		switch(choice)
		{
		case 1:
			if(counter==MAX-1){
				System.out.println("TODO LIST EXCEEDS 10");
				break;
				}
			
			System.out.println("Creating Todo List.");
			System.out.println("TaskCreatedBy: ");
			String createdBy=sc.next();
			System.out.println("TaskName: ");
			String taskName=sc.next();
			System.out.print("Is Completed? ");
			boolean isCompleted=sc.nextBoolean();
			tempTodo=todo.createToDo(createdBy,taskName,isCompleted);
			arr[++counter]=tempTodo;
			break;
		
		case 2:
			System.out.println("Display Todo List.");
			for(int i=0;i<=counter;i++)
			{
				System.out.println("\n"+arr[i].getTodoDetails());
			}
			break;
			
		case 0:
			System.out.println("Exiting...");
			System.exit(3);
			break;
			
		default:
			System.out.println("Enter a Valid Choice.");
			break;}
		}
		while(choice!=0);

	}
	}
