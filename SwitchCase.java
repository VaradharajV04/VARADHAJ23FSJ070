package javafullstack;

import java.util.*;
public class SwitchCase {
		public static void main(String[] args) {
			
			//To get the value from the user 
			try(Scanner reader = new Scanner(System.in)){
			
			int tech = reader.nextInt();

			switch(tech){ case 1:
			{
			System.out.println("java");
			break;
			}
			case 2:{
			System.out.println("ES6");
			break;
			}
			default:{
			System.out.println("Not Listed..");

		}
}
		}
			}
		}
