//Isabella Phung
//Period 2
//Project 1.9
//no expected inputs

public class ch1_9{
	public static void main(String[] args){
		double width= 4.5; //set values
		double length= 7.9;
		
		double area= width * length; //area
		area= (int)(area*100)/100.0; //cuts it off at 2 decimal points
		
		double perimeter= (2*width) + (2*length); //perimeter
		System.out.println("Area: "+ area);
		System.out.println("Perimeter: "+ perimeter);
	}
}