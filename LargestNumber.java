package javafullstack;

import java.util.*;
public class LargestNumber {
		public static void main(String[] args) {
			
			try(Scanner reader = new Scanner(System.in)){
			
				//To get the value for double from the user manually
			
				//Number one
			System.out.println("Enter First Number:");
			double n1 = reader.nextDouble(); 
			
			//Number two
			System.out.println("Enter Second Number:");
			double n2 = reader.nextDouble();
			
			//Number three
			System.out.println("Enter Third Number:");
			double n3 = reader.nextDouble();

			//For the number one is largest
			if( n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

			//For the number two is largest
			else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

			//For the number three is largest
			else
			System.out.println(n3 + " is the largest number.");

		}
}
}
