//Isabella Phung
//Period 2
//Project 4.1
//expected inputs are ints

import java.util.Scanner;

public class ch4_1{
	public static void main(String[] args){
		int num;
		int negCount = 0;
		int posCount = 0;
		double total=0.0;
		int howManyTimes = 0;
		double avg;
		
		//user input
		System.out.print("Please enter in any number of integers, the input ends if 0 is entered. For example, 1 2 -1 3 0: ");
		Scanner input= new Scanner(System.in);
		
		do{ //do-while loop that checks if the number is positive or not
			num= input.nextInt();
			if (num<0){
				negCount++; //keeps track of negative
			}
			if (num>0){
				posCount++; //keeps track of positive
			}
			
			total+=num; //keeps track of total
			howManyTimes++;
		}
		while(num !=0); //if number is zero, while loop will end
		
		avg= total/(howManyTimes-1);
		System.out.println("You entered in "+ negCount+ " negetive values.");
		System.out.println("You entered in "+ posCount+ " positive values.");
		System.out.println("The total is "+ total);
		System.out.println("The average is  "+ avg);
	}
}