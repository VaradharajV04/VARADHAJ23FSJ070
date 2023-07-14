package javafullstack;

import java.util.*;

public class PrintAsciiValue {
	public static void main(String[] args) {
		//To get the Char Value from the user
		
		try(Scanner sc = new Scanner(System.in)) {
		
		char ch = sc.next().charAt(50);
		int ascii = ch ;
		// You can also cast char to int
		int castAscii = (int) ch;
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		System.out.println("The ASCII value of " + ch + " is: " + castAscii);
		}
	}
}
