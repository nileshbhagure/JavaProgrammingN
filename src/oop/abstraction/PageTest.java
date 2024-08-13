package oop.abstraction;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp=new LoginPage(10); //parent class contructor will be call first. it will check whether any default constructor present in parent
		lp.displayLogo(); // we can inheritied but cannot be overriden
	    lp.title();
	    lp.url();
	    lp.resetPwd();
	    lp.dologin("nil@gmail.com", "admin123");
	    
	    //Page pg=new Page(); //NA we cannot create object of abstract class
	    
	    
	    //top casting
	    //child class object can be referred by abstract parent class ref variable
	    Page p=new LoginPage();  
	    
	    // All methods from page class i can access
	    p.displayLogo();
	    p.timeOut();
	    
	    //as well as overidden method from class class we can access
	    p.title();
	    p.url();
	    
	    
	    //Invidual method of child class(loginpage) we cannot access
	    //Reference type check will be fail here
	    //p.doLogin()
	    //p.resetPwd
	    
	    
	    //down casting: at compile time- not allowed as we cannot create object of abstract class
	    //parent class object referen by child class ref variable- NOT ALLOWED 
	    
	    
	}

}
