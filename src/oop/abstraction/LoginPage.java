package oop.abstraction;

public class LoginPage extends Page {

	//hidden -default constructor
	
	public LoginPage()
	{
		System.out.println("Lp-default const...");
	}
	
	public LoginPage(int i)
	{
		super(i);  //to call parent class constructor
		System.out.println("login page..const.."+i);
	}	
	
	//overridden method(title,url) from parent class Page
	@Override
	public void title() 
	{
		System.out.println("Login Page Title");
	}

	@Override
	public void url() 
	{
		System.out.println("Login Page Url");
	}
	
	

	public void resetPwd()
	{
		System.out.println("Login page Rest pswd");
	}
	
	public void dologin(String un, String pwd)
	{
		System.out.println("user name is " +un+ ": " +pwd);
	}
}
