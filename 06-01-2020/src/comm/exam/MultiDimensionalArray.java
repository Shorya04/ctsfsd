package comm.exam;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main (String [] args) {
		
		int[][] array1=new int[3][3];
		int[][] array2=new int[3][3];
		int[][] array3=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in array 1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array1[i][j]=sc.nextInt();
			}
		}
			System.out.println("Enter elements in array 2");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					array2[i][j]=sc.nextInt();}
			}
			System.out.println("Adding array1 & array2:");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					array3[i][j]=array1[i][j]+array2[i][j];
                        System.out.print(array3[i][j]+" ");}
				
				System.out.println(" ");}
				}
}
			
					
		
