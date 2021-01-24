package Lab1;
import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Aliab Eman
 * Student Number: 041000420 
 * Course: CST8130 - Data Structures
 * @author/Professor James Mwangi PhD. 
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */
public class Numbers {
	/**
	 * numbers: Stores Float values.
	 */
	private Float[] numbers; //Float reference

	/**
	 * numItems: Store the number of items currently in the array. (counter?)
	 */
	private int numItems;

	/**
	 * Default Constructor; we initialize a default array, setting its values to 0.
	 */
	public Numbers() {
		numbers = new Float[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0.0f;
		}
		this.numItems = 0;
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) { //if called by option #2, we create an array Object of size "size" and initialize each array index to zero.
		numbers = new Float[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = 0.0f;
		}
		this.numItems = 0;
	}

	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		if (numItems < numbers.length) { //counter for numItems helps keep track of numbers array index
			System.out.print("Enter value: ");
			numbers[numItems] = keyboard.nextFloat();
			numItems++;
		}
		else if (numItems == numbers.length){
			System.out.println("Array full");
		}
	}

	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		float average = 0;
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) { 
			if (numbers[i] == 0.0f) { //**Struggled to deal with the NaN output when no values are assigned to the array indices.
				average += 0;
			}
			if (numbers[i] != 0.0f) { //if a nonnegative value for the index value in the array, ignore its addition to this if statement
				average += numbers[i];
				counter++;
			}
		}
		average = average/ counter;
		return average;
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < numbers.length; i++) {
			//			if (numbers[i] == 0.0f) 
			//				output = "";
			if (numbers[i] != 0.0f) 
				output = output + numbers[i].toString() + "\n";
		} //the purpose of this block of code is to convert the referenced Float values to Strings
		return output;
	}
}
