//Isabella Phung
//Period 2
//Chapter 6_5
//one expected input; ints separated by spaces

import java.util.Scanner;

public class ch6_5{
	public static void main(String[] args){
		System.out.print("Enter in the coefficients of the trinomial. For example, 0 7 12: "); //three user inputed values
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int[] factors= new int[4];
		
		factors= factorBasic(a, b, c);
		
		printFactored(factors);
	}
	
	public static int[] factorBasic(int a, int b, int c){
		int[] factors= new int[4];
		factors[0]= 1;
		factors[2]= 1;
		
		if (a==0){ //simple factoring
			for(int i=1; i<100;i++){ //finding what goes multiplies into c but adds into b
				if(c%i==0){
					if((c/i)+i==b){
						factors[1]= (c/i);
						factors[3]= i;
					}
				}
			}
		}
		else{
			factors= factorAdvanced(a, b, c);
		}
		return factors;
	}
	
	
	
	public static int[] factorAdvanced(int a, int b, int c){
		int[] factors= new int[4];
		int b1=1;
		int b2=1;
		int tempVal1=0;
		int tempVal2=0;
		
	
		for(int i=1; i<100;i++){ //finding b1 and b2
			if((a*c)%i==0){
				if(((a*c)/i)+i==b){
					b1=(a*c)/i;
					b2=i;
				}
			}
		}
		
		for(int i=1; i<100;i++){ //searching for factors[0]
			if(a%i==0){
				if(b1%i==0){
					factors[0]= i;
					tempVal1= (a/i)+(b1/i);
				}
			}
		}
		
		for(int i=1; i<100;i++){ //searching for factors[1]
			if(c%i==0){
				if(b2%i==0){
					factors[1]= i;
					tempVal2= (c/i)+(b2/i);
					factors[2]= b2/i;
					factors[3]= c/i;
				}
			}
		}
		
		if(tempVal1==tempVal2){
			return factors;
		}
		else{
			factors[1]=-1*factors[1]; //if the last section doesn't match, then it will turn factors[1] into negetive
			return factors;
		}
		
	}

	public static void printFactored(int[] factors){
		String factor0="The factored equation is ( "+ factors[0]; //default message
		String factor1="x + "+ factors[1]+ " )( ";
		String factor2=factors[2]+ "x ";
		String factor3="+ "+ factors[3]+ " ).";
		
		if(factors[0]==1){ //checks if factors[0] is one so it will change 1x to x
			factor0="The factored equation is ( ";
		}
		
		if(factors[2]==1){//checks if factors[2] is one so it will change 1x to x
			factor2= "x ";
		}
		
		if(factors[1]<0){ //checks if factors[1] is negetive so it will remove the plus
			factor1="x "+ factors[1]+ " )( ";
		}
		
		if(factors[3]<0){//checks if factors[3] is negetive so it will remove the plus
			factor3=" "+ factors[3]+ " ).";
		}
		
		System.out.println(factor0+ factor1 + factor2+ factor3);
	
	
	
	}
	
	
	
	
	
}