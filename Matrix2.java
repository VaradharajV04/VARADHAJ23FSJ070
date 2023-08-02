package javafullstack;

import java.util.*;
public class Matrix2 {
	public static void main(String[] args) {
		
	int rows = 4;
    
    int[][] matrix = new int[rows][];
    
    int num = 1;
    
    // Populate the matrix
    for (int i = 0; i < rows; i++) {
        matrix[i] = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            matrix[i][j] = num++;
        }
    }
    
    // Display the matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}}