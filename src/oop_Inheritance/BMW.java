package oop_Inheritance;

public class BMW extends Car
{
	int speed=200;
	static int wheels=2;
	
	/*
	 * method overriding - ploy+morphism(RunTime/Dynamic
	 * when you have a method in parent class & the same method in child class 
	 * -1.with the same method name
	 * -2.same no parameters
	 * -3. same return type
	 * 
	 * whichever methods are overridden writes infront @overide keyword
	 */
		
	// not mandtory but will know its overidden from parent
	
	
	@Override
	public void start()
	{
		System.out.println("BMW--start");
	}
	
	@Override
	public void engine()
	{
		System.out.println("BMW--engine");
	}
	
	public void autoParking()
	{
		System.out.println("BMW--auto parking");
	}
	
	//individual static method of BMW class
	//Method Hiding: we cannot overides static method but we can have own static method in child class,
	//           but when we have in same extact in parent class 
	//method hiding only applicable for static methods
	                  
	//method hiding
	public static void billing()
	{
		System.out.println("BMW--billing");
	}
}
