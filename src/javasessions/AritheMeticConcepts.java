package javasessions;

public class AritheMeticConcepts {

	public static void main(String[] args) {
		System.out.println(10 / 2); // o/p 5

		System.out.println(9 / 2); // o/p 4

		// any no written with point then will show o/p in point else roundof
		System.out.println(9 / 2.0); // o/p 4.5
		System.out.println(9.0 / 2.0); // o/p 4.5

		// both of integer so o/p will be given integer
		System.out.println(8 / 3); // o/p 2

		// both of float so o/p will be float integer
		System.out.println(9.0 / 4.0); // o/p 2

		// arithemetic exp purely design for integer
		//any integer no divide by 0
		// System.out.println(9/0); //arithemetic exception error divide by zero

		System.out.println(9.0 / 0); // Infinity
		System.out.println(0 / 9);// o/p 0 any no divide by is 0

		System.out.println(9 / 0.0); // Infinity
		// System.out.println(0/0);//arithemetic exception error divide by zero

		//any 0.0 divide with 0 will give NAN
		System.out.println(0.0 / 0); // o/p Nan Not a number
		System.out.println(0.0 / 0.0);// Nan
		System.out.println(0 / 0.0);// Nan

		System.out.println(9 / 9); //1
		System.out.println(100.2 / 0); //Infinity
		//System.out.println(100/0);// Arithmetic exep
		
		System.out.println(9%3);// modulus % operator gives reminder 0/p= 0
		System.out.println(9%2); //1
		System.out.println(11%2); //1
		System.out.println(17%3); //2
		
		//System.out.println(100/0 +"hello"); //Arthimetic exp
		System.out.println(100/2 +"hello"); //50hello
	
	   //Printing space with string
		String c1="hello";
	    String c2="World";
	    System.out.println(c1+ " "+c2); // hello World
	
	  //Printing space with char just give single quotes
	    String c="hello";
	    String d="World";
	    System.out.println(c+ ' '+d); // hello World
	
	}

}
