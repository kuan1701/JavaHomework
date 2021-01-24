/**
 *
 *   DayOfMonth implements an application that simply displays a message
 * about whether the month has the day that the user entered..
 *   The program asks the user to enter the ordinal number of the month,
 * then determines which month it is.
 *   Then the program asks the user to enter the day of the month,
 * and determines if this day is in the month that the user entered.
 *   After that, it displays a message to the user about whether this day
 * is in the month.
 *
 * @version 15.0.1
 */

package Homework_2;

import java.util.Scanner;

public class DayOfMonth {
	
	public static void main(String[] args) {
		
		// Using the Scanner class
		Scanner num = new Scanner(System.in);
		
		int monthNumber;
		int dayOfTheMonth;
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Loop for the user to enter the desired number
		do {
			System.out.println("Please enter month number!");
			monthNumber = num.nextInt();
		} while (monthNumber > 12 || monthNumber <= 0);
		
		// Determine which month the user entered
		switch (monthNumber) {
			case (1):
				System.out.println("Your month is January!");
				break;
			
			case (2):
				System.out.println("Your month is February!");
				break;
				
			case (3):
				System.out.println("Your month is March!");
				break;
				
			case (4):
				System.out.println("Your month is April!");
				break;
				
			case (5):
				System.out.println("Your month is May!");
				break;
				
			case (6):
				System.out.println("Your month is June!");
				break;
				
			case (7):
				System.out.println("Your month is July!");
				break;
			case (8):
				System.out.println("Your month is August!");
				break;
				
			case (9):
				System.out.println("Your month is September!");
				break;
				
			case (10):
				System.out.println("Your month is October!");
				break;
				
			case (11):
				System.out.println("Your month is November!");
				break;
				
			case (12):
				System.out.println("Your month is Decembery!");
				break;
				
			default:
				System.out.println("There is no such month!");
		}
		
		// Entering the day of the month
		System.out.println("Please enter day of the month!");
		dayOfTheMonth = num.nextInt();
		
		// Displaying a message
		String msg = (dayOfTheMonth <= months[monthNumber - 1] && dayOfTheMonth > 0) ? "This number is in the month!" : "There is no such date in the month!";
		System.out.println(msg);
		
		num.close();
	}
}
