package comm.example1;

import java.util.Scanner;

public class Test1 {
	private static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	
	int choice=1;
	Account account=null;
	do {
		System.out.println("...Enter Choice...");
		System.out.println("1. Create Account");
		System.out.println("2. Display Account");
		System.out.println("3. Exit");
		choice= sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter Account number, Account Type");
		int accno=sc.nextInt();
		String type=sc.nextLine();
		account=Account.createAccount(AccountType.SAVINGS,1000);
		break;
	
	case 2:
		System.out.println(account.displayAccount());
		break;
		
	case 0:
		System.out.println("Exiting from the system..");
		System.exit(0);
		
		default:
			System.out.println("Invalid choice");
			break;
		
	}
	}
	while(choice!=0);
	}
}
		



