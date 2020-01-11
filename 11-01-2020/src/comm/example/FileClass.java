package comm.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileClass {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Provide a File name: ");

		
		String myFile=br.readLine();
		File f=new File(myFile);
		try {
			f.createNewFile();
		} catch (IOException e) {
			
		}
		System.out.println("Name: "+f.getName());
		if(f.exists()) {
			System.out.println(f+ " does Exist!!");
		}
		if(f.canRead()) {
			System.out.println(f+" can read..");
		}
		System.out.println(myFile+"is"+ f.length()+ " bytes long." );
		System.out.println(myFile+ "is last modified at " +new java.util.Date(f.lastModified()));
		
		if(f.canWrite()) {
			System.out.println(myFile +" is Writable.");
		}
			else {
				System.out.println(myFile +" is not Writable.");
			
		}
	}

}
