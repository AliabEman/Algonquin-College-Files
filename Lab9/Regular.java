package Lab9;


import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * @author Aliab Eman
 * @version 4.0
 * Parent class is Employee, and indirectly inherits from the Person class as well so the Contractor class inherits the attributes and
 * non-private methods of the Employee and Person classes
 *
 */
public class Regular extends Employee{


	private double salary;

	Regular() {

	} 

	/**The readInfo method is overridden because it is recycled in the code and returns the information of the indexed employee.
	 * Every time the method is invoked, the superclass method gets read first before the salary.
	 */
	@Override
	public void readInfo(Scanner input) {

		super.readInfo(input);
		System.out.println("Enter Annual Salary: ");

		salary = input.nextDouble();
		salary = salary / 12;

	}

	/**
	 * Accepts nothing, returns nothing, this method refers to the parent class's information for the stored data on each employee.
	 * The print statement adds the salary to the end of the superclass method call.
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf(" %10.2f|\n", salary);
	}

	/**
	 * Likewise to the readInfo method, the readFile method does a method call to the superclass's readFile method to read the file information there
	 * before reading the salary.
	 * @param input is accepted by the readFile method to allow for file reading and variable assignment to happen.
	 */
	@Override
	public void readFile(Scanner input) {
		super.readFile(input);
		salary = input.nextDouble() / 12;
	}
}
