package javasessions.constructor;

public class ConstrucLoginPage {

	String username;
	String pswd;

	// hidden/default const is called by java

	public ConstrucLoginPage(String username, String pswd) {
		this.username = username;
		this.pswd = pswd;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username " + un);
		System.out.println("enter password " + pwd);
		System.out.println("click login button");
		System.out.println("user login successfully");

	}

	public static void main(String[] args) {

		ConstrucLoginPage obj = new ConstrucLoginPage("admin", "admin123");
		obj.doLogin(obj.username, obj.pswd);

		ConstrucLoginPage obj1 = new ConstrucLoginPage("seller", "seller123");
		obj.doLogin(obj1.username, obj1.pswd);

	}

}
