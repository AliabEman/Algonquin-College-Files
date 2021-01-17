package Lab10;

import java.util.InputMismatchException;
/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 */

public class CollegeSystemTest {

	public static void main(String[] args) { //main method
		java.util.Scanner input = new java.util.Scanner(System.in);
		int numS = 0;
		int choice = 0;
		
		System.out.println("Enter name of College: ");
		
		String name = input.nextLine();
		while (numS <= 0) {
			/**
			 * try-catch block used to observe for any exceptions to the num of employees (negative employee count, non-integer employee counts
			 */
			try {
				System.out.println("Enter the number of students: ");
				numS = input.nextInt();
			} catch (InputMismatchException x) {
				System.err.flush();
				System.err.println("******Input Mismatch Exception while reading number of students...*****");
				System.err.flush();
				input.next();
			}
		}

		College c1 = new College(name, numS);
		
		while (choice != 3) {
			System.out.println("1. Register Students\n2. Display Students\n3. Exit\nEnter your choice: ");
			try {
				choice = input.nextInt();
				
				if (choice == 1) {
					c1.readOptions(input); //proceed with reading process.
//					c1.readStudentsDetails(); //refers to College method to prompt user details
				}
		
				else if (choice == 2) {
					c1.printTitle(); //displays title page
					c1.printStudentsDetails();//proceed with printing students in ArrayList
				}
				else if (choice == 3) {
					input.close();
				}
				else {
					System.err.flush();
					System.err.println("This is not an option, try again");
					System.err.flush();
				}
				
			} catch (InputMismatchException ime) {
				System.err.flush();
				System.err.println("Input Mismatch Exception");
				input.next();
			}
		}
		System.out.println("Goodbye... Have a nice day");
	}
		

}
