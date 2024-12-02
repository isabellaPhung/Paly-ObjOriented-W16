//Isabella Phung
//Period 2
//Project 4.41
//one expected input; int

import java.util.Scanner;

public class ch4_43{
	public static void main(String[] args){
		System.out.print("Enter in the amount of seconds. For example, 10: ");
		Scanner input = new Scanner(System.in);
		int userSeconds = input.nextInt(); //string to int
		long seconds= (System.currentTimeMillis())/1000; //starting time from when the the user enters in the value
		long newUserSeconds= seconds+userSeconds; //determines the amount of seconds from the beginning of day to current time
		long tempVal=0;
		int timesInitialized=0;
		int numberOfSec=0;

		tempVal= seconds;
		for(long i=(System.currentTimeMillis())/1000; i<newUserSeconds;i=(System.currentTimeMillis())/1000){ //value i constantly changes to the current time
			if(tempVal!= i){ //if original time is different from new time
				tempVal++; //the original time is incremented up by one second
				timesInitialized++; //adds to times initialized
				numberOfSec=userSeconds-timesInitialized; //the number of seconds is determined from the new value of seconds
				System.out.println(numberOfSec+ " seconds remaining.");
			}
		}
		System.out.println("Stopped."); //when done, print stopped
	}
}