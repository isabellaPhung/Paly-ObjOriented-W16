//Isabella Phung
//Period 2
//Chapter 5.4
//two expected inputs. int; char

import java.util.Scanner;

public class ch5_4{
	public static void main(String[] args){
		System.out.print("Enter the value that you wish to convert. Enter 0 if you want to quit: "); //first input, value for converting
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		while(userInput!= 0){
			System.out.print("Please type 'k' or 'b' depending on which you want to convert from: "); //second input, determines if kilobyte or byte
			Scanner input2 = new Scanner(System.in);
			char kiloOrByte = input2.next().charAt(0);

			if ((char)kiloOrByte== 107){ //if user enters in k
				double conversion= kilobitToByte(userInput);
				System.out.println("Your conversion from kilobit to byte is "+ conversion);
			}
			else if((char)kiloOrByte==98){ //if user enters in b
				double conversion= byteToKilobit(userInput);
				System.out.println("Your conversion from byte to kilobit is "+ conversion);
			}
			else{
				System.out.println("Oops! Something went wrong! Please try again!"); //in case user types something incorrect
			}
			
			System.out.print("Enter the value that you wish to convert. Enter 0 if you want to quit: "); //rows
			input = new Scanner(System.in);
			userInput = input.nextInt();
		}
		System.out.println("Program ended.");
	}
	
	
	public static double kilobitToByte(double kb){
		double bytes= kb*0.064; //conversion from kilobit to byte
		return bytes;
	}
	public static double byteToKilobit(double b){
		double kilobit= b*15.625; //conversion from byte to kilobit
		return kilobit;
		
	}
}