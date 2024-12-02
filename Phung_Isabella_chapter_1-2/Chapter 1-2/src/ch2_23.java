//Isabella Phung
//Period 2
//Project 2.23
//expected input is an int.

import javax.swing.JOptionPane;

public class ch2_23{
	public static void main(String[] args){
		String input =JOptionPane.showInputDialog(null,"Please enter in a ascii value to convert to letter: ", "Ascii to leter Converter!", JOptionPane. QUESTION_MESSAGE);
		int asciiVal= Integer.parseInt(input); //converts from string to int
		char character= (char)asciiVal; //converts from ascii to char
		JOptionPane.showMessageDialog(null, "The letter is: " + character, "Result!" , JOptionPane.INFORMATION_MESSAGE);
	}
}