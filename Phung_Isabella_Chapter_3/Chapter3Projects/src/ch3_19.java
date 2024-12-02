//Isabella Phung
//Per 2
//Project 3.19
//3 inputs expected, can be int or double

import java.util.Scanner;

public class ch3_19{
	public static void main(String[] args){
		double side1;
		double side2;
		double side3;
		double perimeter;
	
		System.out.print("Enter in three values for the sides of a triangle. For example: 2.5 3 4: ");
		Scanner input = new Scanner(System.in); //gathers user input
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		
		perimeter= side1+side2+side3; //finds perimeter
		
		if ((side1+side2)<=side3){ //checks all possible combinations for invalid triangles
			System.out.println("Sorry! Invalid triangle! Please try again!");
		}
		else if(side2+side3<=side1){
			System.out.println("Sorry! Invalid triangle! Please try again!");
		}
		else if(side1+side3<=side2){
			System.out.println("Sorry! Invalid triangle! Please try again!");
		}
		else{ //if it passes, then perimeter is printed
			System.out.println("The perimeter is " + perimeter);
		}
	}
}