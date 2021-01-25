package Lab2;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
	//instance variables
	/**
	 * Instance variables 
	 */
	private Integer[] numbers;
	private int size;

	/**
	 * Default constructor
	 */
	Numbers() {}

	/**
	 * 
	 * @param size: It is used to initialize an array reference of Integer size based on user input
	 * 
	 */
	Numbers(int size) {
		this.size = size;
		numbers = new Integer[size];
	}

	/**
	 * Accepts nothing, returns nothing.
	 * This method serves to generate random integer numbers for the referenced Integer array.
	 */
	public void generateNumbers() {
		Random r = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(49) + 1;
		}
	}

	/**
	 * 
	 * @param keyboard: user input is passed by reference to the Scanner object keyboard.
	 * @return Counter holds the amount of occurrences for a user's search query in the array.
	 */
	public int findCount(Scanner keyboard) {
		int counter = 0; //stores number of occurrences.
		if (numbers.length == 0) {
			System.err.println("Array is empty");
			return counter;
		}
		else {
		System.out.println("Enter the number to be searched:");
		int search = keyboard.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == search) {
				counter++;
			}
		}
		System.out.printf("Number %d occured %d times in the array\n", search, counter);
		return counter;
		}
	}

	/**
	 * Converts the array indices to Strings
	 */
	@Override
	public String toString() {
		String output = "";
		if (numbers.length == 0) {
			System.err.println("Array is empty");
			return output;
		}
		else {
			for (int i = 0; i < numbers.length; i++) {
				output = output + numbers[i].toString() + " ";
			}
			return output;
		}
	}
	/**
	 * 
	 * @param size is passed to the method to detect if the array is created.
	 * @return 0 if array is created.
	 */
	public int isArrayCreated(int size) {
		if (size == 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param size is passed to the method to detect if the array is empty
	 * @return 0 if array is not empty.
	 */
	public int isEmpty(int size) {
		if (size <= 0) {
			System.err.println("Array is empty");
			return -1;
		}
		else {
			return 0;
		}
	}
}
