/**
 *
 * UserGreetingMessage implements an application that simply prints a greeting
 * message to the console after the user enters their name and age.
 * The program uses the String.format method.
 *
 * @version 15.0.1
 */

package Homework_3.Application;

import java.util.Scanner;

public class UserGreetingMessage {
	
	public static void main(String[] args) {
		
		//Create a template for displaying a message.
		String greetingsTemplate = "Hi %s. How old are you?";
		String birthdayTemplate = "Wow you're already %d, years old.";
		
		//First question for user
		System.out.println("Hi User, what's your name?");
		Scanner nameOfUser = new Scanner(System.in);
		String name = nameOfUser.nextLine();
		
		// Display the first message
		System.out.println(String.format(greetingsTemplate, name));
		Scanner ageOfUser = new Scanner(System.in);
		
		// Display the second message
		int age = ageOfUser.nextInt();
		System.out.println(String.format(birthdayTemplate, age));
		
		nameOfUser.close();
		ageOfUser.close();
	}
}
