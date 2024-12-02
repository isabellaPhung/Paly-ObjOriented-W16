//Isabella Phung
//Period 2
//Chapter 10.1
//5 expected string inputs, then single digit ints to determine actions

import java.util.Scanner;

class Accounts{
	public static Accounts[] accounts= new Accounts[5]; //array of account objects with 5 slots
	String accountName; //various parts of account objects
	int IDNum;
	int checkingBalance;
	int savingsBalance;
	
	Accounts(String name) { //makes account that user specifies
		accountName= name;
		IDNum= (int)(Math.random()*100); //random two digit ID number
		checkingBalance=100;
		savingsBalance=0;
	}

	
	public static Accounts[] getAccounts() { //default account
		return accounts;
	}

	//getters for data fields of account
	public String getAccountName() {
		return accountName;
	}
	public int getIDNum() {
		return IDNum;
	}
	public int getCheckingBalance() {
		return checkingBalance;
	}
	public int getSavingsBalance() {
		return savingsBalance;
	}

	//setters for data fields of account
	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(int savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
}



public class ch10_1{
	public static void main(String[] args){
		System.out.print("Enter in five different account names, each separated by a space. \nFor example: Investment CollegeFund : "); //names of 5 different accounts. String
		Scanner input = new Scanner(System.in);
		int n=0;
		while(n<5){
			String accountName = input.next(); //creates an account object and stores each
			Accounts userAccount = new Accounts(accountName);
			Accounts.accounts[n]= userAccount;
			n++;
		}
		
		Accounts[] accounts = Accounts.getAccounts();

		System.out.print("Please enter in the ID number of the account you would like to edit. "); //two digit ID num to determine which account to edit
		for (int i = 0; i < accounts.length; i++) { //prints out all the accounts and their ID numbers for the user to see
				System.out.print(accounts[i].getAccountName()+ " : ");
				System.out.print(accounts[i].getIDNum()+ ", ");
		} 
		System.out.print("(Enter 0 to quit)"); //what user wants to do. String
		Scanner input2 = new Scanner(System.in);
		int enteredAccountID = input2.nextInt();
		Accounts accountToEdit= accounts[0];
		
		while(enteredAccountID!=0){ //while user doesn't enter 0
			for (int i = 0; i < accounts.length; i++) {
				if(enteredAccountID==accounts[i].getIDNum()){ //determines account to edit from entered ID number
					accountToEdit= accounts[i];
				}
			}
		
		
		System.out.print("What would you like to do? Enter 1 to check the balance, 2 to withdraw, 3 to Deposit, 4 to check into a different account, or enter 0 to quit.");
		Scanner input3 = new Scanner(System.in); //different options for user to choose
		int userCommand = input3.nextInt();
		
		
		if(userCommand==0){ //if user enters 0, it will break
			break;
		}
		else if(userCommand==1){ //if user wants to check balance
			System.out.print("Would you like to check the checking or savings balance? Enter 1 for checking or 2 for savings.");
			Scanner input4 = new Scanner(System.in); //asks for checking or savings
			int checkOrSaving = input4.nextInt();
			if(checkOrSaving== 1){ //prints for checking
				System.out.println("The checking account balance for " + accountToEdit.getAccountName()+ " is "+ accountToEdit.getCheckingBalance());
			}
			else if(checkOrSaving==2){ //prints for savings
				System.out.println("The saving account balance for " + accountToEdit.getAccountName()+ " is "+ accountToEdit.getSavingsBalance());
			}
		}
		else if(userCommand==2){ //if user wants to withdraw
			System.out.print("Would you like to withdraw from the checking or savings balance? Enter 1 for checking or 2 for savings.");
			Scanner input4 = new Scanner(System.in); //asks for checking or savings
			int checkOrSaving = input4.nextInt();
			
			System.out.print("How much would you like to withdraw?");
			Scanner input5 = new Scanner(System.in); //asks for amount to withdraw
			int withdrawl = input5.nextInt();
			if(checkOrSaving== 1){ //if user withdraws from checking
				accountToEdit.setCheckingBalance(accountToEdit.getCheckingBalance()-withdrawl);
			}
			else if(checkOrSaving==2){ //if user withdraws from savings
				accountToEdit.setSavingsBalance(accountToEdit.getSavingsBalance()-withdrawl);
			}
		}
		else if(userCommand==3){ //if user deposits
			System.out.print("Would you like to deposit into the checking or savings balance? Enter 1 for checking or 2 for savings.");
			Scanner input4 = new Scanner(System.in);
			int checkOrSaving = input4.nextInt();
			
			System.out.print("How much would you like to deposit?");
			Scanner input5 = new Scanner(System.in); //amount to deposit
			int deposit = input5.nextInt();
			
			if(checkOrSaving== 1){ //deposits into checking
				accountToEdit.setCheckingBalance(accountToEdit.getCheckingBalance()+deposit);
			}
			else if(checkOrSaving==2){ //deposits into savings
				accountToEdit.setSavingsBalance(accountToEdit.getSavingsBalance()+deposit);
			}
		}
		
		else if(userCommand==4){ //changes accounts
			System.out.print("Please enter in the ID number of the account you would like to edit. ");
			for (int i = 0; i < accounts.length; i++) {
					System.out.print(accounts[i].getAccountName()+ " : ");
					System.out.print(accounts[i].getIDNum()+ ", ");
			} 
			System.out.print("(Enter 0 to quit)"); //what user wants to do. String
			Scanner input6 = new Scanner(System.in);
			enteredAccountID = input6.nextInt();
			
			for (int i = 0; i < accounts.length; i++) {
				if(enteredAccountID==accounts[i].getIDNum()){
					accountToEdit= accounts[i];
				}
			}
			
		}
		
		
		}
		System.out.println("Program ended.");
	}
	
}