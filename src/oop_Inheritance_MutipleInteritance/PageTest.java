package oop_Inheritance_MutipleInteritance;

public class PageTest {

	public static void main(String[] args)
	{
		LoginPage lp=new LoginPage();
		lp.getColor(); //will call LoginPage color method 0/p Login----- orange color
		lp.doLogin(); //do login
		
		CardPage cp=new CardPage();
		cp.getColor();// CardPage does not have getcolor method so it will call method from parent Page Class method as Car o/p Page--Red Color
	}

}
