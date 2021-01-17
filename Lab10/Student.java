package Lab10;
import java.util.Scanner;
/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 * 
 */
public class Student extends Person {

	protected int studentNumber;
	protected String programName;
	protected double gpa;
	protected int classes;
	protected double [] grades;
	Scanner input = new Scanner(System.in);
	
	Student() {}
	//parameterized constructor to reference the local variables with the same name
	Student(int studentNumber, String programName, double gpa) {
			this.studentNumber = studentNumber;
			this.programName = programName;
			this.gpa = gpa;
	}

	/**
	 * The readInfo method is used to allow for user input for the attributes of the student.
	 */
	@Override
	public void readInfo() {
		
		System.out.println("Enter program name: ");
		programName = input.next();
		System.out.println("Enter student number: ");
		studentNumber = input.nextInt();
		System.out.println("Enter first name: ");
		firstName = input.next();
		System.out.println("Enter last name: ");
		lastName = input.next();
		System.out.println("Enter email Id: ");
		emailId = input.next();
		System.out.println("Enter phone number: ");
		phoneNumber = input.nextInt();
		
		readMarks();
	}
	
	/**
	 * 
	 * @param input receives the Scanner object from the CollegeSystemTest class.
	 * This method serves purpose for the text file being instantiated as the while loop in the 
	 * College.readFile() method iterates the file through.
	 */
	public void readFileInfo(Scanner input) {
		
		studentNumber = input.nextInt();
		firstName = input.next();
		lastName = input.next();
		emailId = input.next();
		phoneNumber = input.nextInt();
		programName = input.next();
		gpa = input.nextDouble();
	}

	/**
	 * This method accepts nothing, and returns nothing. Instead it creates an array of grades using the amount of classes taken by the User input.
	 * This method then calls the calculateGpa method and passes the grades indexed to that method.
	 */
	public void readMarks() { //reads number of courses, then reads marks of all courses and stores them in grades array
		System.out.println("Enter number of classes: ");
		classes = input.nextInt(); //classes holds the number of positions in the grades array
		grades = new double[classes];
		for (int i = 0; i < grades.length; i++) { //iterating through the marks receivable for each class
			System.out.println("Enter mark " + (i + 1) + ": ");
			grades[i] = input.nextDouble(); 
		}
		calculateGpa(grades); //method call to calculate the gpa
	}
	
	/**
	 * 
	 * @param grades are received from the readMarks method.
	 * The purpose of the calculateGpa method is to calculate the gpa using the grades of the class indexed in the grades array.
	 */
	public void calculateGpa(double[] grades) { 
		for (int i = 0; i < grades.length; i++) {
			gpa = gpa + grades[i];
		}
		gpa = (gpa*4)/(100 * grades.length);
	}
	
	/**
	 * This method prints out the stored values in the students1 ArrayList.
	 */
	@Override
	public void printInfo() { //user output, to be completed by Fulltime or PartTime student classes.
		System.out.printf("%11s|%12d|%18s|%26s|%15d|%7.2f|", programName, studentNumber, userName(), emailId, phoneNumber, gpa);
	}


}
