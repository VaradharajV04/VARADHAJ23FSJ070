package javafullstack;

public class NestedSwitchCase {
		public static void main(String[] args) {
			int tech = 2;
			int course = 2;
//To switch the course by nesting loop program
			switch(tech){ case 1:
			System.out.println("python");
			break; case 2:
			switch(course){ case 1:
			System.out.println("J2EE");
			break;
			case 2:
			System.out.println("advance java");

		}
}
		}
}
