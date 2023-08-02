package javafullstack;

public class PossibleInitial {
    public static void main(String[] args) {
    	 // Initializing primitive data types
        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 50000;
        long longValue = 100000L;
        float floatValue = 3.14f;
        double doubleValue = 2.71828;
        char charValue = 'A';
        boolean booleanValue = true;

        // Implicit type casting (Widening)
        int implicitInt = byteValue;
        long implicitLong = intValue;
        float implicitFloat = longValue;
        double implicitDouble = floatValue;
        int implicitChar = charValue; // Char to int (ASCII value)

        // Explicit type casting (Narrowing)
        short explicitShort = (short) intValue;
        byte explicitByte = (byte) shortValue;
        int explicitInt = (int) floatValue;
        long explicitLong = (long) doubleValue;
        char explicitChar = (char) intValue; // Int to char (Unicode value)

        // Output
        System.out.println("Implicit type casting:");
        System.out.println("byte to int: " + implicitInt);
        System.out.println("int to long: " + implicitLong);
        System.out.println("long to float: " + implicitFloat);
        System.out.println("float to double: " + implicitDouble);
        System.out.println("char to int: " + implicitChar);

        System.out.println("\nExplicit type casting:");
        System.out.println("int to short: " + explicitShort);
        System.out.println("short to byte: " + explicitByte);
        System.out.println("float to int: " + explicitInt);
        System.out.println("double to long: " + explicitLong);
        System.out.println("int to char: " + explicitChar);
	}
}
