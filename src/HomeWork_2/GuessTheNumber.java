package HomeWork_2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static final Random RND = new Random();
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Please a enter your number between 0 and 100!!");
		
		int userNum = num.nextInt();;
		int compNum;
		int count = 0;
		
		do {
			
			count++;
			compNum = RND.nextInt(100);
			
		} while (compNum != userNum);
		
		System.out.println("Your number is: " + compNum);
		System.out.println("I got it right on " + count + " try.");
	}
}
