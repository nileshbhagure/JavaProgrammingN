package javasessions;

public class TypeCasting {

	public static void main(String[] args) {

		/*
		 * TypeCasting- 2 types of type casting 1.widening 2. Narrowing 
		  1.widening-
		  -process of conversion of lower data types to higher data types -small to big
		   -auto conversion will be done by java
		 */

		byte b = 2;
		short s = b;
		int i = b;
		long l = b;
		System.out.println(b); //2
		System.out.println(s); //2
		
		// 2. Narrowing
		  // process of conversion of higher data type into lower data type
		  //  auto conversion is not done we need to do
		  int p=100;
		 // short s1=p; //will give error can convert int to short
		 // to resolved this we need to mention data type
         short s1=(short)p;
         byte b1=(byte)p;
         System.out.println(s1); //100
         System.out.println(b1); //100
         
         
         byte m1=100;
         byte m2=114;
        // byte t=m1+m2; // error cannot convert int to byte
         int r=m1+m2;  
         byte t=(byte)(m1+m2);
         System.out.println(t);
         System.out.println(r);
       
         char c=97;
         System.out.println(c); //a asci value 97=a
         System.out.println(c+'b');//195
         
		  
		  
		
		  
	
	}

}
