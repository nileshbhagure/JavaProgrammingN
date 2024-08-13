package stringmanipulation;

public class StringTest {
    /*String are immutable-we cannot change it values 
     *      -means String s1="selenium" so we can't changes selenium text valye
     *    
     * - String are stored in heap in String constant pool(SCP)
     * - literal are stored in Constant pool
     * - duplicate values are not stored in constant pool
     * -String s="hello selenium"; 
     *  String s1="hello selenium";
     *  both s & s1 will point to hello selenium- duplicate string are not allowed  
     * 
     */
	
	public static void main(String[] args) 
	{
		
      String x="hello selenium";
      x.concat("testing");
      System.out.println(x); //hello selenium
      
      String x1="hello selenium ";
      String y=x1.concat("testing");
      System.out.println(y); //hello selenium testing
      
      String t1="java";
      String t2="java";
      String t3="Java";

      String t4=new String("selenium");//2 object are created with new keyword 1 heap memory plus 1 stack
      String t5="selenium";// 0 object
      String t6="selenium";//0 object

      t5="ruby";
      System.out.println(t5); //ruby
      String t7=new String("selenium");  //heap(1)+SCP(0)
      
      String t8="selenium";
      
      String t9=new String("automation");
      System.out.println(t9+"naveen");  //automationnaveen

      
	
	}

}
