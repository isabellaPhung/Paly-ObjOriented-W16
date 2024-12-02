//Isabella Phung
//Per 2
//Project 3.1
//3 inputs expected, can be ints or doubles


import java.util.Scanner;

public class ch3_1{
	public static void main(String[] args){
		double a;
		double b;
		double c;
		double result1;
		double result2;
		double discrimanent;
		
		System.out.print("Enter in the values for a, b and c, for example 1 2 3.0: ");
		Scanner input = new Scanner(System.in); //gathers user input
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		result1= (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a; //calculates roots
		result2= (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
		discrimanent= Math.pow(b, 2)-4*a*c; //calculates discrimanent
		
		if (discrimanent>0){ //checks discrimanent
			System.out.println("The roots are "+ result1 + " and "+ result2);
		}
		else if(discrimanent == 0){
			System.out.println("The root is: "+ result1);
		}
		else{
			System.out.println("There are no real roots.");
		}
	}
}