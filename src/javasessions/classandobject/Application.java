package javasessions.classandobject;

import java.util.ArrayList;

public class Application 
{

	public double getNumber(double d1, double d2) //paratamer
	{
		double d=d1+d2;
		return d;	
		
	}
	
	//WAF: getDevicesList(empName);
	//param: empName(String)
	//return: List of devices-->ArrayList
	
	  public ArrayList<String> getDevicesList(String empName)
	  {
		 System.out.println("getting device list for " +empName);
		 ArrayList<String> devicesList=new ArrayList<String>();
		 
		 if(empName.equalsIgnoreCase("Nilesh"))
		 {
			 devicesList.add("Iphone 14");
			 devicesList.add("mac");
			 devicesList.add("ipad");
		 }
		 
		 
		 else if(empName.equalsIgnoreCase("Harshada"))
		 {
			 devicesList.add("Iphone 11");
			 devicesList.add("window");
			 devicesList.add("ipad");
			 devicesList.add("speaker");

		 }
		 
		 else if(empName.equalsIgnoreCase("meet"))
		 {
			 devicesList.add("Iphone mini");
			 devicesList.add("mac");
			 devicesList.add("ipad");
		 }
		 
		 else
		 {
			 System.out.println("emp not found " +empName);
		 }
		 
		   return devicesList;
	  }			
	
	
	public static void main(String[] args)
	{
		Application obj=new Application();
		
		double num=obj.getNumber(1.1, 1.2);// Call by Value
		
        System.out.println(num);
        
        
        ArrayList<String> a1= obj.getDevicesList("nilesh");
        System.out.println(a1);
        System.out.println("total devices: "+a1.size());  //print no of devices
	}

}
