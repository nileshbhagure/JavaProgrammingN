package oop_encapsulation;

public class Browser 
{
 
	//creating a public layer(method) so we can access private method
	public void launchBrowser()
 {
	 System.out.println("launching browser...");
	 checkBrowserVersion();
	 checkOSCompatible();
	 checkOSCompatible();
	 enoughRAMSpace();
	 checkBrowsweUpdgrade();
	 System.out.println("Browser launch successfully..");
 }
 
	
	//declaring method as private as user no need to get info
	//hiding internal structure
	private void checkBrowserVersion()
 {
	 System.out.println("checkBrowserVersion...");
 }
	private void checkOSCompatible()
 {
	 System.out.println("checkOSCompatible...");
 }
	private void enoughRAMSpace()
 {
	 System.out.println("enoughRAMSpace...");
 }
	private void checkBrowsweUpdgrade()
 {
	 System.out.println("checkBrowsweUpdgrade...");
 }
 
}
