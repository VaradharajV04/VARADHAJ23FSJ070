package javafullstack;

import java.util.*;
public class Vowel {
		public static void main(String[] args) {
			
			//To get the manual from the user
			System.out.println("Enter a Alphabet:");
			try(Scanner reader = new Scanner(System.in)) {
			char ch = reader.next().charAt(0);

			//For the Vowel Value
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) 
				System.out.println(ch + " is vowel");
			
			//For the Vowel Consonant
			else
				System.out.println(ch + " is consonant");

		}
}
}
