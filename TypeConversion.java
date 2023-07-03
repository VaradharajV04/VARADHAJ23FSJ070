package mypack;

import java.util.Scanner;

public class TypeConversion {
	public static void main(String[] args) {
		
		System.out.println("Enter An Integear Number....");
		
		try(Scanner sc = new Scanner (System.in)) {
			int i = sc.nextInt();
			long l = i;
			float f = l;
			
			System.out.println("Int Value "+i+"....");
			System.out.println("Long Value "+l+"....");
			System.out.println("Float Value "+f+"....");
		}
	}
}
