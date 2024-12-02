//Isabella Phung
//Period 2
//Chapter 11.1
//no expected inputs; tester driver class

import java.util.ArrayList;

class ch11_1driver{
	public static void main(String[] args){
		ArrayList<TeamMaker> baseballTeam= new ArrayList<TeamMaker>(); //creates arraylist for baseball team
		TeamMaker player1= new PositionPlayer(22, 23, 9000000, "1B", false, 100, 90, 70, 5, 20, 30, 15, 20, 4); //in terms of the specific numbers, I simply entered in random numbers. I know nothing about baseball.
		baseballTeam.add(player1);
		TeamMaker player2= new PositionPlayer(32 , 33,1000000, "3B", true, 10, 9, 4, 1, 2, 3, 2, 2, 0);
		baseballTeam.add(player2);
		TeamMaker player3= new PositionPlayer(42,34,8000000, "2B", false, 20, 15, 6, 2, 25, 39, 25, 25, 1);
		baseballTeam.add(player3);
		TeamMaker player4= new PositionPlayer(27,25,5000000, "SS", false, 90, 80, 21, 10, 32, 4,2,5,3);
		baseballTeam.add(player4);
		
		// int inningsPitched, int hitsAllowed, int walksAllowed, int runsAllowed, int wins, int losses, int gamesPlayed, int completeGames, int QualityStarts
		TeamMaker pitcher1= new StartingPitcher(72,25,12000000, "P", false, 81, 80, 21, 20, 51, 30, 100,70,60);
		baseballTeam.add(pitcher1);
		
		//int inningsPitched, int hitsAllowed, int walksAllowed, int runsAllowed, int wins, int losses, int gamesPlayed, int holds, int saves, int blownSaves
		TeamMaker pitcher2= new ReliefPitcher(12,21,1000000, "P", false, 20, 7, 3, 5, 12, 8,19,3,5,12);
		baseballTeam.add(pitcher2);
		
		//testing JerseySort
		System.out.println("Testing JerseySort:");
		System.out.println("Team before sorting:");
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			System.out.print("Player "+players.getPlayerJersey()+ ", ");
		}
		
		System.out.println("\n"+"Team after sorting:");
		PositionPlayer.jerseySort(baseballTeam);
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			System.out.print("Player "+players.getPlayerJersey()+ ", ");
		}
		
		//testing SalarySort
		System.out.println("\n"+"Testing SalarySort:");
		System.out.println("Team before sorting:");
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			System.out.print("Player "+players.getPlayerJersey()+ ", ");
		}
		
		System.out.println("\n"+"Team after sorting");
		PositionPlayer.SalarySort(baseballTeam);
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			System.out.println("Player "+players.getPlayerJersey()+ " whose salary is "+players.getPlayerSalary());
		}
		
		
		//testing batting Average
		System.out.println("Testing battingAverage:");
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			if(players instanceof PositionPlayer){
			System.out.println("Player "+players.getPlayerJersey()+ " has a batting average of "+ PositionPlayer.battingAverage(((PositionPlayer) players).getHits(), ((PositionPlayer) players).getAtBats()));
			}
		}
		
		
		//testing onBasePercentage
				System.out.println("Testing onBasePercentage:");
				for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
					TeamMaker players = baseballTeam.get(i);
					if(players instanceof PositionPlayer){
					System.out.println("Player "+players.getPlayerJersey()+ " has a base percentage of "+ PositionPlayer.onBasePercentage(((PositionPlayer) players).getHits(), ((PositionPlayer) players).getWalks(), ((PositionPlayer) players).getHitByPitch(),((PositionPlayer) players).getAtBats()));
					}
				}
		
		
		//testing onBasePercentage
		System.out.println("Testing sluggingPercentage:");
		for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
			TeamMaker players = baseballTeam.get(i);
			if(players instanceof PositionPlayer){
			System.out.println("Player "+players.getPlayerJersey()+ " has a slugging average of "+ PositionPlayer.sluggingPercentage(((PositionPlayer) players).getHits(), ((PositionPlayer) players).getDoubles(),((PositionPlayer) players).getTriples(),((PositionPlayer) players).getHomeRuns(), ((PositionPlayer) players).getAtBats()));
			}
		}
		
		
		//testing whip
		System.out.println("Testing whip:");
		System.out.println(Pitcher.whip(2,3,4));
		
		
		//testing era
		System.out.println("Testing era:");
		System.out.println(Pitcher.era(2,3));
		
		
	}
}