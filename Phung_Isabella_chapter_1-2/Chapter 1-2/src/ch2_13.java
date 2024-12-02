//Isabella Phung
//Period 2
//Project 2.13
//expected inputs are ints or doubles

import javax.swing.JOptionPane;

public class ch2_13{
	public static void main(String[] args){
		String input =JOptionPane.showInputDialog(null,"Please enter in a monthly saving amount. For example, 100. The annual interest rate is set to 5%: ", "Compound Interest calculator!", JOptionPane. QUESTION_MESSAGE);
		double monthlyAmount=Double.parseDouble(input);//string to double
		
		double monthlyInterest= 0.05/12; //annual to monthly interest
		double totalAmount= monthlyAmount * (1+ monthlyInterest);
		for (int i =1; i<6; i++){
			totalAmount= (monthlyAmount + totalAmount) * (1+ monthlyInterest);
		}
		totalAmount= (int)(totalAmount*100)/100.0; //2 places after decimal point
		JOptionPane.showMessageDialog(null, "Total after 6 years: " + totalAmount, "Result!" , JOptionPane.INFORMATION_MESSAGE);
	}
}