//Isabella Phung
//Period 2
//Chapter 5.2
//2 expected inputs. both integer.

import java.util.Scanner;

public class ch5_2{
	public static void main(String[] args){
		int total=0;
		int total2=0;
		
		System.out.print("Pleas enter in the amount of digits that are in your integer. For example 3: "); //first input. amount of digits in integer
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		
		System.out.print("Enter an integer. For example, 374: "); //second input. integer
		Scanner input2 = new Scanner(System.in);
		int value = input2.nextInt();
		
		total=multiplyDigits(value, length);
		System.out.println(total);


	}
	
	
	public static int multiplyDigits(int n, int length){
		int total=1;
		int num=1;
		num=n%10;
		n=n/10;
		
		for (int i= 0; i<length; i++){ //for length of int i, total will multiply the value of the number, then the number will be shortened.
			total*=num;
			num=n%10;
			n=n/10;
		}
		return total;
			
	}
	
}
