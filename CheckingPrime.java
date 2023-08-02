package javafullstack;
import java.util.*;
public class CheckingPrime {
			public static void main(String[] args) {
				try(Scanner reader = new Scanner(System.in)) {
					
				System.out.println("Enter a Number:");
				int number = reader.nextInt(); // Change this number to check for a different value
				
		        boolean isPrime = isPrimeNumber(number);
		        
		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
			}}
}
			 public static boolean isPrimeNumber(int num) {
			        if (num <= 1) {
			            return false;
			        }
			        
			        if (num <= 3) {
			            return true;
			        }
			        
			        if (num % 2 == 0 || num % 3 == 0) {
			            return false;
			        }
			        
			        for (int i = 5; i * i <= num; i += 6) {
			            if (num % i == 0 || num % (i + 2) == 0) {
			                return false;
			            }
			        }
			        
			        return true;
			 }
}
