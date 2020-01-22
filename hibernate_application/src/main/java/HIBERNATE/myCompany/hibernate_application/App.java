package HIBERNATE.myCompany.hibernate_application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.UUID;


import HIBERNATE.myCompany.hibernate_application.Model.Person;
import HIBERNATE.myCompany.hibernate_application.Model.PersonService;
import HIBERNATE.myCompany.hibernate_application.Model.PersonServiceImpl;

public class App 
{
	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
    public static void main( String[] args ) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String uid,name;
        int id;
        int choice=-1;
        do {
        System.out.println("...Enter Choice...");
        System.out.println("1. Create person");
        System.out.println("2. Display all person");
        System.out.println("3. Find person");
        System.out.println("4. Update person");
        System.out.println("5. Delete peson");
        System.out.println("0. Exit");
        switch(choice) {
        case 1:
        	
        	Person person=service.createPerson(person);
        	System.out.println(person);
        	break;
        	
        case 2:
        	System.out.println("Enter Id: ");
            id=Integer.parseInt(br.readLine());
        	Person p=service.findById(id);
        	System.out.println(p);
        	break;
        	
        case 3:
        	System.out.println("Enter Id: ");
        	id=Integer.parseInt(br.readLine());
        	Person p1=service.UpdatePerson(id);
        	System.out.println(p1);
        	break;
        	
        case 0:
        	System.exit(0);
        	break;
        
        	default:
        		System.out.println("Enter valid choice");
        }
        }while(choice!=0);
    
}
    }
