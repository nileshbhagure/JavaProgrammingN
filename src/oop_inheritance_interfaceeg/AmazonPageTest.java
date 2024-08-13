package oop_inheritance_interfaceeg;

public class AmazonPageTest {
    static WebDriver driver;


	public static void main(String[] args)
	{
		//chrome
		//firefox
		//Safari
		
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		String browser="FF";
		switch (browser) {
		case "chrome":
			  driver=new ChromeDriver();
			break;
			
		case "FF":
			  driver=new FirefoxDriver();
			break;
			
		case "safari":
				  driver=new SafariDriver();
					break;
		default:
			System.out.println("pls pass right browser "+browser);
			break;
		}
	    
	    
	    
	    
	    //Top Casting
		//WebDriver driver=new ChromeDriver();
	
		
		driver.get("www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.sendKeys("email", "nil@gmail.com");
		driver.click("loginBtn");
		driver.close();
	}

}
