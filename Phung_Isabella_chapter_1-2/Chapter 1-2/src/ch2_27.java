//Isabella Phung
//Period 2
//Project 2.27
//first input is a string. All other inputs are doubles or ints

import javax.swing.JOptionPane;

public class ch2_27{
	public static void main(String[] args){
		String name =JOptionPane.showInputDialog(null,"Please enter in a name. For example, James: ", "Payroll Calculator!", JOptionPane. QUESTION_MESSAGE);
		
		String input =JOptionPane.showInputDialog(null, "Please enter in the hours worked. For example, 10:", "Payroll Calculator!", JOptionPane. QUESTION_MESSAGE);
		double hours=Double.parseDouble(input);
		
		String input2 =JOptionPane.showInputDialog(null, "Please enter in the hourly pay rate. For example, 6.75:", "Payroll Calculator!", JOptionPane. QUESTION_MESSAGE);
		double payRate=Double.parseDouble(input2);
		
		String input3 =JOptionPane.showInputDialog(null, "Please enter in the Federal Tax Withholding rate. For example, 0.20:", "Payroll Calculator!", JOptionPane. QUESTION_MESSAGE);
		double fedWithRate=Double.parseDouble(input3);
		
		String input4 =JOptionPane.showInputDialog(null, "Please enter in the State Tax Withholding rate. For example, 0.09:", "Payroll Calculator!", JOptionPane. QUESTION_MESSAGE);
		double stateWithRate=Double.parseDouble(input4);
		
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
		
		JOptionPane.showMessageDialog(null, "Employee name: "+ name + "\n"
				+ "Hours worked: "+ hours + "\n"
				+ "Pay rate: "+ payRate + "\n"
				+ "Gross pay: " + grossPay + "\n"
				+ "Deductions: " + "\n"
				+ "\t Federal Withholding ("+ fedWithRate + "): " + fedDeduct + "\n"
				+ "\t State Withholding ("+ stateWithRate+ "): " + stateDeduct + "\n"
				+ "\t Total Deduction: " + totalDeduct + "\n"
				+ "Net pay: "+ netPay, "Results!" , JOptionPane.INFORMATION_MESSAGE);
				//formatted to make it easier to read
		
	}
}