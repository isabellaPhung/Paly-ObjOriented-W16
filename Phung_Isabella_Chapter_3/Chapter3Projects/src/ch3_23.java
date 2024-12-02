//Isabella Phung
//Per 2
//Project 3.23
//2 inputs expected, can be double or int

import java.util.Scanner;

public class ch3_23{
	public static void main(String[] args){
		double userX;
		double userY;
	
		System.out.print("Enter in a point with two coordinates. For example, 2 2: ");
		Scanner input = new Scanner(System.in); //gathers user input
		userX = input.nextDouble();
		userY = input.nextDouble();
		
		if(userX<= 5 && userX>= -5 && userY<= 2.5 && userY>= -2.5){ //determines if it's in the rectangle or not
			System.out.println("Point (" + userX + "," + userY + ") is in the rectangle");
		}
		else{
			System.out.println("Point (" + userX + "," + userY + ") is not in the rectangle");
		}
	}
}