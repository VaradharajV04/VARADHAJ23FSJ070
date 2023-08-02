package javafullstack;

public class MatrixMethod {
		public static void main(String[] args) {
			int rows = 4;
	        int cols = 4;
	        
	        int[][] matrix = new int[rows][cols];
	        
	        int num = 1;
	        
	        // Populate the matrix
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = num++;
	            }
	        }
	        
	        // Display the matrix
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
		}
}
