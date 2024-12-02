//Isabella Phung
//Period 2
//Project 4.5
//no expected inputs

public class ch4_5{
	public static void main(String[] args){
		double pound1= 1; //for pound to kilo
		int kilo1= 1;
		
		double kilo2=1; //for killo to pound
		int pound2= 20;
		
		System.out.println("Kilograms\tPounds | Pounds\tKilograms");
		for (;kilo1<200;kilo1+=2, pound2+=5){ //ends before 200; increments kilo by 2, pound by 5
			pound1=kilo1*2.2; //calculation
			pound1=(int)(pound1*10)/10.0;//ensures there is one decimal
			
			kilo2=pound2*0.453; //calculation
			kilo2=(int)(kilo2*100)/100.0; //ensures there are two decimals
			System.out.println(kilo1+"\t"+pound1+ "\t|\t"+ pound2 + "\t"+ kilo2);
		}
	}
}