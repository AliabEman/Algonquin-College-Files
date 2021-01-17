package Lab9;



import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Aliab Eman
 * @version 4.0
 * Main update from Lab 8 is the ArrayList usage instead of Arrays
 */

public class Store {

	/**
	 * ArrayList of Employee class called employees
	 * counter named count to keep track of employees created.
	 * input object named file
	 */
	private ArrayList <Employee> employees;
	static private int count = 0;
	//private Scanner file;

	/**Parameterized constructor that creates an Object for the
	 * number of employees according to the user input for the size 
	 * 
	 * @param size used to determine the size of the employees ArrayList
	 */
	Store(int size) {
		//	employees = new Employee[size];
		employees = new ArrayList<Employee>(size);
	}

	/**
	 * This method reads the details of each employee when prompted by the menu option 1
	 *  
	 *  @param input receives the scanner object to allow for User input
	 */
	public void readDetails(Scanner input) {
		try {
			//type is used as the integer that determines the employee type, regular or contractor
			int type;
			//Loops through employees details... because count is incremented, x does not need to be incremented as it equals to the count.
			System.out.printf("Enter details of Employee %d\n1.  Regular\n2.  Contractor\n", employees.size() + 1);
			System.out.println("Enter type of Employee: ");
			type = input.nextInt();

			//creating a null object of the employee
			Employee temp = null;
			//assigns null object to Regular() employee type
			if (type == 1)
				temp = new Regular();
			//assigns null object to Contractor() employee type
			if (type == 2) 
				temp = new Contractor();
			//reads info corresponding to whether employee is Contractor() or Regular()
			temp.readInfo(input);
			//adds employee information to ArrayList
			employees.add(temp);
			//counter to inform software user of employee position reference after creation
			count++;

		} catch(InputMismatchException ime) {
			System.err.flush();
			System.err.println("Input Mismatch Exception in readEmployeeDetails");
		} catch(Exception e) {
			System.err.flush();
			System.err.println(e);
			System.err.flush();
		} 
		//	}
	}

	/**
	 * 
	 * @return is true if there's no employees on file, false if there are employees on file.
	 */
	public boolean isArrayEmpty() {
		if (count == 0) {
			System.err.flush();
			System.err.println("No employees on file");
			return true;
		}

		else 
			return false;
	}

	/**
	 * Accepts nothing, returns nothing. In a for loop, readDetails outputs the details of 
	 * all non-null employees on ArrayList and calls the printInfo() method
	 */
	public void printDetails() {

		for (int x = 0; x < employees.size(); x ++) {
			employees.get(x).printInfo();
		}

	}

	/**
	 * Outputs lines for esthetic of program
	 */
	static void printLine() {
		System.out.println("================================================================================");
	}

	/**
	 * accepts nothing, returns nothing
	 * Displays the title page for the store and non-null employees in the ArrayList
	 */
	void printTitle() {
		if (count == 0 ) {
			System.err.println("No employees defined...");

		}
		if (employees.size() != 0) {
			printLine();
			System.out.printf("                           %s Store Management System                           \n",Lab9.storeName);
			printLine();
			System.out.println("      Emp# |                 Name |           Email |        Phone |     Salary|");
			printLine();
		}
	}

	/**
	 * 
	 * @param input object passed to openFile() method to be used as the file Scanner object
	 * 
	 */
	public void openFile(Scanner input) {
		try {
			//relative path to the directory
			input = new Scanner(Paths.get("src\\Lab9\\employees.txt"));
		} catch (NoSuchFileException fe) {
			System.err.flush();
			System.err.println("File Not Found");
			System.err.flush();
		} catch (IOException ioe) {
			System.out.println(ioe);

		}
		//This while statement reads through the text file from start to finish
		while(input.hasNext()) {
			//create a null object of the Employee class
			Employee temp = null;
			//read the type of employee, r = Regular(), c = Contractor()
			char type = input.next().charAt(0);
			if(type == 'r') {
				//assigns Regular employee to the null object
				temp = new Regular();
			}
			else if(type =='c') {
				//assigning Contractor to the null object
				temp = new Contractor();
			}
			//read file input by passing the file input to the readFile class
			temp.readFile(input);
			//adds updated Employee object, temp, to the ArrayList
			employees.add(temp);
			//counter to inform software user of employee position reference after creation
			count++;
		}

	}	
}