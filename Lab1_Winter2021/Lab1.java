/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Aliab Eman
 * Student Number: 041000420 
 * Course: CST8130 - Data Structures
 * @author/Professor James Mwangi PhD. 
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */

package Lab1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		/*
		 * Variables being used
		 */
		Scanner keyboard = new Scanner(System.in);
		Numbers num;
		int i = 0;
		int size = 0;
		num = new Numbers();
		/*
		 * The do-while loop is to iterate the main menu + options,
		 * the exception being handled, whether in the main method or called by the object
		 * is the input mismatch error.
		 */
		do {
			try {
				displayMainMenu();
				i = keyboard.nextInt();
				switch(i) {
				case 1: //initializing a default array
					num = new Numbers();
					break;
				case 2: //specify the max size of the array, initializing an array of user-input length.
					System.out.println("Enter new size of array: ");
					size = keyboard.nextInt();
					num = new Numbers(size); //creates an object of the Numbers class and passes the size variable to the parameterized constructor
					break;
				case 3: //adds a value to the array
					num.addValue(keyboard);
					break;
				case 4: //display values in the array
					System.out.print("Numbers are: \n");
					System.out.print(num.toString());
					break;
				case 5: //display the average of the values
					System.out.printf("Average is: %.2f\n", num.calcAverage());
					break;
				case 6: //exiting the switch loop/ menu screen.
					System.out.println("Exiting...");
					break;
				default:
					System.err.println("Please select a valid option"); //throwing an error for menu options outside of options 1-6.
				}
			} catch (InputMismatchException npE) {
				System.err.println("Invalid Entry... Please try again");
				System.err.flush();
				keyboard.next();
			}
		}while(i != 6);
		keyboard.close();
	}

	public static void displayMainMenu() {
		System.out.println("Please select one of the following:");
		System.out.println("1. Initialize a default array\n2: To specify the max size of the array");
		System.out.println("3: Add value to the array\n4: Display values in the array");
		System.out.print("5: Display the average of the values\n6: To Exit\n>");
	}
}
