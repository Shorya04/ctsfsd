package stream.example;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile= new File("myFile");
		File outputFile= new File("input");
		
		FileReader in=new FileReader(inputFile);
		FileWriter out=new FileWriter(outputFile);
		int c;
		
		while ((c=in.read())!=-1){
			System.out.println((char)c);
			out.write(c);
		}
		System.out.println("FileReader is used to read a file and FileWriter is used for writing.");
	
		in.close();
		in.close();
	}

}
