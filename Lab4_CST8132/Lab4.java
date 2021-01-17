/*
 * Aliab Eman
 * 041000420
 * CST8132
 * Lab 4: Abstract Class
 * 
 */
package Lab4_CST8132;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int num = input.nextInt();
		Payroll payroll = new Payroll(num); //creates an object of the payroll class to access the payroll behaviors
		payroll.readEmployees(); //payroll behavior used to receive user input
		System.out.println("\n\nSummary of Payroll Processing");
		System.out.println("=================================");
		payroll.processPayroll(); //payroll behavior used to calculate && output the results
	}

}
