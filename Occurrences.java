package javafullstack;

import java.util.*;
public class Occurrences {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();
        
        int occurrences = 0;
        
        System.out.print("Element found at locations: ");
        for (int i = 0; i < n; i++) {
            if (array[i] == elementToSearch) {
                occurrences++;
                System.out.print(i + " ");
            }
        }
        
        if (occurrences == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("\nTotal occurrences: " + occurrences);
        }
        
        scanner.close();
	}
}
