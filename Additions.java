package javafullstack;

import java.util.Scanner;

public class Additions {
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		
		//TO GET THE INPUT FROM THE USER
		try (Scanner sc = new Scanner (System.in)) {
			int n = sc.nextInt();
			
			int m = sc.nextInt();
			
			System.out.println(n+"+"+m);
		
			
		//ADDITION OF TWO NUMBERS	
			int add = n + m;
		
		
		System.out.println("The sum is:" + add );
	}

	}

}