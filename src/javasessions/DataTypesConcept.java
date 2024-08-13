package javasessions;

/**
 * 
 * 
 * @author Nilesh Bhagure
 *
 */
public class DataTypesConcept

{

	public static void main(String[] args) {
		/*
		 * data types //Strict data type- if declared int then only int values allowed
		 * in java //1.Primitive data types: Size is fixed, no need create obj can be
		 * used directly inside the memory a. boolean type: boolean(true/false) b.
		 * Numeric type b.1: character type: char b.2: Integral type: b.2.1: Integer:
		 * byte, short, int, long b.2.2: Floating-point: float, double
		 * 
		 * 
		 * 
		 * //2. Non-Primitive - Size is not fixed eg class, String, Array, interface,
		 * abstract class
		 */
		// 1. Byte:
		// Size: 1 byte=8 bits
		// range: -128 to 127
		// 2^8

		byte b = 1;
		b = 10;
		System.out.println("The value of byte variable is " + b);

		byte b2 = -127;

		// 2. Short
		// Size: 2 byte= 2*8= 16 bits
		// range:-32768 to 32767

		short s = 10000;
		System.out.println("The value of short variable is" + s);
		short s1 = 1;
		System.out.println("The value of short variable is " + s1);

		// 3 int
		// size:4 bytes =4*8=32 bits
		// range:-214783648 to 214783647
		// -2^32 to 2^32-1

		int i = 121211;
		int p = 1;
		int e = 10;
		System.out.println(p + e);

		// 4 long : at the end may required to writel
		// size: 8 bytes= 8*8=64 bits
		// range:-2^64 to 2^64-1

		long num = 919112l;
		System.out.println("The value of long variable is " + num);

		// Floating point
		// 5. float : at the end mandatory to add f
		// size: 4 byte = 4*8= 32 bit
		float f = 12.33f;
		float f1 = (float) 3.44;
		System.out.println(f);
		System.out.println(f1);

		// 6. double
		// size: 8 bytes= 8*8= 64 bits

		double d = 12.3333d;
		System.out.println(d);
		double d2 = 10.1;
		double d3 = 23.44;
		System.out.println(d2 + d3);

		// 7 char - only single digit allowed
		// - start with single quote''
		// size: 2 byte= 16 bits
		//
		char c = 'a'; // asci value of a is 97
		char c1 = 'b'; // asci value of b is 98
		char c3 = 'A'; // asci value of A is 65
		char c2 = '$';
		char c4 = 'A';
		System.out.println(c);// a
		System.out.println(c4);// A
		System.out.println(c + c1); // 97+98=195
		System.out.println(c3 + c1);// 65+98=163
		System.out.println(c - c1);// 97-98=-1
		System.out.println(c * c1);// 97*98=9506
		char t = '4';
		char t1 = '0';
		System.out.println(t + t1);// based on ASCII 52+48=100
		System.out.println(t1);// 0
		// asci range a-z 97 to 122
		// A-Z 65 to 90
		// 0-9 48 to 57
		// will always give numeric values based on ASCII value

		// to print asci value of specific char
		System.out.println((int) c);// for variable no need to write single quote, asci value of 'a'=97
		System.out.println((int) 'b');// when we need to used value directly used single quote asci value of b= 98

		char gender = 'm';
		char currency = '$';

		// 8. Boolean: true/false
		// size=1 bit
		boolean b1 = true; // true/false= reserved keywords
		boolean bl1 = false;
		System.out.println(b1);
		System.out.println(bl1);

		boolean flag = true;
		System.out.println(flag); // true
	}
}
