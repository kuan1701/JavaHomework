/**
 *
 *   QuestionToTheUser implements an application that simply asks the user
 * for any question. The program asks a question to the user, then the user
 * answers this question "yes" or "no", the option without an answer is excluded.
 *   If the answer is "no", the program will hold the same question a number of times.
 *   The program also provides an opportunity for the user to give up if he does not
 * want to answer this question.
 *   After the user has given a response, the program displays a message based on the user's response.
 *
 * @version 15.0.1
 */

package Homework_2;

import java.util.Scanner;

public class QuestionToTheUser {
	
	public static void main(String[] args) {
		
		//Using the Scanner class
		Scanner question = new Scanner(System.in);
		
		String answer;
		int attempts = 5;
		
		System.out.println("Will you be learning Java?");
		answer = question.nextLine();
		
		//Checking answer options
label:
		for (int i = 1; i <= attempts; i++) {
			
			switch (answer) {
				case "Yes":
				case "yes":
				case "YES":
					System.out.println("Well done, the right choice!!");
					break label;
					
				case "no":
				case "No":
				case "NO":
					System.out.println("Definitely not????");
					answer = question.nextLine();
					break;
					
				case "":
					System.out.println("You must answer!!");
					answer = question.nextLine();
					break;
			}
			
			// We provide the user with the opportunity to surrender
			if (i == attempts) {
				
				do {
					System.out.println("To surrender, enter 0");
					answer = question.nextLine();
				}
				while (!answer.equals("0"));
				System.out.println("Well you are a weakling!!!");
			}
		}
		question.close();
	}
}
