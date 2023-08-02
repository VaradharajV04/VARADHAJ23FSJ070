package javafullstack;

import java.util.*;
public class ResultCalculation {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of students: ");
	        int numOfStudents = scanner.nextInt();
	        
	        System.out.print("Enter the number of subjects: ");
	        int numOfSubjects = scanner.nextInt();
	        
	        int[][] marks = new int[numOfStudents][numOfSubjects];
	        
	        // Input marks for each student and subject
	        for (int i = 0; i < numOfStudents; i++) {
	            System.out.println("Enter marks for student " + (i + 1) + ":");
	            for (int j = 0; j < numOfSubjects; j++) {
	                System.out.print("Subject " + (j + 1) + ": ");
	                marks[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Calculate and display total and average marks
	        for (int i = 0; i < numOfStudents; i++) {
	            int total = 0;
	            for (int j = 0; j < numOfSubjects; j++) {
	                total += marks[i][j];
	            }
	            double average = (double) total / numOfSubjects;
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Total marks: " + total);
	            System.out.println("Average marks: " + average);
	            System.out.println();
	        }
	        
	        scanner.close();
	}
}
