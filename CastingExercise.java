package javafullstack;

import java.util.*;
public class CastingExercise {
	
	//Don't run this program - Just type and understanding how casting works
	public static void main(String[] args) {
	byte b=10;

	int i=b;// will accept - automatic type promotion

	byte c=i;// will not accept - because lower type cannot be put in higher
	
	byte d=(byte)i;// Type casting makes it possible to store compatible types.

	// To get the manual input from the users
	
	try(Scanner sc = new Scanner(System.in)){
	
	byte x = sc.nextByte() ;
	byte y = sc.nextByte() ;

	byte sum = x * y; // Error is thrown because when two bytes are used in a arithmetic operation, the result will be integer


}
}}