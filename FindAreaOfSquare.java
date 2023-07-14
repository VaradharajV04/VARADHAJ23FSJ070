package javafullstack;
import java.util.*;

public class FindAreaOfSquare {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Side of Square:");
			//Capture the user's input
			
			//Storing the captured value in a variable
			double side = scanner.nextDouble();
			//Area of Square = side*side
			double area = side*side; 
			System.out.println("Area of Square is: "+area);

		}
}
