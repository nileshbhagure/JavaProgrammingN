package exception.handling;

/*Finally block code will execute always doesnt matter exception will come or not
 *  A try block without catch block is possible due to finally block
 *  duplicate finally block is not allowed
 *  A finally block will always work with Try catch block
    A finally block will only not execute in case of JVM shutdown        //System.exit(1);//Shutdown JVM

  used case of finally block
 user 1: nilesh
  
  //create a DB connection: un/pwd- Pass
  //hit a sql--pass
   try{
  //get the result- fail
 }
 catch{
 (SQLEXCEPTION)
 } 
  //store the result
  //print the result

user 2: nilesh
  
  //create a DB connection: un/pwd- Pass
  //hit a sql--pass
   try{
  //get the result- fail
 }
 catch{
 (SQLEXCEPTION)
 } 
  //store the result
  //print the result
   * 
   * 
 In order to close the connection we need to close the connection which we write close connection

 */
public class FinallyBlock {
	public static int getMarks(String stName)
    {
    	System.out.println("getting mark : "+stName);
    
    if(stName.equals("Tom"))
    {
    	try {
    	int i=9/0;
       //System.exit(1);//Shutdown JVM
       return 100;
    	}catch(ArithmeticException e)
    	{
    		System.out.println("AE is coming..");
    	    return 50;
    	}
    
      finally {
    	  
    	  System.out.println("i m in finally blocked"); // 10 will overide 50 
      }
    	
    	//return 100;
    }
    
    else if(stName.equals("peter"))
    {
     return 90;
    }
	
    
    else if(stName.equals("nil"))
    {
     return 80;
    }
    
    else {
    System.out.println("stname is not found...");
     return -1;
    }
   }

public static void main(String[] args) 
	{
	int m=getMarks("Tom");
	System.out.println(m);
	
	
	

/*
 * System.out.println("A");
 * 
 * try { int i=9/3; System.out.println("hello exception"); }
 * 
 * // A try block without catch block is possible due to finally block
 * 
 * catch(Exception e) { // e.printStackTrace();
 * System.out.println("AE is coming"); }
 * 
 * 
 * finally { System.out.println("I am in finally block");
 * 
 * }
 * 
 * // duplicate finally block is not allowed
 * 
 * 
 * finally { System.out.println("I am in finally block");
 * 
 * }
 * */
 
} 
  }
 
