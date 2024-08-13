package superkeyword;
/*Super keyword: always point to super class object
 * 3 use case
   * when we have common variable between parent & child in order to access parent class properites we used super keyword
   * when we have overriden a method from parent to child when we want to access parent class method. super.methodname can be declared anywhere in method 
   * calling the parent class constructor from child class constructor. super should be first stmt 
 * when we have common properites between parent & child in order to access parent class properites we used super keyword
 * Non-static we can access using Super keyword
 * In constructor super keyword should be 1st stmt in order to call parent class constructor but in method super keyword can be anywhere 
 *  calling the parent class constructor
 *  calling the parent class properties
 * There is no way to call grand child constructor to be called
 * 
 */
public class Car extends Vehicle {

	int minSpeed=100;
	
	//hidden class Car() constructor
	
	
	public Car()
	{
		System.out.println("default constructor ");
	}
	
	public Car(int i)
	{
		super();//calling the parent class Vehicle constructor 
		System.out.println("one param constructor ");
	}
	
	public Car(int i,String p)
	{
		System.out.println("2 param constructor " +i +p);
	}
	
public void displaySpeed()
{
	System.out.println(minSpeed);
}

public void getMileage()
{
	System.out.println("car milegae is 15 ");
}
}
