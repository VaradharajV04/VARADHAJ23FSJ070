package javafullstack;

import java.util.Scanner;
	public class PrintANumber {
	public static void main(String[] args) {

	// Creates a reader instance which takes
	// input from standard input - keyboard 
		Scanner sc = new Scanner(System.in); System.out.print("Enter a number: ");

	// nextInt() reads the next integer from the keyboard
	int number = sc.nextInt();

	// println() prints the following line to the output screen
	System.out.println("You entered: " + number);
	}	
}
