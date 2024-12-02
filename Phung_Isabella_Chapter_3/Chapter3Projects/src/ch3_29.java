//Isabella Phung
//Per 2
//Project 3.29
//6 inputs expected, separated by 3s, can be ints or doubles

import java.util.Scanner;

public class ch3_29{
	public static void main(String[] args){
		double x1;
		double y1;
		double r1;
		double x2;
		double y2;
		double r2;
		double radiusDistance;
	
		System.out.print("Enter in a point with two coordinates and a radius for the first circle. For example, 2 2 7.0: ");
		Scanner input = new Scanner(System.in); //gathers user input
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		r1= input.nextDouble();
		
		System.out.print("Enter in a point with two coordinates and a radius for the second circle. For example, 3 3 5.0: ");
		Scanner input2 = new Scanner(System.in); //gathers user input
		x2 = input2.nextDouble();
		y2 = input2.nextDouble();
		r2= input2.nextDouble();
		
		radiusDistance= Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2)); //determines the distance between the two radii
		
		if (radiusDistance<= Math.abs(r1-r2)){ //if it's less than the absolute value of r1-r2, circle2 is inside circle1
			System.out.println("The circle2 is inside circle1.");
		}
		else if(radiusDistance<=(r1+r2)){ //if it's less than r1+r2, circle2 is inside circle1
			System.out.println("The circle2 overlaps circle1.");
		}
		else{ //if it doesn't follow either of the above, they don't overlap
			System.out.println("The circles don't overlap.");
		}
	}
}