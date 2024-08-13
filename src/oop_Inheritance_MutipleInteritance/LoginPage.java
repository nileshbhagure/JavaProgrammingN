package oop_Inheritance_MutipleInteritance;

public class LoginPage extends Page {
	
	@Override // method overidden happen from parent class
	public void getColor()
	{
		System.out.println("Login----- orange color");
	}
	
	public void doLogin()
	{
		System.out.println("do login");
	}

}
