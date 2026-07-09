package examples;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// byte: 8-bit signed integer
        byte byteVar = 127;
        System.out.println("byteVar: " + byteVar);

        // short: 16-bit signed integer
        short shortVar = 32767;
        System.out.println("shortVar: " + shortVar);

        // int: 32-bit signed integer
        int intVar = 2147483647;
        System.out.println("intVar: " + intVar);

        // long: 64-bit signed integer
        long longVar = 9223372036854775807L;
        System.out.println("longVar: " + longVar);

        // float: single-precision 32-bit floating point
        float floatVar = 3.14F;
        System.out.println("floatVar: " + floatVar);

        // double: double-precision 64-bit floating point
        double doubleVar = 3.141592653589793;
        System.out.println("doubleVar: " + doubleVar);

        // boolean: true or false
        boolean booleanVar = true;
        System.out.println("booleanVar: " + booleanVar);

        // char: single 16-bit Unicode character
        char charVar = 'A';
        System.out.println("charVar: " + charVar);

        // Demonstrating casting
        // Casting int to byte (narrowing conversion)
        int intToByte = 127;
        byte castedByte = (byte) intToByte;
        System.out.println("Casted intToByte to byte: " + castedByte);

        // Casting double to int (narrowing conversion)
        double doubleToInt = 9.99;
        int castedInt = (int) doubleToInt;
        System.out.println("Casted doubleToInt to int: " + castedInt);

        // Casting int to double (widening conversion)
        int intToDouble = 100;
        double castedDouble = intToDouble;
        System.out.println("Casted intToDouble to double: " + castedDouble);

        // Casting char to int (getting ASCII value)
        char charToInt = 'B';
        int asciiValue = charToInt;
        System.out.println("ASCII value of charToInt: " + asciiValue);

        // Casting int to char
        int intToChar = 67;
        intToChar++;
        char castedChar = (char) intToChar;
        System.out.println("Casted intToChar to char: " + castedChar);
    }



	}


