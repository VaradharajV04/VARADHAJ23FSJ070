package mypack;
//GOOD JOB
import java.util.Scanner;

public class TypeConversion {
	/**
	* always provide a javadoc comment on every method and class
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter  A number....");
		
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
