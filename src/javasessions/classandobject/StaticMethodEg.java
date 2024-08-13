package javasessions.classandobject;

/*only variable & method can be static
 * class cannot be static
 * static method can be overloaded in java
 * but static method cannot be overiden
 * 
 */

public class StaticMethodEg {

	String name;
	int age;
	static String compName = "Amazon";

	public void sendMail() {
		System.out.println("send email");
	}

	public static void getInfo() {
		System.out.println("getInfo");
	}

	// returning from static method
	public static int getdetails() {
		System.out.println("getInfo");
		return 100;
	}

	public static void main(String[] args) {

		StaticMethodEg c = new StaticMethodEg();
		c.name = "Nilesh";
		c.age = 32;
		

		System.out.println("Name is " + c.name + " Age is " + c.age + " company name " + StaticMethodEg.compName);// static
		
		//Changing the value of static variable 																											// access
		//StaticMethodEg.compName="Apple";
		
		// classname.variablename
		// we can access directly from main method with name of variable but not good
		// practicr
		// System.out.println(compName);

		// how to access static methods:
		// 1. using class name
		StaticMethodEg.getInfo();

		// 2. calling directly;
		getInfo();

		// 3. using object ref?- yes..Gives warning not recommended
		// c.getInfo();

		// 4. how to access non static var & methods: we have to create the object
		c.sendMail();

		// 5. calling static method returning value
		int x = StaticMethodEg.getdetails();
		System.out.println(x); // 100

	}

}
