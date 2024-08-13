package superkeyword;

public class BMW extends Car {
	int minSpeed=200;

public BMW()
{
	super(10);//In constructor super keyword should be 1st stmt in order to call parent class constructor but in method super keyword can be anywhere  
	System.out.println("BMW default constructor");

}
public BMW(int i)
{
	System.out.println("one param constructor");

}
	
public BMW(int i , String p)
{
	System.out.println("2 param constructor"+i +p);

}
	
	
	@Override
	public void getMileage()
	{
		System.out.println("BMW milegae is 20 ");
	    super.getMileage();// calling parent class method
	}

 
public void displaySpeed()
{
	System.out.println("BMW speed "+minSpeed); // child class BMW speed
	System.out.println("Car Speed "+super.minSpeed); //accessing parent class variable
}
	


}
