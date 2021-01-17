package Lab10;
/**
 * @author Aliab Eman
 * 11/24/2020
 * @version 2.0
 * CST8132 Lab 10: College System 
 */

public abstract class Person {
	//Instance variables are created firstName, lastName, emailId, phoneNumber, protected because will be inherited by other classes
	protected String firstName;
	protected String lastName;
	protected String emailId;
	protected long phoneNumber;
	
	Person() {}
	
	/**
	 * @param firstName The first name of the student.
	 * @param lastName The last name of the student.
	 * @param emailId The email of the student.
	 * @param phoneNumber The student's phone number
	 * Instantiation of the Person class attributes.
	 */
	Person(String firstName, String lastName, String emailId, long phoneNumber) { //parameterized constructor for user input assignment to class values
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	//method used for output of firstName and lastName
	public String userName() {
		return firstName + " " + lastName;
	}
	
	//abstract class declarations
	public abstract void readInfo();
	public abstract void printInfo();
}
