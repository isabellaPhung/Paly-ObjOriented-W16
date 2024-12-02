//Isabella Phung
//Per 2
//Project 3.25
//8 inputs expected, can be int or double

import java.util.Scanner;

public class ch3_25{
	public static void main(String[] args){
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double x4;
		double y4;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		
		System.out.print("Enter in eight values for the points of two lines. For example: 2.5 3 4 6 8.0 2 1 10: ");
		Scanner input = new Scanner(System.in); //gathers user input
		x1 = input.nextDouble();
		y1= input.nextDouble();
		x2 = input.nextDouble();
		y2= input.nextDouble();
		x3= input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4= input.nextDouble();
		
		
		a=y1-y2;
		b=x2-x1; //modulates equation
		c=y3-y4;
		d=x4-x3;
		e=(y1 - y2)*x1 - (x1 - x2)*y1;
		f=(y3 - y4)*x3 - (x3 - x4)*y3;
		
	
		x=((e*d)-(b*f))/((a*d)-(b*c)); //solves final equation
		y=((a*f)-(e*c))/((a*d)-(b*c));
		
		System.out.println("The intersecting point is ("+ x +","+ y+ ")");
		
	}
}