package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{

		
	final int i=10; // onces variable declare as final data values cannot be changed
	//eg constant data in selenium- page title,image url, page url,default_timeout,
	//i=20;
	//System.out.println(i);
		
	final int days=7;
	//days=10; // cannot changes
	System.out.println(10*days); //70
		
	BMW b=new BMW();
	b.start();// overidden method called from BMW class
    b.stop();//inherited
    b.refuel();//inherited
    b.autoParking();//individual 
    b.engine();//overidden
    // b.engine();// calling grand parent Vehicle class method()
    
    //with the help of child class object accessing parent class variable/properites
    System.out.println(b.speed); // will call variable from car class o/p 100

    //sibling cannot access each other methods/proerities
    //b.theftSafety(); //not possible
    
    //Car.wheels=10; //changing the value of static variable 
    System.out.println(Car.wheels);
    
    System.out.println(BMW.wheels);//inheritance from parent class
    
    //Car will not able to inherites properities/methods from BMW class
	Car c=new Car();
	c.start();  //will call start() from Car class
	c.stop();   //will call stop() from Car class
	c.refuel();//will call refuel() from Car class
 	c.engine(); //calling grand parent Vehicle class method()
	
 	//Parent also cannot take anything for child
 	//C.theftSafety()// Car(Parent class)cannot inherited from child Audi class methods
 	
 	Vehicle v4=new Vehicle();
 	v4.engine();
 	
 	
 	
	//Child class object can be referred by paren t class ref variable
	/*top/up casting:
	  -those method are overridden & which are coming from parent class in the form of inherited
	   otherwise individual method we can not acess*/
	 //Reference Type check
	
	Car c1=new BMW();
	c1.start(); //child class method is call BMW start() method is call
	c1.stop();
	c1.refuel();
	
	
	
	//top casting using BMW with grand class vehicle
	Vehicle v1=new BMW();
	v1.engine();
	//v1.autoparking(); //grandparent cannot access properities of child- REFERENCE TYPE CHECK is fail
	
     
	//top casting using Car with grand class vehicle
      Vehicle v2= new Car();
      v2.engine();
	
	//Down casting- NO real life use case of downcasting
	//parent class object can be referred by child class ref variable
	//can we create parent class object & refere by child class variable- NO
	//BMW b1=(BMW)new Car();//classCastException
	
      //downcasting using parent- not possible
     //BMW b2=(BMW)new Vehicle(); //ClassCastException: 
	
	}
	
}
