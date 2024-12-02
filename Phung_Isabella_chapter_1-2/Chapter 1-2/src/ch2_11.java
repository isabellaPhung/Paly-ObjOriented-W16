//Isabella Phung
//Period 2
//Project 2.11
//expected input is an int

import javax.swing.JOptionPane;

public class ch2_11{
	public static void main(String[] args){
		String input =JOptionPane.showInputDialog(null,"Please enter in a year value. For example, 5: ", "Population calculator", JOptionPane. QUESTION_MESSAGE);
		int years= Integer.parseInt(input);
		int population= 312032486; //original population
		int year=365; //year
		int hours= year * 24; //year to hours
		int minutes = hours * 60; //hours to minutes
		int seconds = minutes * 60; //minutes to seconds
		
		int birth= seconds/7; //birth rate
		int death= seconds/13; //death rate
		int immigrant= seconds/45; //immigrant rate
		for (int i =0; i<years; i++){ //for loop that repeats depending on the user input
			population= ((population + birth + immigrant)- death);
		}
		//every value is rounded down to an int, so there is a slight indescrepency in terms of values
		JOptionPane.showMessageDialog(null, "Population: " + population, "Result!" , JOptionPane.INFORMATION_MESSAGE);
		
	}
}