package javafullstack;
import java.util.*;

public class FindAreaOfTriangle {
		public static void main(String[] args) {
			//To get the size of the triangle 
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the width of the Triangle:");
			double base = scanner.nextDouble();

			System.out.println("Enter the height of the Triangle:");
			double height = scanner.nextDouble();

			//Area = (width*height)/2
			double area = (base* height)/2; System.out.println("Area of Triangle is: " + area);

		}
}
