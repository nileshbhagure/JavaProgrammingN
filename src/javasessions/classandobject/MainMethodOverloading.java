package javasessions.classandobject;
//main method overloading- YES


public class MainMethodOverloading 
{
  
	//command line arguments
	
	
	//public static void main one string & array parameter name args
	//                      string- because it most commonly used & hold all type of data 
	public static void main(String[] args) 
	{
	// System.out.println(args.length);	
	 //System.out.println(args[0]);//AIOB Array index out of bound expection
     System.out.println("hi..");

     MainMethodOverloading.main(10);
     
	}

	
	public static void main()
	{
		System.out.println("bye");
		
	}
	
	public static void main(int i)
	{
		System.out.println("pop..."+i);
	}
	
	
	//another way to write main method signature
	//public static void main(String a[])
	//public static void main(

}
