package mypack;

import java.util.*;

public class AverageNumber {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Total count of the number to find the average:");
			
			int n = sc.nextInt();
			
			int sum = 0;
			
			System.out.println("Enter the number....");
			
			for (int i=0;i<n;i++) {
				sum += sc.nextInt();
				
			}
			double average = sum/(double)n;
			
			System.out.println("Average of n is  " +average);
		}
	}
}
