//Isabella Phung
//Per 2
//Project 3.19
//1 input expected, must be int

import java.util.Scanner;

public class ch3_9{
	public static void main(String[] args){
		int isbn9;
		int d1;
		int d2;
		int d3;
		int d4;
		int d5;
		int d6;
		int d7;
		int d8;
		int d9;
		int d10;
		int tempNum;
	
		System.out.print("Enter in the first 9 digits of the ISBN number as an integer: ");
		Scanner input = new Scanner(System.in); //gathers user input
		isbn9 = input.nextInt();
		
		tempNum= isbn9;
		d1=tempNum/100000000;
		tempNum=tempNum%100000000;
		d2=tempNum/10000000;
		tempNum=tempNum%10000000;
		d3=tempNum/1000000;
		tempNum=tempNum%1000000; //finds all the possible digits by dividing the place
		d4=tempNum/100000;
		tempNum=tempNum%100000;
		d5=tempNum/10000;
		tempNum=tempNum%10000;
		d6=tempNum/1000;
		tempNum=tempNum%1000;
		d7=tempNum/100;
		tempNum=tempNum%100;
		d8=tempNum/10;
		tempNum=tempNum%10;
		d9=tempNum/1;
		d10= (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11; //finds last number

		
		if(d10 == 10){ //checks if last number is 10, if so, replaces number with X
			System.out.println("The ISBN-10 number is "+ d1+ isbn9 + "X");
		}
		else{ //if not, normally prints it
			System.out.println("The ISBN-10 number is "+ d1+ isbn9 + d10);
		}
		
	}
}