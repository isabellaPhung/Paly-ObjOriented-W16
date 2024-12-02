//Isabella Phung
//Period 2
//Project 2.7
//expected inputs are ints

import javax.swing.JOptionPane;

public class ch2_7{
	public static void main(String[] args){
		String input =JOptionPane.showInputDialog(null, "Please enter in the minutes. For example, 1000000000:", "Minutes Calculator!", JOptionPane. QUESTION_MESSAGE);
		int minutes= Integer.parseInt(input);//string to int
		int years= minutes / 525600; //divides amount of minutes by minutes in a year
		int days=(minutes-(525600*years))/1440; //divides amount of minutes by minutes in a day
		JOptionPane.showMessageDialog(null, "The years are: " + years + "\n" + "The days are: "+ days, "Result!" , JOptionPane.INFORMATION_MESSAGE);
	}
}