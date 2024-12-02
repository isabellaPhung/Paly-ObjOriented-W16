//Isabella Phung
//Period 2
//Chapter 5.5
//one expected input, int.

import java.util.Scanner;

public class ch5_5{
	public static void main(String[] args){
		System.out.print("Enter the number of terms: "); //terms
		Scanner input = new Scanner(System.in);
		int numOfTerms = input.nextInt();
		
		double total= 0;
		for(int i=1; i<=numOfTerms;i++){ //for i in range of number of terms
			double value= computeTotal(i);
			total+=value;
		}
		System.out.println("The total is "+ total);
	}
	public static double computeTotal(int n){
		double divisor= (1.0)*(n*(n+1)); //bottom half of equation
		return 2/divisor;
	}
}