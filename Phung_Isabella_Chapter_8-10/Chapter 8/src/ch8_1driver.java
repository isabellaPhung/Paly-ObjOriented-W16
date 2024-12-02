//Isabella Phung
//Period 2
//Chapter 8.1
//int inputs, boolean inputs, and string inputs; driver class

import java.util.Scanner;

class ch8_1driver{
	public static void main(String[] args){
		int indexTracker=0;
		int ifDefaultPlayer=1;
		TeamMaker players;
		TeamMaker[] baseballTeam= TeamMaker.baseballTeam; //references baseballTeam from constructor class
		TeamMaker playerToEdit= baseballTeam[0];
		int secondUserCommand;
		
		
		while(ifDefaultPlayer!=0 && TeamMaker.numOfPlayers<=25){
			System.out.print("Would you like to create a random default player? Enter 1 for Yes, 2 for No and 0 to stop adding players."
					+ " But be aware that the program will stop you at 25 players. ");  //user enters in 1 for yes, 2 for no, 0 to stop adding players
			Scanner input = new Scanner(System.in);
			ifDefaultPlayer = input.nextInt();
			
			if(ifDefaultPlayer==1){ //creates default player
				TeamMaker defaultPlayer = new TeamMaker();
				TeamMaker.baseballTeam[indexTracker]= defaultPlayer;
				
			}
			else if (ifDefaultPlayer==2){
				System.out.print("Enter in the player's jersey number: "); //jersey number
				input = new Scanner(System.in);
				int jerseyNum = input.nextInt();
				
				System.out.print("Enter in the player's age: "); //age
				input = new Scanner(System.in);
				int playerAge = input.nextInt();
				
				System.out.print("Enter in the player's salary: "); //salary
				input = new Scanner(System.in);
				int playerSalary = input.nextInt();
				
				System.out.print("Enter in the player's position: "); //position
				input = new Scanner(System.in);
				String playerPosition = input.next();
				
				System.out.print("Enter in true or false if the player is injured: "); //position
				input = new Scanner(System.in);
				boolean ifInjured = input.nextBoolean();
				
				TeamMaker userPlayer = new TeamMaker(jerseyNum, playerAge, playerSalary, playerPosition, ifInjured); //creates object
				TeamMaker.baseballTeam[indexTracker]= userPlayer; //adds to array
			}
			
			indexTracker++;
			
		} //all code before made for making team
		
		
		
		
		//all code below to manipulate and access team
		System.out.print("What would you like to do? Enter 1 to access information about players,\n" //starting options for user
				+ "2 to change information about players, 3 for how many players are on the team, \n"
				+ "4 for the total salary, 5 for the total number of injured players, or enter 0 to quit. ");
		Scanner input = new Scanner(System.in);
		int userCommand = input.nextInt();
		
		while(userCommand!=0){
			
			if(userCommand==1){
				System.out.print("What would you like to know about your team players? Enter 1 for age, 2 for salary,\n"
						+ "3 for position, 4 for if currently injured,\n" //if user wants to access info
						+ "or enter 0 to quit. ");
				input = new Scanner(System.in);
				secondUserCommand = input.nextInt();
				
				while(secondUserCommand!=0 && userCommand!=0){
					System.out.println("Enter in the player jersey of the player you want to know about. "); //program identifies players by their jersey numbers
					for(int i=0; i<TeamMaker.numOfPlayers-1;i++){ //prints out the players and jersey numbers
						players= baseballTeam[i];
						System.out.println("Player "+players.getPlayerJersey());
					}
					input = new Scanner(System.in);
					int playerJersey = input.nextInt();
				
					for(int i=0;i<TeamMaker.numOfPlayers-1; i++){ //finds the player that the user as requested
						players= baseballTeam[i];
						if(playerJersey==players.getPlayerJersey()){
							playerToEdit= players;
						}
					}
				
				
					if(secondUserCommand==1){ //gets age
						System.out.println("The age of Player "+ playerToEdit.getPlayerJersey()+ " is "+ playerToEdit.getPlayerAge());
					}
					else if(secondUserCommand==2){ //gets salary
						System.out.println("The salary of Player "+ playerToEdit.getPlayerJersey()+ " is "+ playerToEdit.getPlayerSalary());
					}
					else if(secondUserCommand==3){ //gets position
						System.out.println("The position of Player "+ playerToEdit.getPlayerJersey()+ " is "+ playerToEdit.getPlayerPosition());
					}
					else if(secondUserCommand==4){ //checks if injured
						if(playerToEdit.isPlayerInjury()==true){
							System.out.println("Player "+ playerToEdit.getPlayerJersey()+ " is injured");
						}
						else{
							System.out.println("Player "+ playerToEdit.getPlayerJersey()+ " is not injured");
						}
					}
				
					System.out.print("What would you like to do? Enter 1 to access information about players,\n" //asks what user wants to do next
							+ "2 to change information about players, or enter 0 to quit. ");
					input = new Scanner(System.in);
					userCommand = input.nextInt();
				
				}

				
			}
			else if(userCommand==2){ //if user wants to alter info
				System.out.print("What would you like to change about your team players? Enter 1 for age, 2 for salary,\n"
						+ "3 for position, 4 for if currently injured, 5 for the player jersey, or enter 0 to quit. ");
				input = new Scanner(System.in);
				secondUserCommand = input.nextInt();
				
				while(secondUserCommand!=0 && userCommand!=0){
					System.out.println("Enter in the player jersey of the player you want to change. "); //asks user for which player to change
					for(int i=0; i<TeamMaker.numOfPlayers-1;i++){
						players= baseballTeam[i];
						System.out.println("Player "+players.getPlayerJersey()); //prints out every player jersey
					}
					input = new Scanner(System.in);
					int playerToEditJersey = input.nextInt();
				
					for(int i=0;i<TeamMaker.numOfPlayers-1; i++){ //determines the player index from the jersey entered in
						players= baseballTeam[i];
						if(playerToEditJersey==players.getPlayerJersey()){
							playerToEdit= players;
						}
					}
				
					
					if(secondUserCommand==1){
						System.out.println("Enter in the new age of Player " + playerToEdit.getPlayerJersey()+ ". ");
						input = new Scanner(System.in);
						int playerAge = input.nextInt(); 
						playerToEdit.setPlayerAge(playerAge); //changes age of player
					}
					else if(secondUserCommand==2){
						System.out.println("Enter in the new salary of Player " + playerToEdit.getPlayerJersey()+ ". ");
						input = new Scanner(System.in);
						int playerSalary = input.nextInt();
						playerToEdit.setPlayerSalary(playerSalary); //changes salary of player
					}
					else if(secondUserCommand==3){
						System.out.println("Enter in the new position of Player " + playerToEdit.getPlayerJersey()+ ". ");
						input = new Scanner(System.in);
						String playerPosition = input.next();
						playerToEdit.setPlayerPosition(playerPosition); //changes position of player
					}
					else if(secondUserCommand==4){
						System.out.println("Enter in true or false if Player " + playerToEdit.getPlayerJersey()+ " is currently injured. ");
						input = new Scanner(System.in);
						boolean playerInjury = input.nextBoolean();
						playerToEdit.setPlayerInjury(playerInjury); //changes injured state of player
					}
					else if(secondUserCommand==5){
						System.out.println("Enter in the new jersey number of Player " + playerToEdit.getPlayerJersey()+ ". ");
						input = new Scanner(System.in);
						int playerJersey = input.nextInt();
						playerToEdit.setPlayerJersey(playerJersey); //changes jersey nuber
					}
					

					System.out.print("What would you like to do? Enter 1 to access information about players,\n" //asks for next command
							+ "2 to change information about players, 3 for how many players are on the team, \n"
							+ "4 for the total salary, 5 for the total number of injured players, or enter 0 to quit. ");
					input = new Scanner(System.in);
					userCommand = input.nextInt();
				}

			}
			else if(userCommand==3){ //if user enters 3, prints amount of players
				System.out.println("There are "+ TeamMaker.numOfPlayers+ " players on your baseball team.");
			}
			else if(userCommand==4){ //totals salary
				TeamMaker.totalSalary();
			}
			else if(userCommand==5){ //totals number of injured
				TeamMaker.numOfInjured();
			}
			
			System.out.print("What would you like to do? Enter 1 to access information about players,\n" //asks for future instruction
					+ "2 to change information about players, 3 for how many players are on the team, \n"
					+ "4 for the total salary, 5 for the total number of injured players, or enter 0 to quit. ");
			input = new Scanner(System.in);
			userCommand = input.nextInt();
			
			
		
		
		}
		System.out.println("Program ended.");

		
		

		
		
	}
	
}