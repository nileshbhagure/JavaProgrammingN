package javasessions.classandobject;

public class Browser 
{

	// main method is always void in nature because JVM will search & executed pgm
	// for main method with signature PSVM

	// WAF: launch a browser: FF/CH/Safari
	// par: browser name
	// return: boolean: true/false

	public boolean launchBrowser(String brName) 
	{
		System.out.println("launching browser: " + brName);

		switch (brName.toLowerCase()) 
		{
		case "chrome":
			System.out.println("chrome is launched");
			return true;
			
		case "firefox":
			System.out.println("FF is launched");
			return true;

		case "safari":
			System.out.println("safari is launched");
			return true;

		default:
			System.out.println("please pass right browser.." + brName);
			return false;
		}
	}

	public static void main(String[] args)
	{
		Browser obj=new Browser();
		boolean b= obj.launchBrowser("Chrome");
	    System.out.println(b);
	    if (b)
	    {
	    	System.out.println("www.google.com");
	    }
	}

}
