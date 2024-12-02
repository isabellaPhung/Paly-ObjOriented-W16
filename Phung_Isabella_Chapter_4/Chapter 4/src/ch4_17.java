//Isabella Phung
//Period 2
//Project 4.17
//one expected inputs; integer between 1 and 15

import java.util.Scanner;

public class ch4_17{
	public static void main(String[] args){
		System.out.print("Enter in the number of lines. The number should be between 1 and 15. For example, 7: "); //first user input; number of lines
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt(); //string to int
		int tempVal= lines*2;
		
		for(int t= 0; t<lines+1; t++){ //for t in range 0 to lines+1, increment by 1
			for(int g=0; g<tempVal;g++){ //for g in range 0 to lines*2
				System.out.print(" "); //prints a space based on the amount of numbers there are for formating
			}
			printLine(t);
			tempVal-=2; //tempval decremented by 2 to account for later lines
		}
		
	}
	
	
	private static void printLine(int lines){ //method to print out the lines
		int tempVal=lines;
		
		for(int i= 0; i< lines; i++){ //right to middle
			System.out.print(tempVal+ " ");
			tempVal--;
		}
		
		tempVal++;
		
		for(int c= 1; c<=lines-1; c++){ //middle to left
			tempVal++;
			System.out.print(tempVal+ " ");
		}
		System.out.println("");
	}
		
	
	
}
	
	
	
