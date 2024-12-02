//Isabella Phung
//Period 2
//Project 2.1
//expected inputs are ints or doubles

import javax.swing.JOptionPane;

public class ch2_1{
	public static void main(String[] args){
		String input =JOptionPane.showInputDialog(null,"Please enter in a Celsius value to convert: ", "Celcius Converter!", JOptionPane. QUESTION_MESSAGE); //GUI
		double celsius=Double.parseDouble(input); //converts from string to double
		double fahrenheit = (9.0/5.0) * celsius+32; //convert
		JOptionPane.showMessageDialog(null, "Fahrenheit: " + fahrenheit, "Result!" , JOptionPane.INFORMATION_MESSAGE);
	}
}