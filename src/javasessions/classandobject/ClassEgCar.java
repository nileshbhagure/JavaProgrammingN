package javasessions.classandobject;

public class ClassEgCar
{
    //instance/class variable
	
	String name;
	int price;
	String color;
	boolean isAutomatic;
	
	
	public static void main(String[] args) 
	{
		//create the object of the class using new keyword
      // c1 is object reference variable
	  // RHS side: new ClassEgCar() is the object & assigned to LHS c1
	  //object will be always becreated in Heap memory
	  //object reference always be created in stack memory
		
	  ClassEgCar c1=new ClassEgCar();
	  
	  c1.name="RangRover";
	  c1.price=40;
	  c1.color="white";
	  c1.isAutomatic=true;
	  System.out.println(c1.name +" " +c1.price + " " + c1.color + " "	+ c1.isAutomatic);

	  ClassEgCar c2=new ClassEgCar();
	  c2.name="Audi";
	  c2.isAutomatic=true;
	  
	  
	  System.out.println(c2.name); //null default value of string
	  System.out.println(c2.price);//0 default value of Integer
	  System.out.println(c2.color);// null default value of string
	  System.out.println(c2.isAutomatic);//false default value of boolean
	  
	  //No reference object- so 4 new object will be created not a good practise
	  new ClassEgCar(); //creating object but not giving name to it
	  new ClassEgCar().name="Tata";
	  new ClassEgCar().price=10;
	  new ClassEgCar().color="white";
	  new ClassEgCar().isAutomatic=false;
	  
	  //null reference object- earlier we were having reference but now object pointing towards null
	  
	  ClassEgCar t1=new ClassEgCar();
	  t1=null;  //pointing to null so will get NPE
//	  t1.name="BMW 5";
//	  System.out.println(t1.name);  //NPE Null Pointer Exception
	  
	  ClassEgCar t2=null;
	//  t2.name="Nil"; //NPE
	 // System.out.println(t2.name);
	  
	  
	  /*Garbage collector- JDK will send msg to GC to destroy object which points
	    to no reference or no reference
	    - GC will check only in Heap memory(not in stack) & destroy object so appl should not crashed
	    -Automatic mechanism will be done by JVM to invoked GC
	    - to call GC manually(programatically) we have method 
	      System.gc(); //mechanism to call JVM so JVM will invoked GC
	   - if issue comes on prod- dev take heapdump to check log & where issue occured 
	     */
	  
	  
	}
}
