//Isabella Phung
//Period 2
//Project 4.6
//one expected inputs; integer between 1 and 15

import java.util.Scanner;

public class ch4_19{
	public static void main(String[] args){
		System.out.print("Enter in the number of lines. The number should be between 1 and 15. For example, 7: "); //first user input; number of lines
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt(); //string to int
		int spaceVal= lines*2;
		
		for(int c= 0; c<=lines; c++){
			for(int g=0; g<spaceVal;g++){
				System.out.print(" ");
			}
				
			for(int i= 0; i<c; i++){
				int value= (int)Math.pow(2, i); //calculation
				System.out.print(value+ " "); //prints value with space after
			}
		
			for(int i= c-2; i>=0; i--){
				int value2= (int)Math.pow(2, i); //calculation
				System.out.print(value2+ " "); //prints value with space after
			}
			System.out.println(""); //new line
			spaceVal-=2; //decremnts by two to accomodate lower lines
		}
		
		
		
	}
}
	
	
	
