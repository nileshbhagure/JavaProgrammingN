package javasessions.classandobject;

public class StaticMethodOverloading
{

	public static void printLogo(int i)
	{
		printLogo(i,20);  //directly calling below method
	}
	public static void printLogo(int a, int b)
	{
		System.out.println(a+b);
	}
	public static String printLogo(String name)
	{
		return name + "logo";
		
	}
	public static void main(String[] args) {
		String a=StaticMethodOverloading.printLogo("AMAZON");
        System.out.println(a);
        
        
        StaticMethodOverloading.printLogo(10);
	}

}
