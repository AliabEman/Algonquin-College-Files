package Lab10;
import java.util.Scanner;

/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 */
public class FullTimeStudent extends Student { //FullTimeStudent is inheriting from Student class
	private double tuitionFees; //exclusive attribute of this class
	
	/**
	 * readInfo method does a method call to the super class (Person), 
	 * and finishes the attribute input with the tuitionFees attribute being assigned by the user.
	 */
	public void readInfo() {//exclusive behavior of this class
		super.readInfo();
		System.out.println("Enter tuition fees: ");
		tuitionFees = input.nextDouble();
	}
	
	/**
	 * printInfo method calls the parent class's printInfo to print the basic information for the Student
	 * then finishes with the private attribute being printed.
	 */
	public void printInfo() { //completes the printInfo method of the Student class if the student is a FullTimeStudent
		super.printInfo();
		System.out.printf("%9.2f|\n", tuitionFees);
	}
	
	
	/**
	 * @param input
	 * The input parameter receives the input object from the Scanner class and calls the parent method
	 * to read file information, using the readFileInfo() method.
	 */
	public void readFileInfo(Scanner input) {
		super.readFileInfo(input);
		tuitionFees = input.nextDouble();
	}

}
