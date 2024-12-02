//Isabella Phung
//Period 2
//Project 4.31
//3 expected inputs; doubles for first two inputs, integer for last

import java.util.Scanner;

public class ch4_31{
	public static void main(String[] args){
		System.out.print("Enter in the initial amount. For example, 10000.01: "); //first user input; initial amount
		Scanner input1 = new Scanner(System.in);
		double amount = input1.nextDouble(); //string to double
		double tempVal= amount;
		
		System.out.print("Enter in the annual percentage yield. For example 5.75: "); //second user input; initial amount
		Scanner input2 = new Scanner(System.in);
		double percentYield = input2.nextDouble(); //string to double
		
		System.out.print("Enter in the maturity period (the number of months). For example, 18: "); //third user input; initial amount
		Scanner input3 = new Scanner(System.in);
		int months = input3.nextInt(); //string to int
		
		System.out.println("Month\tCD amount");
		for(int i= 1; i<=months; i++){ //from 1 to the amount of months
			amount= amount+(amount*percentYield)/1200; //calculation
			tempVal= (int)(amount*100)/100.0; //ensures for two decimals
			System.out.println(i+ "\t"+ tempVal);
		}
		
	}
}