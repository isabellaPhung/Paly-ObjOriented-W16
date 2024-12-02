//Isabella Phung
//Per 2
//Project 3.21
//3 separate inputs expected, must be int

import java.util.Scanner;

public class ch3_21{
	public static void main(String[] args){
		int year;
		int m;
		int q;
		int h;
		int k;
		int j;
	
		System.out.print("Enter in the year. For example 2012: "); //gathers user input for year
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		
		System.out.print("Enter in the month, any number between 1-12: "); //gathers user input for month
		Scanner input2 = new Scanner(System.in);
		m = input2.nextInt();
		
		System.out.print("Enter in the day of the month, any number between 1-31: "); //gathers user input for day
		Scanner input3 = new Scanner(System.in);
		q = input3.nextInt();
		
		k= year%100; //year of century
		j= year/100; //century
		
		h=(int)(q+((26*(m+1))/10.0)+k+(k/4.0)+(j/4.0)+(5*j))%7; //Zeller's Congruence equation
		
		switch (h){ //determines the day
		case 0: System.out.print("The day of the week is Saturday");
				break;
		
		case 1: System.out.print("The day of the week is Sunday");
				break;
		
		case 2: System.out.print("The day of the week is Monday");
				break;
		
		case 3: System.out.print("The day of the week is Tuesday");
				break;
		
		case 4: System.out.print("The day of the week is Wednesday");
				break;
		
		case 5: System.out.print("The day of the week is Thursday");
				break;
		
		case 6: System.out.print("The day of the week is Friday");
				break;
		
		default: System.out.println("Sorry! Something went wrong! Try again!"); //if something goes wrong
		
		/* I'd been facing some strange bug that I'd tried to figure out find, but I could never figure it out. 
		 * When testing, it printed Friday, instead of Sunday for January 25, 2015
		 */
		}
	}
}
