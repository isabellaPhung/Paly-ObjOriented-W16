//Isabella Phung
//Period 2
//Chapter 10.2
//int inputs as well as boolean inputs; driver class

import java.util.Scanner;


public class ch10_2driver{
	public static void main(String[] args){
		double area;
		double perimeter;
		System.out.print("Enter in the coordinates for the elipse's center. For example, 3 2 : "); //coordinates for center. two ints
		Scanner input = new Scanner(System.in);
		int centerX = input.nextInt();
		int centerY = input.nextInt();
		
		System.out.print("Is the orientation of the elipse horizontal? Enter in true or false: "); //horizontal or vertical orientation. boolean
		input = new Scanner(System.in);
		boolean ifHorizontal = input.nextBoolean();
		
		System.out.print("Enter in the length of the major axis and minor axis. For example, 11 7. "); //lengths of major and minor axis. two ints
		input = new Scanner(System.in);
		int majorAxisLength = input.nextInt();
		int minorAxisLength = input.nextInt();
			
		Elipse userElipse = new Elipse(centerX, centerY, ifHorizontal, majorAxisLength, minorAxisLength); //creates an elipse
		
		
		System.out.print("What would you like to do? Enter 1 to calculate the area,\n" //all the different options for user
				+ "2 to calculate the perimeter, 3 to print the center,\n"
				+ "4 to print the major axis length, 5 to print the minor axis length, \n"
				+ "6 to print the orientation, 7 to print the amount of elipses made, \n"
				+ "8 to edit the elipse, 9 to create a new elipse, 10 to check if a point is in your elipse, \n"
				+ "or enter 0 to quit. ");
		
		input = new Scanner(System.in);
		int userCommand = input.nextInt();
		
		while(userCommand!=0){ //while userCommand is not zero
			if(userCommand==1){ //if userCommand is zero, return area
				area=getArea(userElipse); //uses getArea method
				System.out.println("The area of the elipse is "+ area);
			}

			else if(userCommand==2){ //if userCommand is 2, return perimeter
				perimeter=getPerimeter(userElipse); //uses getPerimeter method
				System.out.println("The perimeter of the elipse is "+ perimeter);
			}
			else if(userCommand==3){ //if userCommand is 3, return center values
				System.out.println("The center is ("+userElipse.getCenterX()+", "+userElipse.getCenterY()+").");
			}
		
			else if(userCommand==4){ //if userCommand is 4, return major axis
				System.out.println("The length of the major axis is "+userElipse.getMajorAxis()+".");
			}
			else if(userCommand==5){ //if userCommand is 5, return minor axis
				System.out.println("The length of the minor axis is "+userElipse.getMinorAxis()+".");
			}
			
			else if(userCommand==6){ //if userCommand is 6, return orientation of elipse
				if(userElipse.isOrientation()==true){ //if the value of orientation is true, it is horizontal
					System.out.println("The current orientation of your elipse is horizontal.");
				}
				else{ //if not, it is vertical
					System.out.println("The current orientation of your elipse is vertical.");
				}
				
			}
			
			else if(userCommand==7){ //if userCommand is 7, returns amount of elipses made
				System.out.println("You have made "+userElipse.getNumOfElipses()+" elipses.");
			}
			
			else if(userCommand==8){ //if userCommand is 8, will ask for edits
				System.out.println("What would you like to edit? Press 1 for the center, 2 for the major axis, \n"
						+ "3 for the minor axis, 4 for the orientation, or enter 0 to quit.");
				input = new Scanner(System.in);
				int userEditCommand = input.nextInt();
				if(userEditCommand==0){ //if the edit command is 0, then break
					break;
				}
				else if(userEditCommand==1){ //if edit command is 1, then ask for new center
					System.out.println("Enter in the coordinates for the elipse's center. For example, 3 2 : "); //new coords of center. two ints
					input = new Scanner(System.in);
					centerX = input.nextInt();
					centerY = input.nextInt();
					userElipse.setCenterX(centerX); //sets new coords
					userElipse.setCenterY(centerY);
				}
				else if(userEditCommand==2){ //if edit command is 2, then ask for new major axis
					System.out.println("Enter in the length of the major axis. For example, 11. "); //new length of major axis. int
					input = new Scanner(System.in);
					majorAxisLength = input.nextInt();
					userElipse.setMajorAxis(majorAxisLength); //sets new length
				}
				else if(userEditCommand==3){ //if edit command is 3, then ask for new minor axis
					System.out.println("Enter in the length of the minor axis. For example, 5. "); //new length of minor axis. int
					input = new Scanner(System.in);
					minorAxisLength = input.nextInt();
					userElipse.setMinorAxis(minorAxisLength);
				}
				else if(userEditCommand==4){ //if edit command is 4, then ask to reverse orientation of elipses
					System.out.println("Would you like to reverse the orientation of your elipse? Enter true if you want to do so and false if not. "); //reversing orientation. bool
					input = new Scanner(System.in);
					boolean reverseOrientation = input.nextBoolean();
					if(reverseOrientation==true){ //if user enters in true
						if(userElipse.isOrientation()==true){ //if orientation is horizontal
							userElipse.setOrientation(false); //switches to vertical
						}
						else{
							userElipse.setOrientation(true); //if user enters in false, then it switches it to horizontal
						}
					}
				}
				
				
			}
			
			else if(userCommand==9){ //asks for new information about new elipse
				System.out.print("Enter in the coordinates for the elipse's center. For example, 3 2 : "); //coordinates for center. two ints
				input = new Scanner(System.in);
				centerX = input.nextInt();
				centerY = input.nextInt();
				
				System.out.print("Is the orientation of the elipse horizontal? Enter in true or false: "); //orientation of elipse. boolean
				input = new Scanner(System.in);
				ifHorizontal = input.nextBoolean();
				
				System.out.print("Enter in the length of the major axis and minor axis. For example, 11 7. "); //length of major and minor axis. two ints
				input = new Scanner(System.in);
				majorAxisLength = input.nextInt();
				minorAxisLength = input.nextInt();
					
				userElipse = new Elipse(centerX, centerY, ifHorizontal, majorAxisLength, minorAxisLength); //sets new elipse
			}
			
			else if(userCommand==10){
				int pointX;
				int pointY;
				System.out.print("Enter in the coordinates for the point to check. For example, 2 2 : "); //names of 5 different accounts. String
				input = new Scanner(System.in);
				pointX = input.nextInt();
				pointY = input.nextInt();
				
				contains(userElipse, pointX, pointY);
			}
		
			System.out.print("What would you like to do? Enter 1 to calculate the area,\n" //asks for options again
					+ "2 to calculate the perimeter, 3 to print the center,\n"
					+ "4 to print the major axis length, 5 to print the minor axis length, \n"
					+ "6 to print the orientation, 7 to print the amount of elipses made, \n"
					+ "8 to edit the elipse, 9 to create a new elipse, 10 to check if a point is in your elipse, \n"
				+ "or enter 0 to quit. ");
			input = new Scanner(System.in);
			userCommand = input.nextInt();
		
		
		}
		System.out.println("Program ended.");

		
		
	}
		
	public static double getArea(Elipse userElipse){ //finds area
		double area;
		area= Math.PI*(userElipse.getMajorAxis()/2)*(userElipse.getMinorAxis()/2);
		return area;
	}
	
	public static double getPerimeter(Elipse userElipse){ //finds perimeter
		double perimeter;
		perimeter= 2*Math.PI*Math.sqrt((Math.pow(userElipse.getMajorAxis()/2, 2)+Math.pow(userElipse.getMinorAxis()/2, 2))/2);
		return perimeter;
	}
	
	public static void contains(Elipse userElipse, int x, int y){ //finds if point is inside of elipse
		double inElipse;
		int a= userElipse.getMajorAxis()/2;
		int b= userElipse.getMinorAxis()/2;
		int h= userElipse.getCenterX();
		int k= userElipse.getCenterY();
		
		inElipse= ( Math.pow((x-h),2) / Math.pow(a, 2) )  +  ( Math.pow((y-k),2) / Math.pow(b, 2) );
		
		if(inElipse<=1){ //if point is inside, then it is in elipse
			System.out.println("The point ("+ x+ ", "+ y+") is in the elipse.");
		}
		else{ //if point is not inside, then it is not in elipse
			System.out.println("The point ("+ x+ ", "+ y+") is not in the elipse.");
		}
		return;
	}
	
	
}
	