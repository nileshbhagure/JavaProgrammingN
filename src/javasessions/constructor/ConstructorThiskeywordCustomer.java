package javasessions.constructor;

//creation of constructor shortcut right click->Source->Generate Constructor using fields
public class ConstructorThiskeywordCustomer 
{
	String name;
	int age;
	String city;
	String phoneno;
	
	//Create customers with different combinations
	//no default values type of customer
	
	/* This Keyword: 
	  -whenever we have constructor/local variable with same name class variable
	  -represents current class object
	  -we can access all the class variable without creating object
	  -we have to differientate class variable & local variable
	 */
	
	/*constructor used
	  - we are restriciting unneccessary construction of object
	  -constructor help to create object based upon data we have
	  -constructor are independent to each other where we cannot call one constructor within another(does not support constructor chaining

	method used
	- method we write bussiness logic but in construct we never write business logic
    -constructor alway used to intialized the object/class variable 
    - method alwys used for reusablity
	
	*/
	
	public ConstructorThiskeywordCustomer(String name)
	{
		//this goes to class name & assign value to local variable value name
		this.name=name; //class variable=local variable using this keyword
		
	}
	
	//constructor overloading
	public ConstructorThiskeywordCustomer(String name, int age)
	{
		this.name=name; 
		this.age=age;
		
	}
	
	
	public ConstructorThiskeywordCustomer(String name, int age, String city, String phoneno) {
	
		this.name = name;
		this.age = age;
		this.city = city;
		this.phoneno = phoneno;
	}

	public static void main(String[] args) 
	{
		ConstructorThiskeywordCustomer c1=new ConstructorThiskeywordCustomer("nilesh"); //calling 1 param const
		System.out.println(c1.name); //nilesh
	
		ConstructorThiskeywordCustomer c2=new ConstructorThiskeywordCustomer("nilesh", 32); //calling 2 param const
		System.out.println(c2.name +" " +c2.age);  //nilesh 32

		ConstructorThiskeywordCustomer c3=new ConstructorThiskeywordCustomer("nilesh", 32,"pune", "9898989988");
		System.out.println(c3.name + " "+c3.age+ " " +c3.city+" " +c3.phoneno);
		
		//fetching few values rest passing blank
		System.out.println(c3.name + " "+c3.phoneno);
	}

}
