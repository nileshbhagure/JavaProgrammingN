package javasessions.classandobject;

//method name should be camelCase

public class ClassFunctionMethod
{
   
   //data members: class vars & methods
  //can not create a method inside method
 // methods are independs or parallel to each other
 //3 types of methods
	
   //1. no input no return
	//void- does not return anything
	public void test()
	{
		System.out.println("test method");
	}
	
	// 2. no input and some return
	public String getName()
	{
		System.out.println("get name method");
		String n="Nil";
		return n;
		
	}
	
	public int add()
	{
		System.out.println("add no");
		int a=100;
		int b=200;
		int c=a+b;
		return c;
	}
	
	//3. some input and some return
	public int sum(int x, int y)  //input paratmer
	{
		System.out.println("sum method");
		int total=x+y;
		return total;
	}
	
	//WAF: getMarks->input param: StudentName (String)
	//return the student marks (int)
	//if st name is not found--return?
	
	public int getMarks(String studentName)
	
	{
	 System.out.println("getting student marks "+studentName );	
	 int marks=-1;
	 if(studentName.equals("Nil"))
	  {
	   //return 90;
		 marks=90;
	  }
	   else if (studentName.equals("har"))
	  {
		  //return 95;
		  marks=95;

	  }
	  
	  else if(studentName.equals("meet"))
	  {
		 // return 96;
		    marks=96;

	  }
	  
	  else
	  {
		  System.out.println("student name is not found..."+ studentName);
		  // return -1; // any -ve value should be return
			
	  }
	     return marks;
	  
	}
	
	public static void main(String[] args)
	{
		ClassFunctionMethod e=new ClassFunctionMethod();
		e.test();  //JVM will come inside the main method will create object of class & goes to method & execute it
	    
		String name=e.getName();
		System.out.println(name); //Nil
		
		int result=e.add();
		System.out.println(result);
		
		int tot=e.sum(10, 20); //arguments
		System.out.println("the total is " + tot);
		
	    int mar=e.getMarks("abv");
	   System.out.println(mar);
	    // int totalMarks=mar+5; //96+5=101  return will return value & after returning value we can perform additional operation
	   // System.out.println(totalMarks);//101
	}

}
