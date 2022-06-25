package newproject0.banking;

import java.util.Scanner;

public class newLogins {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankAccount obj1 = new BankAccount("Welcome" , "Customer");
		System.out.println("***************Welcome to EASY Banking************* \n Enter your UserName: ");
		String name = scan.nextLine();
		System.out.println(name);
		System.out.println("Enter your Pin Number: ");
		int pin = scan.nextInt();
		System.out.println();
		obj1.menu();	
	}
	
}

class BankAccount{
	int balance;
	int getTransaction;
	String clientName;
	String clientId;
	
	BankAccount(String cName , String cId)
	{
	clientName = cName;
	clientId = cId;
	}
			
	
	void  deposit (int amount)
	{
		if (amount > 0)
			balance = balance + amount;
			 System.out.println(amount);
	}
			 
	void withdraw(int amount) {
		if(amount > 0);
		balance = balance - amount;
		System.out.println(amount);
	}
	void getTransaction() {
		if(getTransaction > 0)
			{
			System.out.println("Deposited: " +getTransaction);
			
			}
		else if (getTransaction < 0) 
		{
			System.out.println("Withdraw: " +Math.abs(getTransaction));
		}
		else {
			System.out.println("No Transaction occured");
		}
	}		
	void menu() {
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+++++++++++++++++++++MAIN MENU ++++++++++++++++++++++++++++");
		System.out.println("1: Balance");
		System.out.println("2: Deposit");
		System.out.println("3: Withdraw");
		System.out.println("4: Get Transaction");
		System.out.println("5: Exit");

		do
		{
			System.out.println("...................Pick a choice..............");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch(option)	
			{	
				
			case '1': 
				System.out.println("Balance = " +balance);
				System.out.println("\n");
				break;
			case '2':
				System.out.println("Enter Deposit amount: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break; 
			case '3':
				System.out.println("Enter Withdraw amount: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break; 			
			case '4': 
				getTransaction();
				System.out.println("\n");
				break; 	
					
			case '5':
				System.out.println("*************Thank you**********************************");
				break;
				
			}
		}while (option != '5'); 
			{
				System.out.println("Invalid Answer");
				
			}
			
		}
		
}

