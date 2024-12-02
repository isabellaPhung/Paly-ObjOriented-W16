//Isabella Phung
//Period 2
//Project 4.25
//no expected inputs

public class ch4_25{
	public static void main(String[] args){
		double piValue=0;
		double piValue2=0;
		double piValue3=0;
		int one= 1;
		double num;
		
		for(double i= 1; i<10000; i+=2){ //starts at 1, ends at 10000, increments by 2
			num= 1/i; //number added on calculated
			num*= one; //determines if negetive or not
			piValue+= num; //add on to total
			one*= -1; //change next value to negetive
		}
		piValue*= 4; //mulitplys by 4
		System.out.println("The value of pi when i is 10,000 is "+ piValue);
		
		for(double c= 1; c<20000; c+=2){ //starts at 1, ends at 20000
			num= 1/c; //number added on calculated
			num*= one; //determines if negetive or not
			piValue2+= num; //add on to total
			one*= -1; //change next value to negetive
		}
		piValue2*= 4; //multiply by 4
		System.out.println("The value of pi when i is 20,000 is "+ piValue2);
		
		for(double g= 1; g<100000; g+=2){ //starts at 1, ends at 100000
			num= 1/g; //number added on and calculated
			num*= one; //determines if negetive or not
			piValue3+= num; //add on to total
			one*= -1; //change next value to negetive
		}
		piValue3*= 4; //multiply by 4
		System.out.println("The value of pi when i is 100,000 is "+ piValue3);
		
	}
}