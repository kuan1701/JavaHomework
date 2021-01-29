/**
 * StringSplitting implements an application that splits text into separate words and,
 * at the user's choice, counts the number and outputs to the console the selected word
 * entered by the user or outputs all words separately and counts their number.
 * <p>
 * The user is given a choice, by pressing 1, the user enters the word that needs to be
 * counted, and the program prints to the console how many times the word entered by the
 * user occurs in the text. When you press 2, the program displays all the words in the
 * text and counts their number for each word. When you click on 0, the program is closed.
 *
 * @version 15.0.1
 */

package Homework_3.Application;

import java.util.Scanner;

public class StringSplitting {
	
	public static void main(String[] args) {
		
		//Using the scanner class
		Scanner txt = new Scanner(System.in);
		
		int count;
		String text = "dog dog, cat! cat, man Cat. CAT DOG? Dog. DoG- mouse";
		
		//Create an array of words and convert all words to Lowercase
		String[] words = (text.toLowerCase()).split("\\W+");
		
		//Greeting message
		System.out.println("Hello user, to count the number of one word in the text, enter 1, to display a list and their number of all words, enter 2, to exit enter 0.");
		
		//Displaying the text
		System.out.println("Text: " + text + ".");
		//THe user choose which operation to use
		String chooseOperation = txt.nextLine();
		
		//Operation list
		switch (chooseOperation) {
			
			//Counting the number of occurrences of a word entered by user
			case "1":
				System.out.println("Enter the word you want to find in the text: ");
				String wordSearch = txt.nextLine();
				
				count = 0;
				
				for (String word : words) {
					if (wordSearch.equals(word)) {
						count++;
					}
				}
				
				//Second way to search for a word
//				Pattern pattern = Pattern.compile(wordSearch);
//				Matcher matcher = pattern.matcher(text.toLowerCase());
//				while(matcher.find()){
//					count++;
//				}
				
				String searchResults = (count > 0) ?
						"The word \"" + wordSearch + "\" is repeated " + count + " times." :
						"The word \"" + wordSearch + "\" was not found.";
				System.out.println(searchResults);
				break;
			
			//List all words and count their number
			case "2":
				for (int i = 0; i < words.length; i++) {
					count = 1;
					
					for (int k = i + 1; k < words.length; k++) {
						
						if (words[i].equals(words[k])) {
							count++;
							//Set words[j] to 0 to avoid printing visited word
							words[k] = "0";
						}
					}
					//Displays the duplicate word if count is greater than 1
					String result = "The word \"" + words[i] + "\" is repeated " + count;
					
					if (count > 1 && !words[i].equals("0")) {
						System.out.println(result + " times.");
					}
					else if (count == 1 && !words[i].equals("0")) {
						System.out.println(result + " time.");
					}
				}
				break;
			
			//Exit the program
			case "0":
				System.out.println("Have a nice day! Good bye!");
				System.exit(0);
				
				//Checking the entered data
			default:
				System.out.println("There is no such option. Try again please.");
				break;
		}
		txt.close();
	}
}
