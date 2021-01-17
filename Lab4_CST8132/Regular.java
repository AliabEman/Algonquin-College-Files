/*
 * Aliab Eman
 * 041000420
 * CST8132
 * Lab 4: Abstract Class
 * 
 */
package Lab4_CST8132;

public class Regular extends Employee {

	public double deductionRate = 0.17; //deduction rate for Regular Employees
	private double payrollCalculation; //variable to hold the salary
	
	public Regular() {
		
	}
	
	public Regular(String firstName, String lastName, String email, double hoursPerWeek) {
		super(firstName, lastName, email, hoursPerWeek); //instantiating the attributes of the Regular class as well as inheriting the attributes of the Employee class
	}

	@Override
	public double payrollCalculation() { //payroll calculation for Regular Employees
		return payrollCalculation = hourlyRate * hoursPerWeek * (1 - deductionRate);

	}

	@Override
	void methodOfPayment() { //method of payment for Regular Employees
		System.out.printf("Direct depositing $%.2f to %s %s's bank account\n", payrollCalculation, firstName, lastName);
	}

}
