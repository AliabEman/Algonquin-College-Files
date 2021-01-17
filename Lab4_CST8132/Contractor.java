/*
 * Aliab Eman
 * 041000420
 * CST8132
 * Lab 4: Abstract Class
 * 
 */
package Lab4_CST8132;

public class Contractor extends Employee { //child class that inherits from Employee class

	public double taxRate = 0.15; //Tax rate as a Contractor
	private double payrollCalculation;
	
	public Contractor() {
		
	}
	
	public Contractor(String firstName, String lastName, String email, double hoursPerWeek) {
		super(firstName, lastName, email, hoursPerWeek); //instantiation in parent class		
	}

	@Override
	public double payrollCalculation() { //calculation of salary for Contractors
		return payrollCalculation = hourlyRate * hoursPerWeek * (1 + taxRate);
	}


	@Override
	void methodOfPayment() { //method of payment for Contractors
		System.out.printf("Mailed a cheque to %s %s for $%.2f\n", firstName, lastName, payrollCalculation);
		
	}

}
