import java.util.ArrayList;

//Isabella Phung
//Period 2
//Chapter 8.1
//no expected inputs; constructor class

class TeamMaker{
	int playerJersey; //data fields
	int playerAge;
	int playerSalary;
	String playerPosition;
	boolean playerInjury;
	static ArrayList<TeamMaker> userBaseballTeam = new ArrayList<TeamMaker>(); //arraylist for baseball players
	static int numOfPlayers=1; //tracks num of players
	
	
	TeamMaker(int num, int age, int salary, String position, boolean injury) { //for user player
		playerJersey=num;//assigning data fields
		playerAge=age;
		playerSalary=salary;
		playerPosition=position;
		playerInjury=injury;
		
		numOfPlayers++; //keeps track of number of players
	  }
	
	
	
	TeamMaker(){ //for default player
		playerJersey=(int)(Math.random()*100); //jersey number
		
		playerAge=(int)(16+Math.random()*50); //age

		int value=(int)(1000000+ Math.random()*50000000); //salary
		playerSalary=value-(value%1000000);;
		
		int randomVal= (int)(Math.random()*10); //random value
		switch(randomVal){ //based off of the random value, it will choose a position for the default player
		case 1:
			playerPosition="P";
			break;
		case 2:
			playerPosition="C";
			break;
		case 3:
			playerPosition="1B";
			break;
		case 4:
			playerPosition="2B";
			break;
		case 5:
			playerPosition="3B";
			break;
		case 6:
			playerPosition="SS";
			break;
		case 7:
			playerPosition="OF";
			break;
		case 8:
			playerPosition="RP";
			break;
		default:
			playerPosition="C";
		}
		
		playerInjury=false; //automatically keeps as uninjured
		
		numOfPlayers++; //keeps track of number of players
	}
	
	
	
	public static void totalSalary(){ //determines salary average of team
		int total = 0;
		int firstTwoNums=0;
		
		for(int i=0;i<numOfPlayers-1;i++){ //totals salaries
			TeamMaker player= userBaseballTeam.get(i);
			total+=player.getPlayerSalary();
		}
		firstTwoNums=total/1000000; //finds first few values
		System.out.println("The total salary of the baseball team is $"+ firstTwoNums+ " million.");
		return;
	}
	
	
	
	public static void numOfInjured() { //determines number of injured players
		int numInjuredPlayers = 0;
		boolean ifInjured;
		for(int i=0;i<numOfPlayers-1;i++){
			TeamMaker player= userBaseballTeam.get(i);
			ifInjured= player.isPlayerInjury();
			if(ifInjured==true){ //if the player is injured, increment numInjuredPlayers by 1
				numInjuredPlayers++;
			}
		}
		System.out.println("There are "+ numInjuredPlayers+ " injured players.");
		return;
	}

	//getters
	public int getPlayerJersey() {
		return playerJersey;
	}

	public int getPlayerAge() {
		return playerAge;
	}
	
	public int getPlayerSalary() {
		return playerSalary;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}
	
	public boolean isPlayerInjury() {
		return playerInjury;
	}
	
	public static ArrayList<TeamMaker> getBaseballTeam() {
		return userBaseballTeam;
	}

	public static int getNumOfPlayers() {
		return numOfPlayers;
	}
	
	//setters

	public void setPlayerJersey(int playerJersey) {
		this.playerJersey = playerJersey;
	}
	
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public void setPlayerSalary(int playerSalary) {
		this.playerSalary = playerSalary;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}
	
	public void setPlayerInjury(boolean playerInjury) {
		this.playerInjury = playerInjury;
	}

}
