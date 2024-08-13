package javasessions.constructor;

public class AppTest {

	public static void main(String[] args) {
		// calling const from applicationSystem java class & passing data
		ApplicationSystem obj = new ApplicationSystem("amazon", "www.amazon.in", 20);

		// calling method from applicationsystem using object.method name of applicationsystem
		int c = obj.getPageCount(obj.name);
		System.out.println(c);// 20

		ApplicationSystem obj1 = new ApplicationSystem("flipkart", "www.amazon.in", 25);
		int d = obj1.getPageCount(obj1.name);
		System.out.println(d);// 15
	}
}
