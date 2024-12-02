//Isabella Phung
//Period 2
//Project 4.11
//no expected inputs

public class ch4_11{
	public static void main(String[] args){
		int counter=0;
		
		for(int start=100; start<201; start++){ //starts at 100, ends at 200, increments by 1
			if(start%5==0^start%6==0){ //if divisible by 5 exclusive or divisible by 6
				System.out.print(start+ " "); //prints numbers on 1 line
				counter++; //increment counter
			}
			if (counter==10){ //if counter reaches 10, move down a line
				System.out.println("");
				counter=0; //reset counter
			}
		}
	}
}