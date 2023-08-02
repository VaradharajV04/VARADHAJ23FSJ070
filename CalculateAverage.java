package javafullstack;

import java.util.*;

public class CalculateAverage {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        double[] numbers = new double[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        double average = calculateAverage(numbers);
        
        System.out.println("Average: " + average);
        
        scanner.close();
    }
    
    public static double calculateAverage(double[] array) {
        double sum = 0;
        
        for (double num : array) {
            sum += num;
        }
        
        return sum / array.length;
    }
}
