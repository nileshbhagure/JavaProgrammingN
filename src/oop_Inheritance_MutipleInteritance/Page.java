package oop_Inheritance_MutipleInteritance;

public class Page extends Web
{
    @Override
	public  void getColor()
	{
		System.out.println("Page--Red Color");
	}
	
    public void getPageLoadTimeOut()
    {
    	System.out.println("page--20 secs");
    }
    
}
