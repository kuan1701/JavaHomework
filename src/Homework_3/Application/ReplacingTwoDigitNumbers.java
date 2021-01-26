/**
 *
 * ReplacingTwoDigitNumbers implements an application that simply changes
 * two-digit numbers in a string to "-1". And prints the changed line to the console.
 * The program uses the StringBuilders and CreateString classes, as well as regular expressions.
 *
 * @version 15.0.1
 */

package Homework_3.Application;

import Homework_3.domain.CreateString;
import Homework_3.domain.StringBuilders;

public class ReplacingTwoDigitNumbers {
	
	public static void main(String[] args) {
		
		// Changing a string in a StringBuilders method
		System.out.println("Original string: ");
		StringBuilders stringBuilders = new StringBuilders();
		String stringBuildersOrigrnal = stringBuilders.toString();
		System.out.println(stringBuildersOrigrnal);
		
		System.out.println("New string: ");
		// Using RegEx
		stringBuildersOrigrnal = stringBuildersOrigrnal.replaceAll("(?<!\\d)\\d{2}(?!\\d)", "-1");
		System.out.println(stringBuildersOrigrnal + "\n");
		
		// Changing a string in a String method
		System.out.println("Original string: ");
		CreateString str = new CreateString();
		String originalString = str.toString();
		System.out.println(originalString);
		
		System.out.println("New string: ");
		// Using RegEx
		originalString = originalString.replaceAll("(?<!\\d)\\d{2}(?!\\d)", "-1");
		System.out.println(originalString);
	}
}
