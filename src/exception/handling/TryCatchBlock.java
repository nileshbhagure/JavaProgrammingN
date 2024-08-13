package exception.handling;

import java.io.File;
import java.io.FileInputStream;

/*Exception
 *  - unwanted condition suddenly coming which caused program to be terminated
 *  - pgm is immediately shutdown by the JVM, application got crash
 * 
 *  Two Types of class 1. Exception 2. Error
 * Exception- Super class in java
 * - Mutiple class under exception like
 * Runtime- ArithemeticException, NullPointerException,classCastExpect, Indexoutofbound- Arrrayindexoutofboundexcept, StringIndexoutofboundException
 * IOExcept- EOFexcept,Filenotfoundexcept, interruptIOexcept,filenotfoundexcept
 * SQLExcept
 * AWTEExcept
 * InteruptedExcept
 * 
 * -code readablity when we mention particular type of exception
 * -Exception are occur due to the user program logic
 * 
 * 
 * Error- Errors are problems that mainly occur due to the lack of system resources.
 *   - VirtualMachineError- Stackoverflow, outofmememory
 *   -AssertionError
 *   -ExceptionInIntializeerror
 *   -IOError
 *   -AWTError
 *   
 *   -Throwable
 *   -Super class of both Error & Exception class
 *    -from readablity point not understandle as which type of exception it can throw

 * Two Type of Exception
 *  -Check & Uncheck
 * check- checked at compile type(aware of code & compiler is going to throw error called exception
 * unchecked- checked at runtime called error
 * 
 * - we can have mutiple try catch block in same class
 * -Every try block comes with catch block to handle exception
 * -mutliple catch block we can have with different type of Exception name
   
 */
public class TryCatchBlock {
	String name;

	public static void main(String[] args) 
	{
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
	//	compile time checked Exception
	//	Thread.sleep(4000);
	//   File file=new File("test.pgn");
	//  FileInputStream ip=new FileInputStream(file);
		
		try {	
			//int i=9/0;  //AE
			//the movement exception coming it will jump to catch block
			
			TryCatchBlock obj=new TryCatchBlock();
			obj=null;
			obj.name="nilesh"; //NullPointerException
			
			
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");

		}
		
		//it will come in catch blocking only if exception is coming
	
		//ArithmeticException- default class in java
		
		
		catch(ArithmeticException e)
		{
			System.out.println("AE is coming");
			e.printStackTrace();  //to print type of exception on console
		}
		//Reference name e can be same as scope is within the block
		catch(NullPointerException e)  
		{
			System.out.println("Null pointer is coming");
			e.printStackTrace();  //to print type of exception on console
		}
		
		
		// Error- is  class in Java. which is not done by user side/programming occurs unconditionally
		/*
		 * catch(Error e) {
		 * System.out.println("AE is coming");
			e.printStackTrace();
		 * 
		 * }
		 */
		
		
		//Super class of both Error & Exception class
		/* from readablity point not understandle as which type of exception it can throw
		 * catch(Throwable e) { 
		 * System.out.println("AE is coming"); 
		 * e.printStackTrace();
		 * }
		 */
		
		
		System.out.println("bye");

		
	}

}
