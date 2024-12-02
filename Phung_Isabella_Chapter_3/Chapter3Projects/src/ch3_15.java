//Isabella Phung
//Per 2
//Project 3.15
//1 input expected, must be int

import java.util.Scanner;

public class ch3_15{
	public static void main(String[] args){
		int lottery=(int)(Math.random()*1000); //generates random number
		
		Scanner input= new Scanner(System.in); //gathers user input
		System.out.print("Enter your lottery (pick three digits): ");
		int userGuess= input.nextInt();
		
		int tempNum=lottery;
		int lotteryDigit1=lottery/100; //finds lottery number digits by dividing and finding remainders
		tempNum= lottery %100;
		int lotteryDigit2=tempNum/10;
		int lotteryDigit3= tempNum %10;
		
		tempNum=userGuess;
		int guessDigit1=userGuess/100; //finds user digit number digits by dividing and finding remainders
		tempNum= userGuess %100;
		int guessDigit2=tempNum/10;
		int guessDigit3= tempNum %10;
		
		System.out.println("The lottery number is " + lottery);
		
		if(userGuess == lottery){
			System.out.println("Exact match: you win $10,000."); //if user gets it perfectly right
		}
		
		else if ((lotteryDigit1== guessDigit3 && lotteryDigit2== guessDigit1 && lotteryDigit3== guessDigit2) //all possibilities for matching the different digits
				|| (lotteryDigit1== guessDigit2 && lotteryDigit2== guessDigit3 && lotteryDigit3== guessDigit1)
				|| (lotteryDigit1== guessDigit3 && lotteryDigit2== guessDigit2 && lotteryDigit3== guessDigit1)
				|| (lotteryDigit1== guessDigit2 && lotteryDigit2== guessDigit1 && lotteryDigit3== guessDigit3)
				|| (lotteryDigit1== guessDigit1 && lotteryDigit2== guessDigit3 && lotteryDigit3== guessDigit2)){
			System.out.println("Match all digits: you win $3,000.");
		}
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || 
				guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 ||  //all possibilities for matching one digit
				guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3){
			System.out.println("Match at least one digit: you win $1,000.");
		}
		else{
			System.out.println("Sorry, no match."); //if user doesn't match it
		}
	}
}
