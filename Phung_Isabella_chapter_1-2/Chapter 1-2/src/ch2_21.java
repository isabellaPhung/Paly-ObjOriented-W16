//Isabella Phung
//Period 2
//Project 2.21
//expected inputs are ints or doubles for the first two inputs. Third input expects ints.

import java.util.Scanner;

public class ch2_21{
	public static void main(String[] args){
		System.out.print("Enter in an investment amount, for example 1000: "); //first user input; investment amount
		Scanner input = new Scanner(System.in);
		double investment = input.nextDouble();
		
		System.out.print("Enter in the annual interest rate in percentage, for example 15: "); //second user input; interest rate
		Scanner input2 = new Scanner(System.in);
		double interest = input2.nextDouble();
		
		interest=(interest/100)/12; //divides interest according to month and percentage format
		
		System.out.print("Enter in the number of years. For example, 1: "); //third user input; years
		Scanner input3 = new Scanner(System.in);
		int years = input.nextInt();
		
		double futureInvestment= investment*(Math.pow(1+interest,years*12)); //equation
		futureInvestment= (int)(futureInvestment*100)/100.0; //rounds to thousandths
		System.out.println("The accumulated value is: " + futureInvestment); 
	}
}