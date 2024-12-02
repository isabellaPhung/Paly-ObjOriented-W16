//Isabella Phung
//Period 2
//Chapter 6_1, 6_2, 6_3
//two expected inputs; int for first input; doubles or ints for second input, each separated by a space.


import java.util.Scanner;

public class ch6_1{
	public static void main(String[] args){
		double median;
		int[] letterGrade;
		int medianIndex;
		double skew;
		
		System.out.print("Enter in the amount of scores to be inputed. For example, 6: "); //amount of scores. int
		Scanner input = new Scanner(System.in);
		int amountOfScore = input.nextInt();
		
		
	
		System.out.print("Enter in the scores, each separated by a space. For example, 55 70 63 88 92 85: "); //scores. doubles or ints
		Scanner input1 = new Scanner(System.in);
		double[] scores= new double[amountOfScore]; //initializes list
		for(int i = 0; i< amountOfScore; i++){ //puts values into list
			scores[i]=input1.nextDouble();
		}
		
		java.util.Arrays.sort(scores); //sorts array
		
		
		if(amountOfScore%2==0){ //determines how to find array based off of how many values are in the list
			medianIndex= (amountOfScore/2)-1; //finding median
			int medianIndex2= medianIndex+1;
			median=evenMedian(scores, medianIndex, medianIndex2);
		}
		else{
			medianIndex= amountOfScore/2; //finding median
			median=scores[medianIndex];
		}

		double curve= Math.abs(80-(median)); //calculates curve
		
		double[] newScores= new double[amountOfScore];;
		System.arraycopy(scores, 0, newScores, 0, scores.length); //copies into new array
		
		for(int b = 0; b< amountOfScore; b++){ //changes each value
			newScores[b]=newScores[b]+curve;
		}
		
		System.out.print("Scores: ");
		for(double score: newScores){ //prints score
			if(score>100){ //ensures that no score is above 100
				score=100;
			}
			System.out.print(score+ " ");
		}
		
		letterGrade= gradeFinder(newScores);
		
		printFrequencyTable(letterGrade);
		
		skew= skewFinder(medianIndex, newScores); //finds skew
		System.out.println("Skew: "+ skew);
		
		if(skew<0){ //determines the type of skew
			System.out.println("The data is left skewed.");
		}
		else if (skew==0){
			System.out.println("The data is symetrical.");
		}
		else{
			System.out.println("The data is right skewed.");
		}
		
	}

	
	public static double evenMedian(double[] scores, int indexValue1, int indexValue2){ //finds median for even amounts of score
		double median1;
		double median2;
		double medianValue;
		median1= scores[indexValue1]; //first median
		median2= scores[indexValue2]; //second median
		medianValue= (median1+median2)/2; //finds average
		return medianValue;
	}
	
	public static int[] gradeFinder(double[] newScores){
		int aPlus = 0;
		int a = 0;
		int aMinus = 0;
		int bPlus = 0;
		int b = 0;
		int bMinus = 0;
		int cPlus = 0;
		int c = 0;
		int cMinus = 0;
		int dPlus = 0;
		int d = 0;
		int dMinus = 0;
		int f = 0;
		
		for(double scores: newScores){ //checks each score and increments by a value for each score depending on the grade of the score
			if(scores>=96){
				aPlus++;
			}
			else if(scores>=92){
				a++;
			}
			else if(scores>= 87.5){
				aMinus++;
			}
			else if(scores>=83.5){
				bPlus++;
			}
			else if(scores>=80.0){
				b++;
			}
			else if(scores>=76.5){
				bMinus++;
			}
			else if(scores>=72.5){
				cPlus++;
			}
			else if(scores>=69.0){
				c++;
			}
			else if(scores>=65.5){
				cMinus++;
			}
			else if(scores>= 61.0){
				dMinus++;
			}
			else if(scores>=58.0){
				d++;
			}
			else if(scores>=54.5){
				dMinus++;
			}
			else{
				f++;
			}
		}
		int[] numOfScores= {aPlus,a,aMinus,bPlus,b,bMinus,cPlus,c,cMinus,dPlus,d,dMinus,f}; //creates list
		return numOfScores;
	}
	
	public static void printFrequencyTable(int[] letterGrades){
		System.out.println("");
		for(int i= 0; i<100; i++){ //separating lines
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.print("| Grade    |  A+  |  A   |  A-  |  B+  |  B   |  B-  |  C+  |  C   |  C-  |  D+  |  D   |  D-  |  F   |");
		
		System.out.println("");
		for(int i= 0; i<100; i++){ //separating lines
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.print("| Frequency|  "); //prints frequency of grades
		for(int value:letterGrades){
			System.out.print(value+ "   |  ");
		}
		
		System.out.println("");
		for(int i= 0; i<100; i++){ //separating lines
			System.out.print("-");
		}
		System.out.println("");
	}
	
	public static double skewFinder(int medianIndex, double[] scores){
		int lowerMedianIndex;
		int upperMedianIndex;
		double lowerMedian;
		double upperMedian;
		double skew;
		
		lowerMedianIndex= medianIndex/2; //finds the lowerMedian Index
		upperMedianIndex=medianIndex+lowerMedianIndex+1; //finds the upperMedianIndex
		
		lowerMedian= scores[lowerMedianIndex]; //finds lower median using lowerMedianIndex
		upperMedian= scores[upperMedianIndex]; //finds upper median using upperMedianIndex
		
		skew=(upperMedian+lowerMedian-(2*80))/(upperMedian-lowerMedian); //calculates skew

		return skew;
	}
	
}