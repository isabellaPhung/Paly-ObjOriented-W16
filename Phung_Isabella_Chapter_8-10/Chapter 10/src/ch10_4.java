//Isabella Phung
//Period 2
//Chapter 10.4
//no expected inputs

import java.math.BigDecimal;
import java.math.BigInteger;

public class ch10_4{
	public static void main(String[] args){
		BigDecimal total= BigDecimal.ONE;
		
		total= calculations(10); //calculations for each one
		System.out.println("The estimated value of 1/9*root3*pi when i is 10 is "+ total+ "");
		
		total= calculations(50);
		System.out.println("The estimated value of 1/9*root3*pi when i is 50 is "+ total+ "");
		
		total= calculations(100);
		System.out.println("The estimated value of 1/9*root3*pi when i is 100 is "+ total+ "");
	
		total= calculations(500);
		System.out.println("The estimated value of 1/9*root3*pi when i is 500 is "+ total+ "");
		
		total= calculations(1000);
		System.out.println("The estimated value of 1/9*root3*pi when i is 1000 is "+ total+ "");
		
	
	}
	
	
	
	
	public static BigInteger factorial(int n){ //method that performs factorial
		BigInteger total=BigInteger.ZERO;
		
		if(n==0){ //if the value is zero, it returns zero
			return total;
		}
		else{
			total=BigInteger.ONE; //if not, it will multiply with one and continue from there
			for(int i=2; i<=n; i++){
				total=total.multiply(new BigInteger(i+ ""));
			}
			return total;
		}
	}

	

	
	public static BigDecimal calculations(int timesIterated){
		BigDecimal leftSide= BigDecimal.ZERO;
		BigDecimal total= BigDecimal.ZERO;
		BigDecimal two= new BigDecimal(2); //creates big decimal version of 2
		
		for(int i=0; i<=timesIterated; i++){
			BigDecimal tempValue = new BigDecimal(factorial(2*i+1));
			
			BigInteger square=factorial(i).multiply(factorial(i)); //squares the top factorial
			BigDecimal square2= new BigDecimal(square); //converts it from integer to decimal
			
			leftSide=square2.divide(tempValue, 25, BigDecimal.ROUND_DOWN); //divdes it, keeps 25 places after decimal point, and rounds down
			total= total.add(leftSide); //adds it
		}
		total=total.divide(two);
		return total;
	}
}

