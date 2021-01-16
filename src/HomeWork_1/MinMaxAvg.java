/**
 * MinMaxAvg implements an application that simply displays which of the three
 * given numbers is the minimum value and the maximum value, and also finds
 * the arithmetic mean of these three numbers, the program accepts two random
 * numbers and one number entered by the user, standard output to the console.
 *
 * @version 15.0.1
 */

package src.hw01;

import javax.swing.*;
import java.text.DecimalFormat;

public class MinMaxAvg {
	
	public static void main(String[] args) {
		
		//Class for specifying the number of decimal places
		DecimalFormat dfNum = new DecimalFormat("#.###");
		
		// Fields for defining numbers
		double randNum1 = Math.random() * 100;
		double randNum2 = Math.random() * 100;
		String userNum = JOptionPane.showInputDialog(null, "Enter your number!");
		double testUserNum;
		
		//Display the number entered by user
		System.out.println("Your entered the number: " + userNum);
		
		//Checking the entered value
		if (userNum != null && !userNum.equals("")) {
			try {
				testUserNum = Double.parseDouble(userNum);
				
				// Finding the minimum value
				if (randNum1 < randNum2 && randNum1 < testUserNum) {
					System.out.println("The minimum number is " + dfNum.format(randNum1));
				} else if (randNum2 < randNum1 && randNum2 < testUserNum) {
					System.out.println("The minimum number is " + dfNum.format(randNum2));
				} else {
					System.out.println("The minimum number is " + testUserNum);
				}
				
				// Finding the maximum value
				if (randNum1 > randNum2 && randNum1 > testUserNum) {
					System.out.println("The maximum number is " + dfNum.format(randNum1));
				} else if (randNum2 > randNum1 && randNum2 > testUserNum) {
					System.out.println("The maximum number is " + dfNum.format(randNum2));
				} else {
					System.out.println("The maximum number is " + testUserNum);
				}
				
				// Finding the arithmetic mean
				double avgValue = (randNum1 + randNum2 + Double.parseDouble(userNum)) / 3;
				System.out.println("The arithmetic mean of three given numbers is " + dfNum.format(avgValue));
				
			} catch (Exception e) {
				System.out.println("You entered a non-numeric value!");
			}
		}
		if (userNum == null || userNum.equals("")) {
			System.out.println("You haven't entered anything");
		}
	}
}
