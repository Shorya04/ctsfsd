package comm.exam;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s=sc.nextLine();
	int l=s.length();
	s=s.toLowerCase();
	for(int i=0;i<l;i++) {
	if(s.charAt(i)=='a' || s.charAt(i)=='i' ||  s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='e' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='U')
	{
    
	count++;	
	}
	}
	System.out.println(count);
	
	}
}
	