package javafullstack;

import java.util.*;

public class ArrayResizer {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();
	            arrayList.add(num);
	        }
	        
	        System.out.println("Elements in the array list: " + arrayList);
	        
	        scanner.close();
		}
}
