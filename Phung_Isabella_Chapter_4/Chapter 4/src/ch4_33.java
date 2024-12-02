//Isabella Phung
//Period 2
//Project 4.6
//no inputs expected

public class ch4_33{
	public static void main(String[] args){
		int total=0;
		
		for(int i=1; i<=10000; i++){ //from 1 to 10,000; increment by 1
			for(int c=1; c<=10000; c++){ //from 1 to 10,000, increment by 1; divisor can only be as big as 10,000 at most
				if (i%c==0){ //if evenly divided
					total=total+c; //adds to the total
				}
			}
			total=total-i; //subtracts out the original value
			if(total==i){ //if the total is equivalent to original value, it is a perfect number
				System.out.println(i+ " is a perfect number.");
			}
			total=0; //reset total
		}
		
		
	}
}