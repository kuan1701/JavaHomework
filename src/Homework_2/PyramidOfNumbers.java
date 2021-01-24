/**
 *
 *   PyramidOfNumbers implements an application that displays a matrix of numbers
 *in the form of a pyramid.
 *   The program asks the user for the size of the matrix.
 *   Based on the received data, the program builds a matrix of numbers in the form
 *of a pyramid and displays it in the console.
 *
 * @version 15.0.1
 */

package Homework_2;

import java.util.Scanner;

public class PyramidOfNumbers {
	
	public static void main(String[] args) {
		
		//Using the Scanner class
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter matrix size:");
		int arraySize = num.nextInt();
		System.out.println("Matrix size " + arraySize + " x " + arraySize + ".");
		
		int[][] array = new int[arraySize][arraySize];
		
		//Loop for traversing through each row of the matrix
		for (int i = 0; i < array.length; i++) {
			
			//Loop for traversing each matrix cell
			for (int k = 0; k < array[i].length; k++) {
				
				//Determining the minimum values ​​of the indices of each cell
				int iRow = (i < arraySize / 2) ? Math.min(i, k) : Math.min(arraySize - 1 - i, k);
				int kColumn = (k < arraySize / 2) ? Math.min(i, k) : Math.min(i, arraySize - 1 - k);
				
				//Determine the minimum value for each cell of the matrix
				array[i][k] = Math.min(iRow, kColumn) + 1;
				
				System.out.print(array[i][k] + "  ");
			}
			System.out.println("");
		}
		num.close();
	}
}
