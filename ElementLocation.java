package javafullstack;

import java.util.*;
public class ElementLocation {
		public static void main(String[] args) {
			int[] numbers = { 45, 23, 7, 98, 12, 65, 34 };
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the element to find: ");
	        int elementToFind = scanner.nextInt();
	        
	        int index = findElementIndex(numbers, elementToFind);
	        
	        if (index != -1) {
	            System.out.println("Element " + elementToFind + " found at index " + index);
	        } else {
	            System.out.println("Element " + elementToFind + " not found in the array.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static int findElementIndex(int[] array, int element) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == element) {
	                return i;
	            }
	        }
	        return -1; // Element not found
		}
}
