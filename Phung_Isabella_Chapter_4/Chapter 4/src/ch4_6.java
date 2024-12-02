//Isabella Phung
//Period 2
//Project 4.6
//no expected inputs

public class ch4_6{
	public static void main(String[] args){
		int mile1= 1; //for mile to kilo table
		double kilo1= 1;
		
		int kilo2=20; //for the kilo to mile table
		double mile2= 1;
		
		System.out.println("Miles\tKilometers | Kilometers\tMiles");
		for (;mile1<11;mile1++, kilo2+=5){ //for loop that ends at ll, increments mile q and increments kilo by 5
			kilo1=mile1*1.609; //calculation
			kilo1=(int)(kilo1*1000)/1000.0; //keeps 3 decimals
			
			mile2=kilo2*0.621; //calculation
			mile2=(int)(mile2*100)/100.0; //keeps 3 decimals
			System.out.println(mile1+"\t"+kilo1+ "\t|\t"+ kilo2 + "\t"+ mile2);
		}
	}
}