//Isabella Phung
//Period 2
//Project 4.23
//no expected inputs

public class ch4_23{
	public static void main(String[] args){
		double num;
		double total=0;
		int i= 50000;
		while(i!=0){ //while i is not zero
			num= 1.0/i; //number
			total=total+num; //add number onto total
			i--; //decrement i
		}
		System.out.println("The result is " + total);
	}
}