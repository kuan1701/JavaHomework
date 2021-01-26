/**
 * RangeDefinition implements an application that simply displays
 * which of the three preset ranges of numbers includes the number entered
 * by the user, the program accepts two random numbers and one numeric variable
 * entered by the user, standard output to the console.
 *
 * @version "15.0.1" 2020-10-20
 */

package Homework_1;

import javax.swing.*;

public class RangeDefinition {
	
	public static void main(String[] args) {
		
		//Random values
		int firstRndNum = (int) (Math.random() * 50);
		int secondRndNum = (int) (51 + Math.random() * 49);
		
		//User value
		String userNum = JOptionPane.showInputDialog(null, "Enter the number!!");
		double testUserNum;
		
		//Checking the entered value
		if (userNum != null && !userNum.equals("")) {
			
			try {
				testUserNum = Double.parseDouble(userNum);
				
				if (testUserNum >= 0 && testUserNum <= firstRndNum) {
					System.out.println("User entered number is in the range from 0 to " + firstRndNum + "!");
				}
				else if (testUserNum > firstRndNum && testUserNum <= secondRndNum) {
					System.out.println("User entered number is in the range from " + firstRndNum + " to " + secondRndNum + "!");
				}
				else if (testUserNum > secondRndNum) {
					System.out.println("User entered number is in the range of " + secondRndNum + " and above!");
				}
				else {
					System.out.println("User entered number less then zero!");
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

