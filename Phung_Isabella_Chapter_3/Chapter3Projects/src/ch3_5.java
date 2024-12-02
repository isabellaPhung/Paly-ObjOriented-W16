//Isabella Phung
//Per 2
//Project 3.5
//2 separate inputs expected, must be ints

import java.util.Scanner;

public class ch3_5{
	public static void main(String[] args){
		int currentDay;
		int daysPassed;
		
		System.out.print("Enter in the value for the current date according to it's number correspondence, for example 1 for Monday or 0 for Sunday: ");
		Scanner input = new Scanner(System.in);//gathers user input for starting day
		currentDay = input.nextInt();
		
		System.out.print("Enter in the number of days that have passed since that day: ");
		Scanner input1 = new Scanner(System.in); //gathers user input for numbers of days passed
		daysPassed = input1.nextInt();
		
		switch (currentDay){ //determines which day it is
			case 0: System.out.print("Today is Sunday");
					break;
			
			case 1: System.out.print("Today is Monday");
					break;
			
			case 2: System.out.print("Today is Tuesday");
					break;
			
			case 3: System.out.print("Today is Wednesday");
					break;
			
			case 4: System.out.print("Today is Thursday");
					break;
			
			case 5: System.out.print("Today is Friday");
					break;
			
			case 6: System.out.print("Today is Saturday");
					break;
			
			default: System.out.println("Sorry! Something went wrong! Try again!"); //in case something goes wrong
		}
		
		switch ((currentDay+daysPassed)%7){ //determines what the future day is
		case 0: System.out.print(" and the future day is Sunday");
				break;
		
		case 1: System.out.print(" and the future day is Monday");
				break;
		
		case 2: System.out.print(" and the future day is Tuesday");
				break;
		
		case 3: System.out.print(" and the future day is Wednesday");
				break;
		
		case 4: System.out.print(" and the future day is Thursday");
				break;
		
		case 5: System.out.print(" and the future day is Friday");
				break;
		
		case 6: System.out.print(" and the future day is Saturday");
				break;
		
		default: System.out.println("Sorry! Something went wrong! Try again!"); //in case something goes wrong
		}

	}
}