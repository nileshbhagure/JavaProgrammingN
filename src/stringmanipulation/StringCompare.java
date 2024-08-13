package stringmanipulation;

public class StringCompare {

	public static void main(String[] args)
	{
	  String t1="java";
	  String t2="java";
	  
	  //String value create with literal so compare & return true if compare from string constant pool
	  System.out.println(t1==t2);//True 
	  
	  //String value created with new keyword so it will compare with string constant pool & heap & return flase
	  String t3=new String("java");
	  System.out.println(t1==t3);// False 
	  System.out.println(t1==t3);// False  == checking reference

	  String t4=new String("java");
	  System.out.println(t3==t4);// False it will alwyas check reference so never used == operator instead use equal method
	  
	  System.out.println(t3.equals(t4));//true  checking the reference value/respectively values

	  System.out.println(t1.equals(t2));//true
	  
	}

}
