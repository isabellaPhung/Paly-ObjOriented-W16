//Isabella Phung
//Period 2
//Chapter 5.3
//one expected input, int

import java.util.Scanner;

public class ch5_3{
	public static void main(String[] args){
		System.out.print("Enter an intger representing the number of rows: "); //rows
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		displayPattern(rows);
		
	}
	public static void displayPattern(int n){
		for(int d=1; d<=n; d++){ //for d in range rows
			int randomAsterisk= (int)(Math.random()*10);
			randomAsterisk++; //to ensure that there are no zero asterisks
			for (int i= 1; i<=randomAsterisk; i++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}