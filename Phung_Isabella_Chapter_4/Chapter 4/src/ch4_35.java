//Isabella Phung
//Period 2
//Project 4.35
//no expected inputs

public class ch4_35{
	public static void main(String[] args){
		double total= 1/(1+Math.sqrt(2)); //starting value
		
		for(int i=2; i<625; i++){ //from 2 to 624; increment by 1
			total= 1/(Math.sqrt(i)+Math.sqrt(i+1)); //uses i to move up
		}
		
		System.out.println("The total is "+ total);
	}
}