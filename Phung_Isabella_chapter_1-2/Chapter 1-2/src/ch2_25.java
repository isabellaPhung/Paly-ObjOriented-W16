//Isabella Phung
//Period 2
//Project 2.25
//first input is a string. All other inputs are doubles or ints

import java.util.Scanner;

public class ch2_25{
	public static void main(String[] args){
		System.out.println("Enter employee's name, for example James: "); //name
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		System.out.println("Enter their working rate, for example 10: "); //hours
		Scanner input2 = new Scanner(System.in);
		double hours = input2.nextDouble();
		
		System.out.println("Enter their hourly pay rate, for example 8.50: "); //pay rate
		Scanner input3 = new Scanner(System.in);
		double payRate = input3.nextDouble();
		
		System.out.println("Enter in federal tax withholding rate, for example 0.20: "); //federal tax withhold rate
		Scanner input4 = new Scanner(System.in);
		double fedWithRate = input4.nextDouble();
		
		System.out.println("Enter in the state tax withholding rate, for example 0.09: "); //state withholding rate
		Scanner input5 = new Scanner(System.in);
		double stateWithRate = input5.nextDouble();
		
		double grossPay= payRate* hours; //gross pay
		grossPay= (int)(grossPay*100)/100.0; //puts it in money format
		
		double fedDeduct= fedWithRate*grossPay; //federal deduction
		fedDeduct= (int)(fedDeduct*100)/100.0; //puts it in money format
		
		double stateDeduct= stateWithRate*grossPay; //state deduction
		stateDeduct= (int)(stateDeduct*100)/100.0; //puts it in money format
		
		double totalDeduct= fedDeduct+stateDeduct;//total deduction
		totalDeduct= (int)(totalDeduct*100)/100.0; //puts it in money format
		
		double netPay= grossPay-totalDeduct; //net pay
		netPay= (int)(netPay*100)/100.0; //puts it in money format
		
		System.out.println("Employee name: "+ name);
		System.out.println("Hours worked: "+ hours);
		System.out.println("Pay rate: "+ payRate);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\t Federal Withholding ("+ fedWithRate+ "): " + fedDeduct);
		System.out.println("\t State Withholding ("+ stateWithRate+ "): "+ stateDeduct);
		System.out.println("\t Total Deduction: " + totalDeduct);
		System.out.println("Net pay: "+ netPay);
		
	}
}