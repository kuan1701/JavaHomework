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
		
		int[] dayInAMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] months = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		
		// Loop for the user to enter the desired number
		do {
			System.out.println("Please enter month number!");
			monthNumber = num.nextInt();
		} while (monthNumber > 12 || monthNumber <= 0);
		
		// Determine which month the user entered
		String month = ((monthNumber - 1) <= months.length) ?
				"Your month is " +  months[(monthNumber - 1)] + "." : "There is no such month!";
		System.out.println(month);
		
		// Entering the day of the month
		System.out.println("Please enter day of the month!");
		dayOfTheMonth = num.nextInt();
		
		// Displaying a message
		String msg = (dayOfTheMonth <= dayInAMonth[monthNumber - 1] && dayOfTheMonth > 0) ? "This number is in the month!" : "There is no such date in the month!";
		System.out.println(msg);
		
		num.close();
	}
}
