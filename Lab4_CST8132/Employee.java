/*
 * Aliab Eman
 * 041000420
 * CST8132
 * Lab 4: Abstract Class
 * 
 */
package Lab4_CST8132;

abstract class Employee { //abstract class, unique quality is the abstract methods that are hidden unless in the proper class of operation (Regular/ Contractor)
	protected String firstName; //protected attributes can be inherited by child classes
	protected String lastName;
	protected String email;
	protected double hourlyRate;
	protected double hoursPerWeek;
	
	public Employee() { //default constructor
		
	}
	
	public Employee(String firstName, String lastName, String email, double hoursPerWeek) { //parameterized constructor
		this.firstName = firstName; //instantiated attributes of the employee class
		this.lastName = lastName;
		this.email = email;
		this.hoursPerWeek = hoursPerWeek;
	}

	abstract double payrollCalculation(); //abstract method 1
	abstract void methodOfPayment(); //abstract method 2

}
