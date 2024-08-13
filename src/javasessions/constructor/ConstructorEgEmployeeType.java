package javasessions.constructor;

/*
 * Issue with creating multiple object
 * - create objected but did not access instant variable so unnecessary  object is present HEAP
 */
public class ConstructorEgEmployeeType 
{
	//Constructor- construct the object according to the requirement
	//-same name of the class name but function name can be anything
	//const- can not return anything but function may or may not be return
	//const- no void keyword
	//const..will be called when you create the object but function will be called with the obj ref
	//contructor cannot be static
	
	public void test() {
		System.out.println("test method....");
	}
	
	//const overloading
	ConstructorEgEmployeeType()  // 0 parameter
	{
		System.out.println("default constructor...");
	}
	
	ConstructorEgEmployeeType(int a)  // 1 parameter
	{
		System.out.println("1 parameter constructor...");

	}
	ConstructorEgEmployeeType(int a, String b)  // 2 parameter
	
	{
		System.out.println("2 parameter constructor..." +a +" " +b);
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorEgEmployeeType obj=new ConstructorEgEmployeeType(); //default constructor is called
		ConstructorEgEmployeeType obj1=new ConstructorEgEmployeeType(10); //1 parameter constructor is called
		ConstructorEgEmployeeType obj2=new ConstructorEgEmployeeType(10,"Nilesh"); //2 parameter constructor is called
		obj.test();  // calling non static method will obj reference
	}

}
