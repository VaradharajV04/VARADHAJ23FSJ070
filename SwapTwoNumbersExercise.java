package javafullstack;

import java.util.*;

public class SwapTwoNumbersExercise {
		public static void main(String[] args) {
			
			//To get the value from the User
			
			try(Scanner reader = new Scanner(System.in)){
			System.out.println("Enter a float Value:");
			
			float first = reader.nextFloat(); 
			float second = reader.nextFloat();
			
			System.out.println("--Before swap--");
			System.out.println("First number = " + first); System.out.println("Second number = " + second);

			// Value of first is assigned to temporary
			float temporary = first;

			// Value of second is assigned to first first = second;

			// Value of temporary (which contains the initial value of first) is assigned to second
			second = temporary;

			System.out.println("--After swap--");
			
			System.out.println("First number = " + first); 
			
			System.out.println("Second number = " + second);

			}
		}
}
