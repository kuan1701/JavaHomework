/**
 *
 * MainMethodForCreatingStrings implements an application that simply prints
 * two strings generated in two different ways to the console with random numbers
 * from 0 to 1000.
 * The program uses classes StringBuilders and CreateString, in which a method
 * has already been written to get the string.
 *
 * @version 15.0.1
 */

package Homework_3.Application;

import Homework_3.domain.CreateString;
import Homework_3.domain.StringBuilders;

public class MainMethodForCreatingStrings {
	
	public static void main(String[] args) {
		
		//Creating string using StringBuilders method
		System.out.println("Creating string using the method \"StringBuilder\":");
		StringBuilders sb = new StringBuilders();
		System.out.println(sb + "\n");
		
		//Creating string using String method
		System.out.println("Creating string using the method \"String\":");
		CreateString str = new CreateString();
		System.out.println(str);
	}
}
