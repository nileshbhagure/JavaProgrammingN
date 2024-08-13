package javasessions.classandobject;

/*
 * Static variable: we will create only one instance of that static member
 *                  that is shared across all instances/objects of the class.
 * common properites are declared static & shares among other object
 * used for memory mgmgt
 * Static only applicable for class variable
 * static variable value can be changed in pgm depending upon usage
 * 
 */

public class StaticVarEgCarType {
	String name;
	int price;
	String plateNumber;
	static int wheels = 4; // one copy is created in common memory allocation(CMA)- metaspace & shared
							// among all

	public static void main(String[] args) {
		StaticVarEgCarType c1 = new StaticVarEgCarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.plateNumber = "MH46A1640";

		StaticVarEgCarType c2 = new StaticVarEgCarType();
		c2.name = "audi";
		c2.price = 40;
		c2.plateNumber = "MH13230";

		StaticVarEgCarType c3 = new StaticVarEgCarType();
		c3.name = "maruti";
		c3.price = 10;
		c3.plateNumber = "MH12342";

		// how to access static variables:
		// 1. use the class name:
		//with the class name we can access those property which are static
		System.out.println(StaticVarEgCarType.wheels);

		// 2. direct access
		System.out.println(wheels);

		// 3 can i access static vars using obj ref? YES but not recommend gices warning
		// System.out.println(c1.wheels);

	}

}
