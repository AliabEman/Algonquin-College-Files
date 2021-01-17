package Lab10;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 */
public class College {
	private String name; // non-inheritable attribute

	//public Student[] students; //array of students
	public ArrayList<Student> students1;
	public int studentTotal = 0;


	College() {}

	/**
	 * 
	 * @param name attribute for the store name.
	 * @param num attribute for the number of employees.
	 */
	College (String name, int num) { //parameterized constructor used to help create the students array and reference the college's name
		this.name = name;
		students1 = new ArrayList<Student> (num);
	}

	/**
	 * printTitle method is used to print the list of students.
	 */
	public void printTitle() { //Title and header for the program
		if (studentTotal == 0) {
			System.err.flush();
			System.err.print("No students to display");
		}
		else {
			System.out.println(name + " - List of Students");
			System.out.println("************************************");
			System.out.printf("    Program|    Student#|              Name|                     Email|          Phone|    GPA|     Fees|  Credits|%n");
		}
	}

	/**
	 * 
	 * @param input object of Scanner class used to iterate through the method, as well as open the 
	 * read file for the user input or the file input.
	 */
	public void readOptions(Scanner input) {
		System.out.println("1. Read from file\n2. Read from the user\nEnter your option: ");

		int choice = input.nextInt();
		if (choice == 1) {
			openFile(input);
		}

		else if (choice == 2) {
			readStudentsDetails(input);
		}

	} 

	/**
	 * 
	 * @param input is used to open the source file in Java.
	 * This method is called by the CollegeSystemTest class to open the text file being used.
	 */
	public void openFile(Scanner input) {
		try {
			input = new Scanner(Paths.get("C:\\Users\\18192\\eclipse-workspace\\Lab10\\src\\students.txt"));
		} catch (NoSuchFileException fe) {
			System.err.flush();
			System.err.println("File Not Found");
			System.err.flush();
		} catch (IOException e) {
			System.err.println("Error finding file... Check path!");
		}
		readFile(input);
	}

	/**
	 * 
	 * @param input is used to pass the input object from the openFile class.
	 * This method is called to read the attributes within the text file, it is called from 
	 * the CollegeSystemTest class.
	 */
	public void readFile(Scanner input) {
		while(input.hasNext()) {
			Student temp = null;
			char type = input.next().charAt(0); 

			if (type == 'f') {
				temp = new FullTimeStudent();
			}

			else if (type == 'p') {
				temp = new PartTimeStudent();
			}
			temp.readFileInfo(input);
			students1.add(temp);
			studentTotal++;

		}			
	}
	

	/**
	 * 
	 * @param input is passed from the main method of the CollegeSystemTest class, to allow for
	 * user input reading with the Scanner object.
	 */
	public void readStudentsDetails(Scanner input) { //Reads the details of all students
		int type;
		System.out.println("Enter details of student " + (studentTotal + 1) + ":");
		System.out.println("===========================");
		System.out.println("1 – Fulltime Student");
		System.out.println("2 – Parttime Student");
		System.out.println("Enter student type: ");

		Student temp = null;

		type = input.nextInt();

		if (type == 1) //full-time student method calls
			temp = new FullTimeStudent(); //assigning the full time student to the students index count
		if (type == 2) //part-time student method calls
			temp = new PartTimeStudent(); //assigning the part time student to the students index count

		temp.readInfo();
		students1.add(temp);
		studentTotal++;
	}
	
	/**
	 * The purpose of this method is to print the student information, with regard to the size
	 * of the ArrayList called students1.
	 */
	public void printStudentsDetails() {//this method uses the students array index to print their information accordingly, fulltime student info or parttime as determined in the readStudentDetails method
		if (studentTotal == 0) {
			System.err.println("....");
		}
		else {
			for (int x = 0; x <students1.size(); x++) {
				students1.get(x).printInfo();
			}
		}
	}


}
