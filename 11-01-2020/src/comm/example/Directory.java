package comm.example;

import java.io.File;

public class Directory {
	public static void main(String[] args) {
		
		System.out.println("Creating a Temporary Directory");
		String myFile="Temp";
		File f=new File(myFile);
		f.mkdir();
		
		File subdir1=new File(f, "subdir1");
		subdir1.mkdir();
		File subdir2=new File(f, "subdir2");
		subdir2.mkdir();
		
		
	System.out.println(myFile +" is a "+ (f.isFile()? "File": "Directory"));
	 if (f.isDirectory()) {
         String content[] = f.list();
         System.out.println("The content of this directory:");
         for (int i = 0; i < content.length; i++) {
             System.out.println(content[i]);
         }
     }
     
     // Delete a directory
     System.out.println(myFile +
             (f.exists()? " exists": " does not exist"));
     System.out.println("Deleting temp directory...");
     f.delete();
     
 }

	
	}


