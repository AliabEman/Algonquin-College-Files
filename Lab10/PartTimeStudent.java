package Lab10;
import java.util.Scanner;

/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 */

public class PartTimeStudent extends Student { //child class of the Student class
	private double courseFeesTotal; //non-inherited attributes for the child class
	private double credits;

	/**
	 * This method calls the super class to get user input for their information
	 * and finishes off with the courseFeesTotal and credits.
	 */
	public void readInfo() {
		super.readInfo();
		System.out.println("Enter total course fees: ");
		courseFeesTotal = input.nextDouble();
		System.out.println("Enter credit hours: ");
		credits = input.nextDouble();
	}
	/**
	 * printInfo method calls the parent class's printInfo to print the basic information for the Student
	 * then finishes with the private attribute being printed.
	 */
	public void printInfo() {//if the student is a PartTimeStudent, this method will complete the Student class's printInfo method
		super.printInfo();
		System.out.printf("%9.2f|%9.2f|\n", courseFeesTotal, credits);
	}
	/**
	 * @param input
	 * The input parameter receives the input object from the Scanner class and calls the parent method
	 * to read file information, using the readFileInfo() method.
	 */
	public void readFileInfo(Scanner input) {
		super.readFileInfo(input);
		courseFeesTotal = input.nextDouble();
		credits = input.nextDouble();
	}

}
