//Isabella Phung
//Period 2
//Chapter 11.1
//no expected inputs; constructor class

import java.util.ArrayList;

class PositionPlayer
	extends TeamMaker{
	int gamesPlayed;
	int atBats; //data fields
	int hits;
	int walks;
	int runs;
	int doubles;
	int triples;
	int homeRuns;
	int hitByPitch;
	
	PositionPlayer(){ //default player
		playerJersey=3;
		playerAge=22;
		playerSalary=9000000;
		playerPosition="SS"; 
		playerInjury=false;
		
		gamesPlayed=0;
		atBats=0;
		hits= 0;
		walks=0;
		runs= 0;
		doubles= 0;
		triples= 0;
		homeRuns= 0;
		hitByPitch= 0;
	}
	
	//normal constructor
	PositionPlayer(int num, int age, int salary, String position, boolean injury, int gamesPlayed, int atBats, int hits, int walks, int runs, int doubles, int triples, int homeRuns, int hitByPitch){
		playerJersey=num;
		playerAge=age;
		playerSalary=salary;
		playerPosition=position;
		playerInjury=injury;
		
		this.gamesPlayed=gamesPlayed;
		this.atBats=atBats;
		this.hits= hits;
		this.walks= walks;
		this.runs= runs;
		this.doubles= doubles;
		this.triples= triples;
		this.homeRuns= homeRuns;
		this.hitByPitch= hitByPitch;
	}
	
	//calculates batting average
	static double battingAverage(double hits , double atBats){
		double battingAverage;
		battingAverage= hits/atBats;
		battingAverage=(int)(battingAverage*1000)/1000.0; //ensures 3 decimal points after
		return battingAverage;
	}
	
	//calculates base percentage
	static double onBasePercentage(double hits, double walks, double hitByPitches, double atBats){
		double onBasePercentage;
		onBasePercentage=(hits+walks+hitByPitches)/(atBats+walks+hitByPitches);
		onBasePercentage=(int)(onBasePercentage*1000)/1000.0; //ensures 3 decimal points after
		return onBasePercentage;

	}
	
	//calculates sluggingPercentage
	static double sluggingPercentage(double hits, double doubles, double triples, double homeRuns, double atBats){
		double singles= hits-(doubles+triples+homeRuns);
		double sluggingPercentage=(singles + doubles *2+triples*3+homeRuns*4)/atBats;
		sluggingPercentage=(int)(sluggingPercentage*1000)/1000.0; //ensures 3 decimal points after
		return sluggingPercentage;
	}
	
	//sorts arrayList by jersey number using the select switch method
	static void jerseySort(ArrayList<TeamMaker> baseballTeam){
		int j=0;
		for(int i=0;i<baseballTeam.size()-1;i++){ //i starts as the first jersey value
			TeamMaker currentMinJersey= (baseballTeam.get(i));
			int currentMinIndex= i;
			
			for(j=i+1;j<baseballTeam.size();j++){ //j starts as the second jersey value
				//if j's jersey is smaller than i's jersey, min changes
				if(currentMinJersey.getPlayerJersey()> baseballTeam.get(j).getPlayerJersey()){
					currentMinJersey= baseballTeam.get(j);
					currentMinIndex= j;
				}
			}
			
			//if the min is different from i, swap
			if (currentMinIndex != i){
				baseballTeam.set(currentMinIndex, baseballTeam.get(i));
				baseballTeam.set(i, currentMinJersey);
			}
		}
	}
	
	//sorts arrayList by salary using the select switch method
	static void SalarySort(ArrayList<TeamMaker> baseballTeam){
		int j=0;
		for(int i=0;i<baseballTeam.size()-1;i++){ //i starts as the first jersey value
			TeamMaker currentMinSalary= (baseballTeam.get(i));
			int currentMinIndex= i;
			
			for(j=i+1;j<baseballTeam.size();j++){ //j starts as the second jersey value
				//if j's jersey is smaller than i's jersey, min changes
				if(currentMinSalary.getPlayerSalary()> baseballTeam.get(j).getPlayerSalary()){
					currentMinSalary= baseballTeam.get(j);
					currentMinIndex= j;
				}
			}
			
			//if the min is different from i, swap
			if (currentMinIndex != i){
				baseballTeam.set(currentMinIndex, baseballTeam.get(i));
				baseballTeam.set(i, currentMinSalary);
			}
		}
	}

	//getters and setters
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getWalks() {
		return walks;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public int getHitByPitch() {
		return hitByPitch;
	}

	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}
	
	
	
	
}





class Pitcher
	extends TeamMaker{
	int inningsPitched; //datafields
	int hitsAllowed;
	int walksAllowed;
	int runsAllowed;
	int wins;
	int losses;
	int gamesPlayed;
	
	
	Pitcher(){ //default constructor
		inningsPitched=0;
		hitsAllowed=0;
		walksAllowed=0;
		runsAllowed=0;
		wins=0;
		losses=0;
		gamesPlayed=0;
	}
	
	//calculates whip
	static double whip(double walksAllowed, double hitsAllowed, double inningsPitched){
		double whip;
		whip= (walksAllowed+hitsAllowed)/inningsPitched;
		whip=(int)(whip*1000)/1000.0;  //ensures 3 decimal points after
		return whip;
	}
	
	//calculates era
	static double era(double runsAllowed, double inningsPitched){
		double era;
		era=(runsAllowed*9)/inningsPitched;
		era=(int)(era*1000)/1000.0;  //ensures 3 decimal points after
		return era;
	}
}

//subclass of pitcher
class StartingPitcher
	extends Pitcher{
	int completeGames; //data fields
	int QualityStarts;
	
	//normal constructor
	StartingPitcher(int num, int age, int salary, String position, boolean injury, int inningsPitched, int hitsAllowed, int walksAllowed, int runsAllowed, int wins, int losses, int gamesPlayed, int completeGames, int QualityStarts){
		playerJersey=num;
		playerAge=age;
		playerSalary=salary;
		playerPosition=position;
		playerInjury=injury;
		
		this.inningsPitched= inningsPitched;
		this.hitsAllowed= hitsAllowed;
		this.walksAllowed= walksAllowed;
		this.runsAllowed= runsAllowed;
		this.wins= wins;
		this.losses= losses;
		this.gamesPlayed= gamesPlayed;
		this.completeGames= completeGames;
		this.QualityStarts=  QualityStarts;
		
	}

	//getters and setters
	public int getCompleteGames() {
		return completeGames;
	}

	public void setCompleteGames(int completeGames) {
		this.completeGames = completeGames;
	}

	public int getQualityStarts() {
		return QualityStarts;
	}

	public void setQualityStarts(int qualityStarts) {
		QualityStarts = qualityStarts;
	}
	
}

//extends Pitcher
class ReliefPitcher
	extends Pitcher{
	int holds; //data fields
	int saves;
	int blownSaves;
	
	//normal constructor
	ReliefPitcher(int num, int age, int salary, String position, boolean injury, int inningsPitched, int hitsAllowed, int walksAllowed, int runsAllowed, int wins, int losses, int gamesPlayed, int holds, int saves, int blownSaves){
		playerJersey=num;
		playerAge=age;
		playerSalary=salary;
		playerPosition=position;
		playerInjury=injury;
		
		this.inningsPitched= inningsPitched;
		this.hitsAllowed= hitsAllowed;
		this.walksAllowed= walksAllowed;
		this.runsAllowed= runsAllowed;
		this.wins= wins;
		this.losses= losses;
		this.gamesPlayed= gamesPlayed;
		this.holds=  holds;
		this.saves=  saves;
		this.blownSaves= blownSaves;
		
	}

	//getters and setters
	public int getHolds() {
		return holds;
	}

	public void setHolds(int holds) {
		this.holds = holds;
	}

	public int getSaves() {
		return saves;
	}

	public void setSaves(int saves) {
		this.saves = saves;
	}

	public int getBlownSaves() {
		return blownSaves;
	}

	public void setBlownSaves(int blownSaves) {
		this.blownSaves = blownSaves;
	}
	
}