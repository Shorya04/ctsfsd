package Todo.project;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting {
	private LinkedList<String> list=null;
	{list =new LinkedList<String>();}
		
	public void getSortedList(){
			
	list.add("Tansihka");
    list.add("Shorya");
    list.add("Rahul");
    list.add("Saurav");
    
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    
		}
	public static void main(String[] args) {
		Sorting s=new Sorting();
		s.getSortedList();
	}

}
