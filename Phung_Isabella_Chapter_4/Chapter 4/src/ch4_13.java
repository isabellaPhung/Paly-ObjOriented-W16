//Isabella Phung
//Period 2
//Project 4.13
//no expected inputs

public class ch4_13{
	public static void main(String[] args){
		int n=0;
		while(Math.pow(n, 3)<12000){ //while n^3 is below 12000, increment n by 1
			n++;
		}
		n--; //decrements by 1 because while loop will end on the value above 12000
		System.out.println(n);
	}
}