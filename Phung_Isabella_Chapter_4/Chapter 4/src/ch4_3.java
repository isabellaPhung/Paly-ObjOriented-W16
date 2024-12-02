//Isabella Phung
//Period 2
//Project 4.3
//no expected inputs

public class ch4_3{
	public static void main(String[] args){
		double pound= 1;
		
		System.out.println("Kilograms\tPounds");
		for (int kilo= 1;kilo<200;kilo+=2){ //for loop that ends before 200 and increments by 2
			pound=kilo*2.2; //calculation
			pound=(int)(pound*10)/10.0; //ensures one decimal
			
			System.out.println(kilo+"\t\t"+pound);
		}
	}
}