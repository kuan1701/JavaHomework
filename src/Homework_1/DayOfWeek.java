/**
 * DayOfWeek implements an application that simply displays the weeks based on
 * a user-entered number from 1 to 7, each number representing a day of the week,
 * the program accepts one numeric variable entered by the user, standard output.
 *
 * @version "15.0.1"
 */

package Homework_1;

import javax.swing.*;

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		String numOfWeek = JOptionPane.showInputDialog(null, "Enter the number from 1 to 7!");
		int testNumOfWeek;
		
		//Checking the entered value
		if (numOfWeek != null && !numOfWeek.equals("")) {
			
			try {
				testNumOfWeek = Integer.parseInt(numOfWeek);
				
				switch (testNumOfWeek) {
					case 1:
						System.out.println("Today is Monday!");
						break;
						
					case 2:
						System.out.println("Today is Tuesday!");
						break;
						
					case 3:
						System.out.println("Today is Wednesday!");
						break;
						
					case 4:
						System.out.println("Today is Thursday!");
						break;
						
					case 5:
						System.out.println("Today is Friday!");
						break;
						
					case 6:
						System.out.println("Today is Saturday!");
						break;
						
					case 7:
						System.out.println("Today is Sunday!");
						break;
						
					default:
						System.out.println("There is no such day of the week!");
				}
			}
			catch (Exception e) {
				System.out.println("You entered a non-numeric value!");
			}
		}
		
		if (numOfWeek == null || numOfWeek.equals("")) {
			System.out.println("You haven't entered anything");
		}
	}
}
