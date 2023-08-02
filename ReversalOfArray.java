package javafullstack;

import java.util.*;

public class ReversalOfArray {
		public static void main(String[] args) {
			int[] numbers = { 45, 23, 7, 98, 12, 65, 34 };
	        
	        System.out.println("Original array: " + Arrays.toString(numbers));
	        
	        reverseArray(numbers);
	        
	        System.out.println("Reversed array: " + Arrays.toString(numbers));
	    }
	    
	    public static void reverseArray(int[] array) {
	        int left = 0;
	        int right = array.length - 1;
	        
	        while (left < right) {
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            
	            left++;
	            right--;
	        }
		}
}
