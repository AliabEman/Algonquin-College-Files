package Lab2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2Test {

	public static void main(String [] args) {
		/**
		 * Local variables
		 */
		Numbers num = null;
		int i = 0;
		Scanner keyboard = new Scanner(System.in);
		int size;
		
		/**
		 * do-while statement runs until the user input for i = 5
		 */
		do {
			displayMainMenu();
			try {
				i = keyboard.nextInt();
				
				switch(i) {
				
				/**
				 * Initialize the object, num, with case 1
				 */
				case(1):
					System.out.println("Enter required size:");
					size = keyboard.nextInt();
					num = new Numbers(size);
				break;
				
				/**
				 * Generates random numbers and store them in the object
				 */
				case(2):
					num.generateNumbers();
				break;
				
				/**
				 * Searches for a number and displays its number of occurrences in the array
				 */
				case(3):
				num.findCount(keyboard);
				break;
				
				/**
				 * Displays array
				 */
				case(4):
					System.out.println(num.toString());
				break;
				
				/**
				 * Quit to the Main Menu
				 */
				case(5):
					System.out.println("Bye... Have a nice day!");
				break;
				
				/**
				 * Default to invalid integer entries
				 */
				default:
					System.err.println("Invalid entry, please try again.");
					break;
				}
			} catch (InputMismatchException ime) {
				System.err.println("Invalid entry, please select an integer");
				System.err.flush();
				keyboard.next();
			} catch(NullPointerException npe) {
				System.err.println("Array is not created... please create the array first.");
				System.err.flush();
				System.err.flush();
			}
		} while(i != 5);
		keyboard.close();
	}

	/**
	 * This is a static method: Nothing changes in the main menu screen.
	 */
	public static void displayMainMenu() {
		System.out.println("1. Create array with new size");
		System.out.println("2. Generate random numbers and store it in the array");
		System.out.println("3. Search a number and display its number of occurences");
		System.out.println("4. Display array\n5. Quit\nEnter your option");
	}

}
