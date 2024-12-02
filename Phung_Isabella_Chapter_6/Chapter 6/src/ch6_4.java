//Isabella Phung
//Period 2
//Chapter 6_4
//one expected input; doubles or ints separated by spaces



import java.util.Scanner;

public class ch6_4{
	public static void main(String[] args){
		System.out.print("Enter in two values. For example, 6 22: "); //user input value; doubles or ints
		Scanner input = new Scanner(System.in);
		double tempValue1 = input.nextDouble();
		double tempValue2 = input.nextDouble();
		int userVal1=0;
		int userVal2=0;
		int[] randomInts= new int[10]; //list for ints
		double[] randomDoubles= new double[10]; //list for doubles
		
		if(tempValue1%1==0 && tempValue2%1==0){ //if numbers are integers, it converts to integers
			userVal1=(int)tempValue1;
			userVal2=(int)tempValue2;
			randomInts=rando(userVal1,userVal2); //initializes the random int list menthod
			for (int value: randomInts){
				System.out.print(value+ ", "); //prints
			}
		}
		else{ //if double initializes random double list method
			randomDoubles=rando(tempValue1, tempValue2);
			for (double value: randomDoubles){ //prints
				System.out.print(value+ ", ");
			}
		}
		
		
	}
	
	public static int[] rando(int num1, int num2){ //int list
		int[] randomNumList= new int[10];
		
		for(int i=0; i<10;i++){
			randomNumList[i]=(int)(num1+ Math.random()*(num2- num1)); //finds a random int between num1 and num2 and appends it to list
		}
		return randomNumList;
		
		
	}
	
	public static double[] rando(double num1, double num2){ //double list
		double[] randomNumList= new double[10];
		
		for(int i=0; i<10;i++){
			randomNumList[i]=(num1+ Math.random()*(num2- num1)); //finds a random double between num1 and num2 and appends to list
		}
		return randomNumList;
	}
}