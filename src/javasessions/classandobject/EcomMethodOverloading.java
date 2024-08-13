package javasessions.classandobject;

/*Method Overloading:Static(compile time[many]+morphism(form)
 *  Methods with same name with different parameter
  -happens within the same class when we have
    1. the same name
    2. the different no of paramaters
    3.the different sequence of the parameter
  
  -method with same name but different signature allowed
  
  uses of method overloading
  - easy to ready code
  - easy to debug the code
  -user friendly
 
 */
public class EcomMethodOverloading {

	public void test() // 0 param
	{
		System.out.println("test method");
	}

	public int test(int i) // 1 param
	{
		return 10 + i;
	}

	public void test(String k) // 1 param
	{

	}

	public void test(int p, String k) // 2 param
	{

	}

	public void test(String s, int p) // 2 param
	{

	}

	// overloading method eg for ecommerce app
	// login method() overloading

	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, int otp) {

	}

	public void login(String username, String password, String role) {

	}

	// Search method() overloading
	public void search() {

	}

	public void search(String productName, String color) {

	}

	public void search(String productName, String color, int price) {

	}

	// Payment method() overloading

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String paypalId, String pwd)

	{

	}

	// Uber:
	public void booking(String stLocation, String endLocation)

	{

	}

	public void booking(String stLocation, String endLocation, String carType)

	{

	}

	public void booking(String stLocation, String endLocation, String carType, String couponCode)

	{

	}

	public static void main(String[] args) {
		EcomMethodOverloading obj = new EcomMethodOverloading();
		obj.test(); // the decision is already taken by compilier which method to called so called
					// complie time polymorism
		int r = obj.test(20);
		System.out.println(r);// 30

		obj.booking("kopargaon", "mumbai", "SUV", "nilcoup");
	}

}
