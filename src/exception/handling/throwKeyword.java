package exception.handling;
/*throw- 
       -if we want to throw our custom exception   
       - negative test case when we used to pass customoised msg
       -The Java throw keyword is used to throw an exception explicitly.
        -If we want to throw an exception manually, for this, Java provides a keyword throw.
        -Throw in Java is a keyword that is used to throw a built-in exception or a custom exception explicitly.
        -Using throw keyword, we can throw either checked or unchecked exceptions in java programming.
 
 
 * 
 * 
 * 
 * 
 * 
 */
public class throwKeyword 
{

	public static void main(String[] args) 
	{
	
	//usecase: reading data from file
	 String data=null;
	 
	 if(data==null)
	 {
	 try {
		 
	 //create object of exception class	
	 throw new Exception("NODATAFOUNDEXCEPTION");
	 }catch(Exception e){
		 System.out.println("data not found");
		 e.printStackTrace();
	 }
	 }
	 
	 System.out.println("bye");
	}

}
