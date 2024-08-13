package stringmanipulation;
/*String: String are immutable- once create cannot changed. whenever we add/modify a new string is created in memory
 * 
 * * 
 * StringBuffer: Mutable, Not used now
 * - thread safe: each & every thread will come one by one. onces thread no 1 work is done then thread no 2 will come to access particular object
 * -Synchronized
 * -Since java 1.0
 *- Slower
 * 
 * StringBuilder: Its Mutable- can be changed. whenever we tried to add/append its modify existing string in memory
 * -Not Thread Safe: each thread(user) will acess object will access whenever needed which makes faster executions
 * -Not Synchronized
 * -Since java 1.5
 * -Faster
 
 * 
 */

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {

	StringBuilder sb=new StringBuilder("hello ");	
	sb.append("selenium");
	
	System.out.println(sb);//hello selenium  changes are made to existing string & appnending done to exisiting string
	
	//reverse string
	System.out.println(sb.reverse());// muineles olleh
	
	StringBuffer sb1=new StringBuffer("hello ");	
//String constant pool is not made for Stringbuffer & StringBuilder
//we cannot create string literal for Stringbuilder/StringBuffer 
//	StringBuffer sb2="hello";
	sb1.append("testing");
	System.out.println(sb1);//hellotesting
	
//for string its unmutable
	String x="hello";
	x.concat("world");
	System.out.println(x);//hello
	
	//x.reverse not available for string as string are immutable(we cannot changes it value)
	
	}

}
