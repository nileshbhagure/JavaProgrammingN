package oop_inheritance_interfaceeg;

public class FirefoxDriver implements WebDriver {

	  public FirefoxDriver()
	  {
		  System.out.println("launch Firefox browser");
	  }
		
		
	
	@Override
	public void get(String url) {
		System.out.println("launch url " + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on element " + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering to element " + value);
	}

	@Override
	public void close() {
		System.out.println("close the brows");
	}
}