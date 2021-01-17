/*
 * Aliab Eman
 * 041000420
 * CST8132
 * Lab 4: Abstract Class
 * 
 */
package Lab4_CST8132;
import java.util.Scanner;

public class Payroll{
	
	public int type;
	private Employee employees[]; //create an array of Employee class
	Scanner input = new Scanner(System.in);

	public Payroll() {
		
	}

	public Payroll(int num) {
		employees = new Employee[num]; //array of employee as an attribute of payroll object, Lab4 class declares the amount of objects in the array (num)
	}

	public void readEmployees() { //inputting attributes for each employees object in the array
		for (int i = 0; i < employees.length; i++) {
			int j = i;
			System.out.printf("Enter details of employee %d\n", j+1);
			System.out.print("===========================");
			System.out.print("\nEnter first name: ");
			String firstName = input.next();
			System.out.print("Enter last name: ");
			String lastName = input.next();
			System.out.print("Enter email: ");
			String email = input.next();
			System.out.print("Hours worked: ");
			double hoursPerWeek = input.nextDouble();
			System.out.printf("1. Regular\n2. Contractor\nEnter the type: ");
			type = input.nextInt();
			
			if (type == 1) { //if type of employee is a Regular, store data as a Regular and input the Regular's hourlyRate for later
				employees[i] = new Regular(firstName, lastName, email, hoursPerWeek);
				employees[i].hourlyRate = 30;
			}
			
			else if (type == 2) { //if type of employee is Contractor, store data as a Contractor and input the Contractor's hourlyRate
				employees[i] = new Contractor(firstName, lastName, email, hoursPerWeek);
				employees[i].hourlyRate = 45;
			}
		}
	}
	
	public void processPayroll() {
		for (int i = 0; i < employees.length; i++) {
			employees[i].payrollCalculation(); //according to employee type, calculate their payroll
			employees[i].methodOfPayment(); //output the method of payment after the calculation of their payroll is completed using payrollCalculation
		}
	}
	
}
