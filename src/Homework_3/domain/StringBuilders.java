/**
 *
 * The StringBuilders class contains an overridden toString method that returns a
 * string using the StringBuilders method. A string using a loop gets 100 random
 * numbers from 0 to 1000 using the Random class.
 *
 * @version 15.0.1
 */

package Homework_3.domain;

import java.util.Random;

public class StringBuilders {
	
	//Using Random class
	public static final Random RND = new Random();
	
	// Override the toString method
	@Override
	public String toString(){
	
		int numberOfRandomValues = 100;
		
		StringBuilder sb = new StringBuilder();
		
		// Loop for assigning random values
		for (int i = 0; i <= numberOfRandomValues; i++) {
			sb.append(RND.nextInt(1000));
			sb.append(", ");
		}
		
		// Remove the comma and space at the end of the line
		sb.delete(sb.length() - 2, sb.length());
		sb.append(".");
		return sb.toString();
	}
}
