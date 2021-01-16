/**
 *
 *   GuessTheNumber implements an application that simply displays the
 * computer-guessed number entered by the user.
 *   The program asks the user for an integer value from 0 to 100.
 *   Then the computer uses a loop to select a number equal to the number
 * entered by the user.
 *   Displays a message in which the number entered by the user is written,
 * and the number of attempts for which the computer found this number.
 *
 * @version 15.0.1
 */

package HomeWork_2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	//Using the Random class
	public static final Random RND = new Random();
	
	public static void main(String[] args) {
		
		//Using the Scanner class
		Scanner num = new Scanner(System.in);
		
		System.out.println("Please a enter your number between 0 and 100!!");
		
		int userNum = num.nextInt();
		int compNum;
		int count = 0;
		
		//Checking the number entered by user
		if (userNum > 100) {
			System.out.println("You entered a number greater than 100!!!");
		} else if (userNum < 0) {
			System.out.println("You entered a number less than 0!!!");
		} else {
			
			//Loop for guessing the number entered by user
			do {
				count++;
				compNum = RND.nextInt(100);
			} while (compNum != userNum);
			
			System.out.println("Your number is: " + compNum);
			System.out.println("I got it right on " + count + " try.");
			
		}
		num.close();
	}
}

