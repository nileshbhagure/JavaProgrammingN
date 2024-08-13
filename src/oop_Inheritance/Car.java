package oop_Inheritance;
/*Inheritance:Inherits
 * parents cannot inherit from child
 * sibling cannot inherit from each other
 * using extends keywords

 *Mutilevel inheritance eg
 */


public class Car extends Vehicle

{
	int speed=100;
	static final int wheels=4;   //Declaring with final so values cannot be changes in sub-class
	
	/*Final Keyword- 
	 * to prevent method overridding
	 * to prevent inheritance
	 * to provide the constant data
	 * 
	 * Private methods can not overidden
	 * Static methods can not overridden
	 * 
	 * - any method declare as final it cannot be overrided eg. logo method so nobody can overrides the logo method for other pages
	 * - if any class declare as final it cannot be parent then
	 * -any value declare with final data cannot changes
	 *
	 * Method hidding: 
	 * we cannot overides static method but we can have own static method in child class,
	       but when we have in same extact in parent class 
	       method hiding only applicable for static methods
	       eg void billing()from Car class
	 */
	
	

	public  void start()
	{
		System.out.println("car--start");
	}
	
	public void stop()
	{
		System.out.println("car--stop");
	}
	
	public void refuel()
	{
		System.out.println("car--refuel");
	}

	//@Override Static methods can not overridden
	public static void billing()
	{
		System.out.println("car--billing");
	}
	
}


