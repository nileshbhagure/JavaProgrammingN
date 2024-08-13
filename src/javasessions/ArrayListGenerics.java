package javasessions;
import java.util.ArrayList;

/*ArrayList with Generics
 - In arraylistdynamic we were able to add raw type of data any datatype(int, string, double)
 - TO avoid this we specific type of array 
 - so if declared integer int then only integer value we can add
 - if array declared as Object we can add mixed type of data

*/
public class ArrayListGenerics {

	public static void main(String[] args) 
	{
		//Only Integer type of data we can add
		ArrayList<Integer> marksList=new ArrayList<Integer>();
	    marksList.add(100);
	    marksList.add(10);
	    
	    
	    //Only double type of data we can add
	    ArrayList<Double> dmiList=new ArrayList<Double>();
	    dmiList.add(10.20);
	    dmiList.add(20.22);
	    
	    //for string
	    ArrayList<String> empNameList=new ArrayList<String>();
	    empNameList.add("Nilesh");  //0
	    empNameList.add("Harshada"); //1
	    empNameList.add("Nil"); //2
	    empNameList.add("100");//3
	    
	    System.out.println(empNameList.size());//4
	    
      System.out.println("-----for index---------");
      for(int i=0; i<empNameList.size(); i++)
      {
    	  System.out.println(empNameList.get(i));
      }
	    
      
      System.out.println("--Print using -for each loop--");
      for(String e: empNameList)
      {
		System.out.println(e);
	  }

     //AC:
     //design a list of employee data:
      //name(String), age(int), salary(double), isPerm(boolean),gender(char)
      
      //Storing different type of data
      ArrayList<Object> empData=new ArrayList<Object>();
      empData.add("Nilesh");
      empData.add("25");
      empData.add("10000");
      empData.add(true);
      empData.add("Male");
    
      System.out.println("---printing data value using Object Datatype");
      for(Object o:empData)
      {
    	  System.out.println(o);
      }
      
}
	
}
