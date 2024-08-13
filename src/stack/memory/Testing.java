

package stack.memory;
// *to run pgm in debug mode first double click on line where you want till debug & then run as Debug->java appls

public class Testing {
	
	public void m1()
	{
		m2();	
		
	}
	
	public void m2()
	{
		m3();	
		
	}
	public void m3()
	{
		System.out.println("bye");	
		
	}

	public static void main(String[] args) 
	{
         Testing t=new Testing();
         t.m1();
        
	}

}
