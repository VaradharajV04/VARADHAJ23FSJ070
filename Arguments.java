package javafullstack;

public class Arguments {
		public static void main(String[] args) {
			 // Check if any arguments were passed
	        if (args.length == 0) {
	            System.out.println("No command-line arguments provided.");
	        } else {
	            System.out.println("Command-line arguments:");
	            for (int i = 0; i < args.length; i++) {
	                System.out.println("Argument " + (i + 1) + ": " + args[i]);
	            }
	        }
		}
}