package javafullstack;

import java.util.*;
import java.util.Scanner;

public class QuotientRemainder {
		public static void main(String[] args) {
			
			try(Scanner input = new Scanner(System.in)){
			
				//To get the input from the User
			System.out.println("Enter an Integer number:");

			int dividend = input.nextInt(); 
			
			//To get the input from the User
			System.out.println("Enter an Integer number:");		
			int divider = input.nextInt();

			//To do the calculation
			int quotient = dividend / divider;
			int remainder = dividend % divider;
			
			//To print the values
			System.out.println("Quotient = " + quotient); 
			System.out.println("Remainder = " + remainder);

		}
}


class OddOrEven{
	public static void main(String args[]){
		int num;
		try(Scanner input = new Scanner(System.in)) {
		System.out.println("Enter an Integer number:");

//The input provided by user is stored in num Scanner input = new Scanner(System.in);
num = input.nextInt();

/* If number is divisible by 2 then it's an even number
* else odd number*/
if ( num % 2 == 0 )
	System.out.println("Entered number is even");
else
	System.out.println("Entered number is odd");
	}
}
}
