package javasessions;

/*String concatenation: merging two things
 * String is non-primitive: we need to create object
 * String is default class available in java which should start with Capital
 * String is collection of multiple character
 * string should be written with double quotes ""
 * String can be concenta with any type of data like char,double,int
 */
public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		System.out.println(a + b); // adding o/p 300

		String x = "hello";
		String y = "world";

		double d1 = 12.33;
		double d2 = 12.44;

		char c1 = 'a';
		char c2 = 'b';

		System.out.println(x + y); // o/p=helloworld + execution will start from left to right, will performed
									// concentation operator
		System.out.println(a + x); // o/p=100hello
		System.out.println(x + a); // o/p=hello100

		// execution will start from left to right
		System.out.println(x + y + a + b); // o/p helloworld100200

		System.out.println(a + b + x + y); // o/p 300helloworld
		System.out.println(x + y + (a + b)); // helloworld300

		System.out.println("hello world java");

		System.out.println("The value of a " + a);
		System.out.println("The value of b " + b);
		// string +sum will be concancentate
		System.out.println("The sum is " + (a + b)); // o/p The sum is 300

		System.out.println(a + b + x + y + a + b);// o/p 300helloworld100200
		System.out.println(a + b + x + y + (a + b)); // o/p 300helloworld300

		System.out.println(x + y + d1 + d2); // o/p helloworld12.3312.44
		System.out.println(x + c1); // o/p helloa

		System.out.println(x + y + (c1 + c2)); // helloworld195

	}

}
