package dataconversion;

import java.util.Arrays;

/*Wrapper Classes-
 * -Wrap on Primitive data type
 * whenever you are getting numberic value as string we need to convert into integer
 *  int-> Integer (on top of int)
 * we can convert only those which are pure integer value
 * 
 * 
 */
public class DataConversion 

{

	public static void main(String[] args) 
	{
	
 //1.String to int:
    //int-> Integer (on top of int)
     String x="100";
     System.out.println(x+20);//10020 it will be concanted

     //int -->Integer
     //convert string to integer using Wrapper class Integer
     int i=Integer.parseInt(x);
     System.out.println(i);//100
     System.out.println(i+20);//120
     
   //  String y="100A";
  //   System.out.println(y+20);//100A20
  //   int j=Integer.parseInt(y); // we cannot used parseint with alpha number value.
     //should always be numeric value not alpha numerica
   //System.out.println(j);// NumberFormatException 
	
	
	//2. String to double
     String t="12.33";
     System.out.println(t+20);//12.3320  wrong it has concanted 
     
     //double-->Double
     double t1=Double.parseDouble(t);
     System.out.println(t1); //12.33
     System.out.println(t1+20);//32.33
     
     
     //3. int to String
     int pop=100;
     System.out.println(pop+20); //10020
     
     int totalBill=pop+50-10;
     System.out.println(totalBill);  //140
     
     //converting int to string- using Valueof method()
    String Amount=String.valueOf(totalBill);
    System.out.println(Amount); //140
    
    //double to string
    double avg=12.33;
    String newAvg=String.valueOf(avg);
    System.out.println(newAvg + 1000);//12.331000

   // String to Boolean
    String headless="false";
    boolean flag=Boolean.parseBoolean(headless);
    
    if(flag=Boolean.parseBoolean(headless))
    {
    	System.out.println("run in headless mode");
    }
    else
    {
    	System.out.println("run in normal mode");

    }
    
    //boolean to string
    boolean test=true;
    String p=String.valueOf(test);
    System.out.println(p+20);//true20
    
    
    //Split      0     1     2      3
    String top="java_python_ruby_dotnet";
    String arr[]=top.split("_"); //on basis hypen it will convert into string array
    System.out.println(arr[0]); //java
   // System.out.println(arr[4]); //AIOB

          //     0  1        2        3             4 
    String foo="xXtestingXxXseleniumxXXautomationXxXjava";
    String f[]=foo.split("xX");
    
    System.out.println(f[0]);//nothing as xX is 0th position is splited
    System.out.println(f[0].length()); //0
    System.out.println(f[1]); //testingX
    System.out.println(f[2]); //selenium
    System.out.println(f[3]); //XautomationX                         //XautomationX
    System.out.println(f[4]);//java
  //System.out.println(f[5]);//AIOB
	
	String lol="HelloJavaAutomationJavaTesting";
	String l[]=lol.split("Java");
	System.out.println(Arrays.toString(l)); //[Hello, Automation, Testing]

	//from from getting data
	String empData="Nilesh;Bhagure;nil@gmail.com;nil123;220491";
	String data[]=empData.split(";");
	
	for(String e: data)
	{
		System.out.println(e); //Nilesh Bhagure nil@gmail.com nil123 220491
	}
		
	//
	String lg="hello   selenium java";
	String lk[]=lg.split("\\s+");
	System.out.println(Arrays.toString(lk)); //[hello, selenium, java]

	}
    
}


