package javafullstack;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); System.out.print("Enter a number: ");
		int num = reader.nextInt();
		
		//For even number test
		if(num % 2 == 0)
		System.out.println(num + " is even");
		
		//For odd number test
		else
		System.out.println(num + " is odd");

	}
}
