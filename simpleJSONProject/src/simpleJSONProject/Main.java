package simpleJSONProject;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Student st=new Student(2, "Saurav", "srv");
			ObjectMapper mapper=new ObjectMapper();
			String json=mapper.writeValueAsString(st);
			System.out.println(json);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
			
		}
	}


