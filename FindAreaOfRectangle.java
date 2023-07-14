package javafullstack;
import java.util.*;

class FindAreaOfRectangle {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)){
			//To get the input of the value from the user as *double*
			System.out.println("Enter the length of Rectangle:"); 
			double length = read.nextDouble(); 
			System.out.println("Enter the width of Rectangle:"); 
			double width = read.nextDouble();
			//Area = length*width;
			double area = length*width; 
			System.out.println("Area of Rectangle is:"+area);

		}
	}

}
