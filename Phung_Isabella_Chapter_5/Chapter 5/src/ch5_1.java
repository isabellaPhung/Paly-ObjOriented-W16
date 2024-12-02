//Isabella Phung
//Period 2
//Chapter 5.1
//no expected inputs


public class ch5_1{
	public static void main(String [] args){
		int number;
		int counter= 1;
		for(int i= 1; i<=50; i++, counter++){ //for numbers 1 through
			number= getPentagonalNumber(i);
			System.out.print(number+ " ");
			if (counter== 10){ //changes line
				System.out.println("");
				counter=0;
			}
		}
	}
	
	public static int getPentagonalNumber(int n){
		int polyNum= n*((2*n)-1); //equation to find pentagonal number
		return polyNum;
		
	}
}