package callbyreference;
/*Call by reference: when we call any spefic method by passing the object reference
 *  used cases: in pom we pass page object reference 
 * 
 * Call by value: when we call any spefic method by passing the value eg(10,20)
 * 
 */
public class CallByReference 
{

	String name;
	int age;
	
	public void getInfo(CallByReference t1)
	{
		t1.name="Nilesh";
		t1.age=32;
		
		sendMail(t1);   //passing reference to sendMail method
	}
	
	public void getInfo(String nameValue)
	{
		System.out.println(nameValue);
	}
	
	public void sendMail(CallByReference t2) {
		t2.name="Harshada";
		t2.age=35;
		
	}
	
	public static void main(String[] args) {
		CallByReference obj=new CallByReference();
		obj.name="Nilu";
	    obj.age=30;
	    
	    System.out.println(obj.name +" " +obj.age);  //Nilu 30
	    
	    //call by reference
	    obj.getInfo(obj);  //passing object reference(obj)
	    
	    System.out.println(obj.name +" " +obj.age);  //Nilesh 32 

	    //call by value
	    obj.getInfo(obj.name); //Harshada
	}

}
