package javafullstack;

import java.util.Scanner;

public class Basic1 {
			public static void main(String[] args) {
			
			//Input from the user
				try(Scanner sc = new Scanner(System.in)) {

				System.out.println("Enter value for i..:");

				int i= sc.nextInt();
				
				System.out.println("Enter value for j...:");

				int j= sc.nextInt();

				int mul=i*j;

				//Print the Multiplication of the number
				System.out.println("The Multiplication of i and j is..:"+mul);


			}
				
			}
			}

