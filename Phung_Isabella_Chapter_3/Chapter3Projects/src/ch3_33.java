//Isabella Phung
//Per 2
//Project 3.33
//6 inputs expected, separated by 3s, weight must be int, price can be int or double

import java.util.Scanner;

public class ch3_33{
	public static void main(String[] args){
		int weight1;
		double price1;
		int weight2;
		double price2;
		double perpound1;
		double perpound2;
	
		System.out.print("Enter in the weight and price value for the first bag. For example: 50 25.75: ");
		Scanner input = new Scanner(System.in); //gathers user input for first bag
		weight1 = input.nextInt();
		price1 = input.nextDouble();
		
		System.out.print("Enter in the weight and price value for the second bag. For example: 25 90.50: ");
		Scanner input2 = new Scanner(System.in); //gathers user input for second bag
		weight2 = input2.nextInt();
		price2 = input2.nextDouble();
		
		perpound1= price1/weight1; //determines the price per pound
		perpound2= price2/weight2;
		
		if (perpound1>perpound2){ //checks for the better price
			System.out.println("The first bag has the better price");
		}
		else if(perpound2>perpound1){
			System.out.println("The second bag has the better price");
		}
		else if(perpound1==perpound2){
			System.out.println("The bags are equal in price");
		}
		else{ //in case something goes wrong
			System.out.println("Oops, something went wrong! Please try again!");
		}
	}
}