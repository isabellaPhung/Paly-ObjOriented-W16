//Isabella Phung
//Period 2
//Project 4.7
//no expected inputs

public class ch4_7{
	public static void main(String[] args){
		double tuition= 10000; //starting tuition
		double totalTuition=0;

		
		for(int i= 0; i<10; i++){ //ends at 10 years
			tuition= tuition*1.05; //calculation
		}
		tuition=(int)(tuition*100)/100.0; //ensures there are two decimals
		System.out.println("The tuition after ten years is "+ tuition);
		
		for(int c= 0; c<4; c++){ //ends at 4 years
			totalTuition= totalTuition+tuition; //adds the tuition onto the total tuition
			tuition= tuition*1.05; //calculation
			
		}
		tuition=(int)(tuition*100)/100.0; //ensures two decimals
		totalTuition=(int)(totalTuition*100)/100.0;// ensures two decimals
		
		
		System.out.println("The total 4-year tuition after 10 years is "+ totalTuition);
		
	}
}