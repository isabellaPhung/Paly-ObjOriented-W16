//Isabella Phung
//Period 2
//Chapter 5.6
//two expected inputs. int, int.

import java.util.Scanner;

public class ch5_6{
	public static void main(String[] args){
		System.out.print("Enter an integer value: "); //terms
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.print("Enter in the amount  of zeros after: "); //amount of zeros
		Scanner input2 = new Scanner(System.in);
		int zeros = input2.nextInt();
		
		Print(num,zeros);
		
	}
	
	 public static void Print(int number, int zeros){
		 System.out.print(number+"."); //decimal point
		 for(int i= 0; i< zeros; i++){ //prints as many ceros as necessary
			 System.out.print("0");
		 }
	 }
}