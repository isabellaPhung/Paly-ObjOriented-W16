//Isabella Phung
//Period 2
//Chapter 10.3
//no expected inputs

import java.math.*;
import java.util.Objects;

public class ch10_3{
	public static void main(String[] args){
		long n= 1;
		int check=0;
		BigInteger maxValOfLong= new BigInteger(Objects.toString(Long.MAX_VALUE,null)); //creates a big integer version of the max value in string form
		BigInteger value= BigInteger.ONE;
		
		System.out.println("10 cubed digits larger than "+ maxValOfLong);
		while(check<10){
			value = BigInteger.valueOf(n);
			for(int i= 0; i<3; i++){
				value=value.multiply(new BigInteger(value+ "")); //cubes value
			}
			
			if(maxValOfLong.compareTo(value)==-1){ //compares values
				System.out.println(n+"^3= "+ value);
				check++;
			}
			n++;
			
		}
		
		
	}
}
