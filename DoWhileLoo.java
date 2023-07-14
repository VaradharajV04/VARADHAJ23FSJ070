package javafullstack;

import java.util.*;
public class DoWhileLoo {
		public static void main(String[] args) {
			
			//To get the x value from the user
			System.out.println("Enter the value for X:");
			try(Scanner input = new Scanner(System.in)) {
			
			int x = input.nextInt();

			do {
			System.out.print("value of x : " + x ); x++;
			System.out.print("\n");
			}
			while( x < 11 );
		}
		}
		}