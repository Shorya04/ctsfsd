package stream.example;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream  {

	public static void main(String[] args) throws IOException {
	
		BufferedReader reader;
		
		
		ToDo todo=null;
		List<ToDo> list=new ArrayList<ToDo>();
		list.add(new ToDo("Shorya Singh",LocalDate.now()));
		list.add(new ToDo("Amardeep Kaur",LocalDate.now()));
		try {
		reader=new BufferedReader(new FileReader("TodoInput"));
		
		String line=reader.readLine();
		while(line!=null) {
			String str[]=line.split(",");
			todo=new ToDo(str[0],str[1],LocalDate.now());
			System.out.println("File to write "+todo);
			list.add(todo);
			line=reader.readLine();
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			try {
				FileOutputStream out=new FileOutputStream("TodoOutput");
				ObjectOutputStream oos=new ObjectOutputStream(out);
				oos.writeObject(list);
				oos.flush();
			}
			catch (Exception e) {
				System.out.println("Problem in serializing "+e);
			}
			System.out.println("displaying all todo \n======\n");
			for(ToDo t:list)
			{
				System.out.println(t+"\n");
			}
						
			
			}
		}

	


