//Isabella Phung
//Period 2
//Project 4.6
//two expected inputs; double for first input and int for second input

import java.util.Scanner;

public class ch4_21{
	public static void main(String[] args){
		System.out.print("Enter in the loan amount. For example, 10000.20: "); //first user input; Loan Amount
		Scanner input = new Scanner(System.in);
		double loanAmount = input.nextInt(); //string to int
	
		System.out.print("Enter in the number of years. For example, 5: "); //first user input; Loan Amount
		Scanner input2 = new Scanner(System.in);
		int years = input.nextInt(); //string to int
		double annualInterest=0;
		double monthlyInterest=0;
		double monthlyPayment=0;
		double totalPayment= 0;
		
		System.out.println("Interest rate\tMonthly Payment\tTotal Payment");
		for(double i= 5; i<=8; i+= 0.125){
			annualInterest=i/100; //changes it from percentage to decimal percentage
			monthlyInterest= annualInterest/12; //changes it from annual to monthly interest
			monthlyPayment= (loanAmount* monthlyInterest)/ (1- (1 / Math.pow(1+monthlyInterest, years *12))); //calculation
			totalPayment= monthlyPayment*years*12; //calculates total payment
			
			monthlyPayment= (int)(monthlyPayment*100)/100.0; //ensures two decimals
			totalPayment=(int)(totalPayment*100)/100.0; //ensures two decimals
			System.out.println(i+ "%\t\t$" + monthlyPayment+ "\t\t$" +totalPayment);
			
		}

	}
}