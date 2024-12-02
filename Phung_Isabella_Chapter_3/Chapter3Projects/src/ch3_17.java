//Isabella Phung
//Per 2
//Project 3.17
//1 input expected, must be int

import java.util.Scanner;

public class ch3_17{
	public static void main(String[] args){
		int compHand;
		int userHand;
		String compHandName;
		String userHandName= "";
		
		compHand=(int)(Math.random()*3); //generates random number between 1 and 3
		
		System.out.print("Enter in your hand for a rock-paper-scissors game. 0 for scissors, 1 for rock, and 2 for paper: ");
		Scanner input = new Scanner(System.in); //gathers user input
		userHand = input.nextInt();
		
		if (compHand==0){ //determines what hand the computer is
			compHandName="scissors";
		}
		else if(compHand==1){
			compHandName="rock";
		}
		else{
			compHandName="paper";
		}
		
		
		if (userHand==0){ //determines what hand the user is
			userHandName="scissors";
		}
		else if(userHand==1){
			userHandName="rock";
		}
		else if (userHand==2){
			userHandName="paper";
		}
		else{
			System.out.println("Oops, you typed in a number not corresponding to a hand! Please try again!"); //in case something goes wrong
		}
		
		
		switch (compHand-userHand){ //checks all possible combinations based off of the number that the hand is
		case -2: System.out.print("The computer's hand is "+ compHandName + ". Your hand is "+ userHandName+ ". The computer wins.");
				break;

		case -1: System.out.print("The computer's hand is "+ compHandName + ". Your hand is "+ userHandName+ ". The user wins.");
				break;
		
		case 0: System.out.print("The computer's hand is "+ compHandName + ". Your hand is "+ userHandName+ ". It is draw.");
				break;
		
		case 1: System.out.print("The computer's hand is "+ compHandName + ". Your hand is "+ userHandName+ ". The computer wins.");
				break;
		
		case 2: System.out.print("The computer's hand is "+ compHandName + ". Your hand is "+ userHandName+ ". The user wins.");
				break;
		
		default: System.out.println(" "); //in case something goes wrong
		}
	}
}