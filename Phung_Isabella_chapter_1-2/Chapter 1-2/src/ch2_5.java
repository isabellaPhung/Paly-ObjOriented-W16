//Isabella Phung
//Period 2
//Project 2.5
//expected inputs are ints or doubles

import java.util.Scanner;

public class ch2_5{
	public static void main(String[] args){
		System.out.print("Enter in the subtotal value, for example 23.15 or 10: "); //first user input; subtotal
		Scanner input = new Scanner(System.in);
		Double subtotal = input.nextDouble(); //string to double
		
		System.out.print("Enter in the tax rate in percentage form, for example 15: "); //second user input; tax
		Scanner input2 = new Scanner(System.in);
		Double tax = input2.nextDouble(); //string to double
		
		tax=tax/100.0; //from percentage form to decimal form
		double taxamount= subtotal * tax; //calculates tax amount
		taxamount= (int)(taxamount*100)/100.0; //keeps 2 decimal places at the end
		System.out.println("Tax amount: $" + taxamount); //prints tax
		
		double total= subtotal + taxamount; //calculates total
		System.out.println("Total: $" + total); //prints total
		
		
	}
}