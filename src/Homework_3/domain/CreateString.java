/**
 *
 * The CreateString class contains an overridden toString method that returns a
 * string using the String method through dynamic memory allocation. A string
 * using a loop gets 100 random numbers from 0 to 1000 using the Random class.
 *
 * @version 15.0.1
 */

package Homework_3.domain;

import java.util.Random;

public class CreateString {
	
	//Using Random class
	public static final Random RND = new Random();
	
	// Override the toString method
	@Override
	public String toString() {
		
		int numberRandomOfValues = 100;
		
		String str = "";
		
		// Loop for assigning random values
		for (int i = 0; i <= numberRandomOfValues; i++) {
			str += RND.nextInt(1000) + ", ";
			
		}
		
		// Replace the comma at the end o the line with a dot
		str = str.substring(0, str.lastIndexOf(",")) + ".";
		return str;
	}
}
