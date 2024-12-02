//Isabella Phung
//Per 2
//Project 3.3
//6 inputs expected, can be ints or doubles

import java.util.Scanner;

public class ch3_3{
	public static void main(String[] args){
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		double check;
		
		System.out.print("Enter in the values for a, b, c, d, e, and f. For example 1 2 3.0 4 5 6: ");
		Scanner input = new Scanner(System.in); //gathers user input
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		x=(e*d-b*f)/(a*d-b*c); //solves system
		y=(a*f-e*c)/(a*d-b*c);
		check= a*d-b*c; //checks if it's zero
		
		if (check == 0){ //checks
			System.out.println("Equation has no solution.");
		}
		else{ //displays results if check is cleared
			System.out.println("x is "+ x+ " and y is "+ y);
		}

	}
}