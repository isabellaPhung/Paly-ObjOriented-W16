//Isabella Phung
//Period 2
//Project 4.41
//any number of expected inputs, ending with 0

import java.util.Scanner;

public class ch4_41{
	public static void main(String[] args){
		System.out.print("Please enter in any number of integers, the input should end with 0. For example, 3 5 2 5 5 5 0: ");
		Scanner input= new Scanner(System.in);
		int num;
		int max=0;
		int counter=0;
		
		num= input.nextInt();
		while(num!= 0){ //while it's not the last number
			if (num>max){ //if number is bigger than max,replace as new max and reset counter
				max=num;
				counter=1;
			}
			else if (num==max){ //if number is equal to max, add to counter
				counter++;
			}
			num= input.nextInt(); //put in next number
		}
		System.out.println("The maximum number is "+max);
		System.out.println("The maximum number occured " + counter+ " times");
	}
}