package stringmanipulation;

/*String- Collection of mutiple characters 
         - A class in Java
 */
public class StringConcept {

	public static void main(String[] args) {

		//String can be created by 2 ways  1. by literal  2. by new keyword
		String str = "Hi this is my java code";  //string literals(directly value)
		
		//2. by new keyword- not recommended
		//String str=new String("hello");

		// length of string
		System.out.println(str.length()); // 23

		// position of char
		System.out.println(str.charAt(0)); // H
		System.out.println(str.charAt(22)); // e

		// last index of string
		System.out.println(str.charAt(str.length() - 1));// e

	   //System.out.println(str.charAt(23)); //StringIndexOutOfBound
	
	  // System.out.println(str.charAt(-1));//StringIndexOutOfBound
	
		
	//getting particular index of character
		System.out.println(str.indexOf('H'));  //0th position
		System.out.println(str.indexOf('i'));  //1th position -- 1st occurrence of i
		
	//hardcode to find particular occurance of i
	//System.out.println(str.indexOf('i',2));  //5
		
		//for occurance of alphabet
		System.out.println(str.indexOf('i',str.indexOf('i')+1)); //5 2nd occurance of i

		//position of a index
		System.out.println(str.indexOf("java"));//14 - java is starting from 14th index
		
		//if not find any string then java will return -1
		System.out.println(str.indexOf("ruby")); //-1
		
		String mesg="welcome admin";
		if(mesg.indexOf("admin")>=0)
				{
			System.out.println("correct");
				}
		else
		{
			System.out.println("incorrect");
		}
			
		
		//remove space from string- trim method will remove space from corner only from left & right side.
		//trim will not remove space inbetween string
		String s= "  hello   world  ";
		System.out.println(s.trim()); // hello  world
		
       //will ignore space from left/right string
	   String browser="chrome ";
       if(browser.trim().equals("chrome"))
       {
    	   
       }       
       
       //remove inbetween particular space between char
       //eg here to remove between space "hello world"
       String t="hello world";      
       System.out.println(t.replace(" ", ""));//helloworld remove all the space with nothing
       
       //replace all space with
       String strr="this   is   my  code";
       // //s represent space. + represent multipe space 
       System.out.println(strr.replaceAll("\\s+"," ")); //this is my java code
       
       
       //replacing - with /
       String dob="01-01-1990"; 
       System.out.println(dob.replace("-", "/")); //01/01/1990
  
       //to convert to capital letter
       String h="this is my java code";
       System.out.println(h.toUpperCase()); //THIS IS MY JAVA CODE

       //to convert to lower case   
       String l="THIS IS MY JAVA CODE";
       System.out.println(l.toLowerCase()); //this is my java code

	  //String comparsion:
       //equal case- extact comparison
       String m1="chrome";
       String m2="chrome";
       System.out.println(m1.equals(m2));  //True
       
	   //equal ingore case: will engore the upper/lower case & return boolean T/F
       String m3="chrome";
       String m4="Chrome";
       System.out.println(m3.equalsIgnoreCase(m4)); //True
       
	   //not good to used == for string. generally used for primitive data type
	   // if(str1==str2)
       
       //String Contains- to check particular char present in String
       String main="welcome to testing world";
       System.out.println(main.contains("testing"));//True
       
       
       
	}

}
