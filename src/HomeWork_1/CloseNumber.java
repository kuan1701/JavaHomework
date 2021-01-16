/**
 * CloseNumber implements an application that simply displays if a user-entered
 * number is close to a random number within 10%, the program accepts one random
 * numbers and one number entered by the user. Based on a random number, a range
 * of values is calculated, which must include the number entered by user standard
 * output to the console.
 *
 * @version 15.0.1
 */

package src.hw01;

import javax.swing.*;

public class CloseNumber {
	
	public static void main(String[] args) {
		
		// Percentage field
		int percent = 10;
		
		// Fields for determining a range of close values of a given number
		double randNum = Math.random() * 100;
		double firstNumRange = randNum - randNum / percent;
		double secondNumRange = randNum + randNum / percent;
		
		// User value
		double testUserNum;
		String userNum = JOptionPane.showInputDialog(null, "Enter the number");
		
		// Displaying a random number
		System.out.println("Random number entered: " + randNum + ".");
		
		//Checking the entered value
		if (userNum != null && !userNum.equals("")) {
			
			try {
				testUserNum = Double.parseDouble(userNum);
				
				if (testUserNum > firstNumRange && testUserNum < secondNumRange) {
					System.out.println("The number entered by the user is close in value to the specified number");
				}
				else {
					System.out.println("The number entered by the user is not close in value to the specified number");
				}
			}
			
			catch (Exception e) {
				System.out.println("You entered a non-numeric value!");
			}
		}
		
		if (userNum == null || userNum.equals("")) {
			System.out.println("You haven't entered anything");
		}
	}
}
