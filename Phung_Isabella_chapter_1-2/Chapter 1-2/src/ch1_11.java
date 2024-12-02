//Isabella Phung
//Period 2
//Project 1.11
//no expected inputs

public class ch1_11{
	public static void main(String[] args){
		int population= 312032486; //starting population
		int seconds = 31536000; //seconds in a year
		int birth= seconds/7; //birth rate
		int death= seconds/13; //death rate
		int immigrant= seconds/45; //immigrant rate
		int netGrowth= birth + immigrant- death; //net growth
		
		population= population + netGrowth; //year 1 from start
		System.out.println("Year 1 population: "+ population);
		
		population= population + netGrowth; //year 2
		System.out.println("Year 2 population: "+ population);
		
		population= population + netGrowth; //year 3
		System.out.println("Year 3 population: "+ population);
		
		population= population + netGrowth; //year 4
		System.out.println("Year 4 population: "+ population);
		
		population= population + netGrowth; //year 5
		System.out.println("Year 5 population: "+ population);
		
	}
}