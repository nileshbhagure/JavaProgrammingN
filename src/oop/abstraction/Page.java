package oop.abstraction;
/*Abstract method
 *  -A method which has no method body
 * 
 * 
 * Abstract class
 *  -can not create the object of abs class
 *  - can have abs+ non abs method in abs class
 * - Abstract method need to be implemented in child class
 * - can we create object of abs class? No
 *    - but we can call using object creating from child class
 * - Not mandtory to have atleast one abstract method in abstract class
 * - By default, default constructor is added by java
 * - If we have paratermised constructor then implictly we need to write default constructor
 *  -A calling preferenced will be always be given to parent class default constructor
 *  
 *  In short
 *   1. No(zero) abs..method-> yes 0% abstraction
 *   2. only abs method->yes 100% abstraction
 *   2. abs+ non abs method->yes  partial anstraction
 *   
 *   Interface
 *   - 100% abstraction
 *  
 *  
 * Super Keyword
 *  - to call parent class constructor we used super keyword
 *  - should be first stmt in child class
 */


public abstract class Page {
	
	//Always go to default constructor
	public Page()
	{
		System.out.println("page..default..constr");
	}
	
	public Page(int i)
	{
		System.out.println("page..const.."+i);
	}
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut()
	{
		System.out.println("page timeout - 20 sec");
	}

    public final void displayLogo()     // declare method as final so it cannot be overidden
    {
    	System.out.println("page-displayedlogo");
    }
}
